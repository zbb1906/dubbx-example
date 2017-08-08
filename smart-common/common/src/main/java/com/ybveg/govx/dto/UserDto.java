package com.ybveg.govx.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * @auther zbb
 * @create 2017/8/2
 */
@Getter
@Setter
public class UserDto implements Serializable {

  private static final long serialVersionUID = -1646397150077018363L;

  //用户id
  private String id;
  //用户名
  private String username;
  //部门ID

  private String deptId;
  //数据编码
  private String dataCode;
}
