package com.ybveg.govx.system.model.po.admin;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "sys_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String type;

    private String deptId;

    private String name;

    private Date createTime;

}