package com.ybveg.govx.system.model.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto implements Serializable {

  private String id;

  private String username;

  private String password;

}