package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.Menu;
import java.util.List;
import java.util.Map;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;

public interface MenuMapper extends Mapper<Menu> {

  List<Map<String, Object>> listForPage() throws Exception;
}