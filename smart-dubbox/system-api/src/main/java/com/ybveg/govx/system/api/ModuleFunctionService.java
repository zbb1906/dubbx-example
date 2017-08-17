package com.ybveg.govx.system.api;

import com.ybveg.govx.system.model.po.ModuleFunction;
import java.util.List;

/**
 * Created by hb on 2017/8/17.
 */
public interface ModuleFunctionService {

  /**
   * @Author: hb
   * @Description:
   * @Date: 16:39 2017/8/17
   * @Params: * @param moduleCode 模块CODE
   * @Return: List<Map<String, Object>>
   */
  List<ModuleFunction> getFuncByModuleCode(String moduleCode) throws Exception;
}
