package com.ybveg.govx.common.web.jwt;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * @auther zbb
 * @create 2017/8/8
 */
@Getter
@Setter
public class Token implements Serializable {

  private static final long serialVersionUID = -847849444414087887L;

  /**
   * 用户ID
   */
  private String id;
  /**
   * 部门ID
   */
  private String depId;
  /**
   * 数据编码
   */
  private String dataCode;

}
