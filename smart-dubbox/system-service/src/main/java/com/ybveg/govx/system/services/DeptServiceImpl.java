package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ybveg.govx.system.api.DeptService;
import com.ybveg.govx.system.mapper.DepartmentMapper;
import com.ybveg.govx.system.mapper.UserMapper;
import com.ybveg.govx.system.model.dto.DepartmentDto;
import com.ybveg.govx.system.model.po.Department;
import com.ybveg.govx.system.model.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by KLJ on 2017/8/17.
 */
@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    DepartmentMapper mapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean add(DepartmentDto dto) throws Exception {

        if (mapper.insert(dto.toPo()) == 0)
            return false;

        return true;
    }

    @Override
    public boolean delete(String id) throws Exception {
        Department po = new Department();
        po.setId(id);
        if (mapper.deleteByPrimaryKey(po) == 0)
            return false;
        return true;
    }

    @Override
    public boolean update(DepartmentDto dto) throws Exception {

        if (mapper.updateByPrimaryKeySelective(dto.toPo()) == 0)
            return false;

        return true;
    }

    @Override
    public PageInfo<Map<String, Object>> list(Map<String, Object> params, int num, int size) throws Exception {
        PageHelper.startPage(num, size);
        List<Map<String, Object>> list = mapper.list(params);
        PageInfo<Map<String, Object>> results = new PageInfo<>(list);
        return results;
    }

    @Override
    public List<User> getUserByDeptCode(String deptId) throws Exception {
        User user = new User();
        user.setDeptId(deptId);
        return userMapper.select(user);
    }
}
