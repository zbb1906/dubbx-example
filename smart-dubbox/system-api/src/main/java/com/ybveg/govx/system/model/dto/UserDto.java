package com.ybveg.govx.system.model.dto;

import com.github.tj123.common.BaseDto;
import com.ybveg.govx.system.model.po.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDto extends BaseDto<User>{

  private String id;

  private String enable;

  private String userType;

  private String realName;

  private String userName;

  private String password;

  private String phoneNumber;

  private String deptId;

  private String email;

  private Date createTime;

  private Date lastLoginTime;
}