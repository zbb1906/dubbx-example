package com.ybveg.govx.system.services;

import com.alibaba.druid.sql.visitor.functions.If;
import com.ybveg.govx.system.api.UserService;
import com.ybveg.govx.system.mapper.UserMapper;
import com.ybveg.govx.system.model.dto.AreaDto;
import com.ybveg.govx.system.model.dto.UserDto;
import com.ybveg.govx.system.model.po.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by KLJ on 2017/8/17.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public List<User> getUsersByDeptId(String id) throws Exception {
        User user = new User();
        user.setDeptId(id);
        return mapper.select(user);
    }

    @Override
    public boolean add(UserDto dto) throws Exception {
        if (mapper.insert(dto.toPo()) == 0)
            return false;
        return true;
    }


}
