package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.ybveg.govx.system.api.RoleService;
import com.ybveg.govx.system.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hb on 2017/8/15.
 */

@Service(version = "1.0")
public class RoleServiceImpl implements RoleService {

  @Autowired
  RoleMapper mapper;

  @Override
  public void test() throws Exception {

  }

}
