package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.ybveg.govx.system.api.RoleService;
import com.ybveg.govx.system.mapper.RoleMapper;
import com.ybveg.govx.system.model.dto.RoleDto;
import com.ybveg.govx.system.model.po.Role;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
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
