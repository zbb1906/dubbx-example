package com.ybveg.govx.system.model.po;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Serializable {

  private String id;

  private String username;

  private String password;

}