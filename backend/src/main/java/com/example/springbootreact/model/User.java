package com.example.springbootreact.model;

import java.io.Serializable;

/**
 * Created by Cesar Chavez.
 */
public class User implements Serializable {
  private String userName;
  private String token;
  private boolean authenticated;

  public User() {
  }

  public User(String userName, String token, boolean authenticated) {
    this.userName = userName;
    this.token = token;
    this.authenticated = authenticated;
  }

  public String getUserName() {
    return userName;
  }

  public String getToken() {
    return token;
  }

  public boolean isAuthenticated() {
    return authenticated;
  }
}
