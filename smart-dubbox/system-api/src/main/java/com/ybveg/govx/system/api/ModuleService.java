package com.ybveg.govx.system.api;

import java.util.List;
import java.util.Map;

/**
 * Created by hb on 2017/8/16.
 */
public interface ModuleService {

  /**
   * @Author: hb
   * @Description:
   * @Date: 16:39 2017/8/16
   * @Params: * @param pageNum 页数, @param pageSize 条数
   * @Return: Map<String, Object>
   */
  List<Map<String, Object>> listForPage(int pageNum, int pageSize) throws Exception;
}
