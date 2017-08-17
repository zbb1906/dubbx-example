package com.ybveg.govx.system.model.po;

import com.github.tj123.common.BasePo;
import com.ybveg.govx.system.model.dto.MenuDto;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "sys_menu")
public class Menu extends BasePo<MenuDto> implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  private String id;

  private String parentId;

  private String name;

  private Integer level;

  private Integer sort;

  private Date createTime;

}