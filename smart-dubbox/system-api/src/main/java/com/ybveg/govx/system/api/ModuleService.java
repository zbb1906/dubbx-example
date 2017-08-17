package com.ybveg.govx.system.api;

import com.github.pagehelper.PageInfo;
import com.ybveg.auth.model.ModuleModel;
import java.util.Collection;
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
  PageInfo<Map<String, Object>> listForPage(int pageNum, int pageSize) throws Exception;

  /**
   * 保存或者更新模块功能
   *
   * @param list 模块集合
   */
  void saveOrUpdate(Collection<ModuleModel> list);

}
