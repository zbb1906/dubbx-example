package com.ybveg.govx.system.api;

import com.ybveg.govx.system.model.dto.AreaDto;
import com.ybveg.govx.system.model.dto.UserDto;
import com.ybveg.govx.system.model.po.User;

import java.util.List;

/**
 * Created by KLJ on 2017/8/17.
 */
public interface UserService {

    /**
     * Created by KLJ on 2017-08-17 17:58:22
     * @param id 部门ID
     * @return
     * @throws Exception
     */
    public List<User> getUsersByDeptId(String id) throws Exception;


    /**
     * Created by KLJ on 2017-08-17 18:01:06
     * @return
     * @throws Exception
     */
    public boolean add(UserDto dto) throws Exception;
}
