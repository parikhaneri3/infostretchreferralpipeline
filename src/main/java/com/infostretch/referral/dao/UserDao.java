package com.infostretch.referral.dao;

import java.util.List;

import com.infostretch.referral.entity.User;
import com.infostretch.referral.exception.RESTServiceException;

public interface UserDao extends GenericDao<User> {

  /**
   * give the user id by username and password.
   *
   * @param uername
   *          the uername
   * @return the user id byusername
   * @throws RESTServiceException
   *           the REST service exception
   */
  Integer getUserIdByusername(String username) throws RESTServiceException;

  List<User> getUsersByUsernamePassword(String username, String password)
      throws RESTServiceException;
}
