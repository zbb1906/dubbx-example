package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.ybveg.govx.system.api.ModuleFunctionService;
import com.ybveg.govx.system.mapper.ModuleFunctionMapper;
import com.ybveg.govx.system.model.po.ModuleFunction;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hb on 2017/8/15.
 */

@Service(version = "1.0.0")
public class ModuleFunctionServiceImpl implements ModuleFunctionService {

  @Autowired
  ModuleFunctionMapper mapper;

  @Override
  public List<ModuleFunction> getFuncByModuleCode(String moduleCode) throws Exception {

    ModuleFunction mf = new ModuleFunction();
    mf.setModuleCode(moduleCode);

    return mapper.select(mf);
  }

}
