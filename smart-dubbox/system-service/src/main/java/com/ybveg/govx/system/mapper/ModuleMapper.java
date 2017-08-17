package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.Module;
import java.util.List;
import java.util.Map;
import tk.mybatis.mapper.common.Mapper;

public interface ModuleMapper extends Mapper<Module> {

  List<Map<String, Object>> listForPage() throws Exception;
}