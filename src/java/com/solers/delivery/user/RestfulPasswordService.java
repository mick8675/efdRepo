package com.solers.delivery.user;

import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.data.Status;

import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.converter.AdminConverter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RestfulPasswordService extends RestfulService implements PasswordService {

    private final AdminConverter converter;

    public RestfulPasswordService(String host, int port, RestAuthentication auth, AdminConverter converter) {
        super(host, port, auth);
        this.converter = converter;
    }

    @Override
    public String getPassword(String username) {
        Response response = get("admin/password/" + username);
        if (response.getStatus().equals(Status.CLIENT_ERROR_NOT_FOUND)) {
            return null;
        }
        Object[] values=null;
        try {
            values = (Object[]) converter.convert(response.getEntity());
        } catch (IOException ex) {
            Logger.getLogger(RestfulPasswordService.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (values == null) {
            return null;
        }
        return (String) values[0];
    }

    @Override
    public void changePassword(String username, String oldpassword, String newPassword) {
        String[] pws = new String[]{oldpassword, newPassword};
        Response response = put(converter.to(MediaType.TEXT_XML, pws), "admin/password/" + username);
        Utils.checkForException(response);
    }

    @Override
    public boolean isPasswordExpired(String username) {
        Object[] values=null;
        try {
            values = (Object[]) converter.convert(get("admin/password/" + username).getEntity());
        } catch (IOException ex) {
            Logger.getLogger(RestfulPasswordService.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (values == null) {
            return false;
        }
        return (Boolean) values[1];
    }

    @Override
    public void updatePassword(String username, String newPassword) {
        String[] pws = new String[]{newPassword};
        Response response = put(converter.to(MediaType.TEXT_XML, pws), "admin/password/" + username);
        Utils.checkForException(response);
    }
}


/*package com.solers.delivery.user;

import org.restlet.data.MediaType;
import org.restlet.Response;
import org.restlet.data.Status;

import com.solers.delivery.rest.RestfulService;
import com.solers.delivery.rest.Utils;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.converter.AdminConverter;


public class RestfulPasswordService extends RestfulService implements PasswordService {

    private final AdminConverter converter;
    
    public RestfulPasswordService(String host, int port, RestAuthentication auth, AdminConverter converter) {
        super(host, port, auth);
        this.converter = converter;
    }
    
    @Override
    public String getPassword(String username) {
        Response response = get("admin/password/", username);
        if (response.getStatus().equals(Status.CLIENT_ERROR_NOT_FOUND)) {
            return null;
        }
        Object [] values = (Object[]) converter.convert(response.getEntity());
        if (values == null) {
            return null;
        }
        return (String) values[0];
    }

    @Override
    public void changePassword(String username, String oldpassword, String newPassword) {
        String [] pws = new String[] { oldpassword, newPassword };
        Response response = put(converter.to(MediaType.TEXT_XML, pws), "admin/password/", username);
        Utils.checkForException(response);
    }

    @Override
    public boolean isPasswordExpired(String username) {
        Object [] values = (Object[]) converter.convert(get("admin/password/", username).getEntity());
        if (values == null) {
            return false;
        }
        return (Boolean) values[1];
    }

    @Override
    public void updatePassword(String username, String newPassword) {
        String [] pws = new String[] { newPassword };
        Response response = put(converter.to(MediaType.TEXT_XML, pws), "admin/password/", username);
        Utils.checkForException(response);
    }
}
*/