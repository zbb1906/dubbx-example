package com.ybveg.govx.mvc;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * @auther zbb
 * @create 2017/8/9
 */
@Getter
@Setter
public class SessionModel implements Serializable {

  public final static String KEY = "_SESSION_KEY";

  private static final long serialVersionUID = -1545525454842567744L;

  private String id;
  private String username;
  private String realname;
  private String dpName;
  private String dpCode;
  private String areaCode;
  private String type;
}
