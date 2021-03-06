package com.ybveg.govx.system.model.po;

import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.UserDto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Table(name = "sys_user")
public class User extends BasePo<UserDto>{

  @Id
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