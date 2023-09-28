package com.solers.delivery.rest.admin;

import com.solers.delivery.domain.User;
import com.solers.delivery.rest.BaseEnableResource;
import com.solers.delivery.user.UserService;
import org.restlet.representation.Representation;


public class EnableUserResource extends BaseEnableResource<User> {
    
    private final UserService service;
    
    public EnableUserResource(UserService service) 
    {
        this.service = service;
    }
    
    @Override
    protected void disable(User item) 
    {
        service.disable(item.getId());
    }

    @Override
    protected void enable(User item) {
        service.enable(item.getId());
    }

    @Override
    protected User lookup(long id) {
        return service.get(id);
    }

    //@Override
    public String getAttribute(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    //@Override
    public Representation handle() {
        throw new UnsupportedOperationException("Not supported yet."); }

    //@Override
    public void setAttribute(String string, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
