package com.ybveg.govx.mvc;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @auther zbb
 * @create 2017/8/10
 */
public abstract class BaseController {

  @Autowired
  HttpServletRequest request;

  SessionModel getCurrentSession() {
    Object obj = request.getAttribute(SessionModel.KEY);
    return obj != null ? (SessionModel) obj : null;
  }
}
