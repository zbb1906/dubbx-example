package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.Area;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface AreaMapper extends Mapper<Area> {

    public List<Map<String,Object>> list(Map<String,Object> params) throws  Exception;

}