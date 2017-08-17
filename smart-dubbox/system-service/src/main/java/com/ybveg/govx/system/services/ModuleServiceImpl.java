package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ybveg.govx.system.api.ModuleService;
import com.ybveg.govx.system.mapper.ModuleMapper;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hb on 2017/8/15.
 */

@Service(version = "1.0")
public class ModuleServiceImpl implements ModuleService {

  @Autowired
  ModuleMapper mapper;

  @Override
  public PageInfo<Map<String, Object>> listForPage(int pageNum, int pageSize) throws Exception {

    PageHelper.startPage(pageNum, pageSize);
    List<Map<String, Object>> list = mapper.listForPage();
    PageInfo<Map<String, Object>> results = new PageInfo<>(list);

    return results;
  }

}
