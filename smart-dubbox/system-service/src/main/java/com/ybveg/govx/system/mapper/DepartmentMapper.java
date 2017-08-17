package com.ybveg.govx.system.mapper;

import com.ybveg.govx.system.model.po.Department;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface DepartmentMapper extends Mapper<Department> {

    /**
     *
     * @param params
     * @return
     * @throws Exception
     */
    public List<Map<String, Object>> list(Map<String, Object> params) throws Exception;

}