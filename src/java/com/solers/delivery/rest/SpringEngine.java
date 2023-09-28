package com.solers.delivery.rest;

import java.util.List;
import org.restlet.engine.connector.ClientHelper;
import org.restlet.engine.*;
import org.restlet.engine.connector.ServerHelper;
//import org.restlet.engine.authentication.AuthenticationHelper;
import org.restlet.engine.security.AuthenticatorHelper;


public class SpringEngine {
  private final Engine instance = Engine.register(false);
  
  public void setRegisteredClients(List<ClientHelper> helpers) {
    this.instance.getRegisteredClients().addAll(helpers);
  }
  
  public void setRegisteredServers(List<ServerHelper> helpers) {
    this.instance.getRegisteredServers().addAll(helpers);
  }
  
  /*public void setRegisteredAuthentications(List<AuthenticationHelper> helpers) {
    this.instance.getRegisteredAuthentications().addAll(helpers);
  }*/
  
  public void setRegisteredAuthentications(List<AuthenticatorHelper> helpers) {
    this.instance.getRegisteredAuthenticators().addAll(helpers);
  }
  
}

//