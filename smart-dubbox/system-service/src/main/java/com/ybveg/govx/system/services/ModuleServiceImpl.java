package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ybveg.auth.model.FunctionModel;
import com.ybveg.auth.model.ModuleModel;
import com.ybveg.govx.system.api.ModuleService;
import com.ybveg.govx.system.mapper.ModuleFunctionMapper;
import com.ybveg.govx.system.mapper.ModuleMapper;
import com.ybveg.govx.system.model.po.Module;
import com.ybveg.govx.system.model.po.ModuleFunction;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by hb on 2017/8/15.
 */

@Service(version = "1.0.0")
@Slf4j
public class ModuleServiceImpl implements ModuleService {

  @Autowired
  ModuleMapper mapper;

  @Autowired
  ModuleFunctionMapper functionMapper;

  @Override
  public PageInfo<Map<String, Object>> listForPage(int pageNum, int pageSize) throws Exception {

    PageHelper.startPage(pageNum, pageSize);
    List<Map<String, Object>> list = mapper.listForPage();
    PageInfo<Map<String, Object>> results = new PageInfo<>(list);

    return results;
  }

  @Override
  @Transactional
  public void saveOrUpdate(Collection<ModuleModel> list) {

    log.info("info saveOrUpdate");
    log.debug("debug saveOrUpdate");
    log.warn("warn saveOrUpdate");
    log.error("error saveOrUpdate");

    list.forEach((moduleModel) -> {

      Example exampleModule = new Example(Module.class);
      exampleModule.and().andEqualTo("moduleCode", moduleModel.getCode());

      Module module = new Module();
      module.setClazz(moduleModel.getClazz());
      module.setModuleCode(moduleModel.getCode());
      module.setName(moduleModel.getName());
      if (mapper.selectCountByExample(exampleModule) == 0) {
        module.setCreateTime(new Date());
        mapper.insert(module);
      } else {
        mapper.updateByExampleSelective(module, exampleModule);
      }

      Set<FunctionModel> functions = moduleModel.getFunctions();
      functions.forEach((functionModel) -> {

        Example exampleFunction = new Example(ModuleFunction.class);
        exampleFunction.and().andEqualTo("moduleCode", moduleModel.getCode());
        exampleFunction.and().andEqualTo("funcCode", functionModel.getCode());

        ModuleFunction function = new ModuleFunction();
        function.setModuleCode(moduleModel.getCode());    // 模块ID
        function.setClazz(functionModel.getClazz());
        function.setName(functionModel.getName());
        function.setFuncCode(functionModel.getCode());
        if (functionMapper.selectCountByExample(exampleFunction) == 0) {
          functionMapper.insert(function);
        } else {
          functionMapper.updateByExampleSelective(function, exampleFunction);
        }
      });
    });
  }
}
