package com.ybveg.govx.common.web.jwt;

/**
 * @auther zbb
 * @create 2017/8/8
 */
public final class JWT {

  public static final String JWT_ID = "smart_govx";
  public final static String JWT_SECRET = "=34Pc5Ni)5245Xs4N9d!4mQmaXY}iFo";
  public static final int JWT_TTL = 60 * 60 * 1000;  //millisecond
  public static final int JWT_REFRESH_INTERVAL = 55 * 60 * 1000;  //millisecond
  public static final int JWT_REFRESH_TTL = 12 * 60 * 60 * 1000;  //millisecond

}
