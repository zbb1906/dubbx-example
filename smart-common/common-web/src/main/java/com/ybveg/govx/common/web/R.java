package com.ybveg.govx.common.web;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * 返回包装类
 *
 * @auther zbb
 * @create 2017/8/2
 */
@Setter
@Getter
public class R implements Serializable {

  private boolean status;

  private Object data;

  private String message;

  private String code;

  public R(boolean status) {
    this.status = status;
  }

  public R(Object data) {
    this.status = true;
    this.data = data;
  }

  /**
   * 成功
   */
  public static R ok() {
    return new R(true);
  }

  /**
   * 成功 并返回数据
   */
  public static R ok(Object data) {
    return new R(data);
  }

  /**
   * 失败 并返异常状态吗 或者 消息
   */
  public static R err(String code, String message) {
    R r = new R(false);
    r.setMessage(message);
    r.setCode(code);
    return r;
  }

}
