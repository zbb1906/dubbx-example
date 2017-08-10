package com.ybveg.govx.system.dao;

import com.ybveg.govx.data.mapper.BaseMapper;
import com.ybveg.govx.dto.UserDto;
import org.apache.ibatis.annotations.Param;

/**
 * @auther zbb
 * @create 2017/8/10
 */
public interface UserMapper extends BaseMapper<UserDto> {

  UserDto find(@Param("id") String id);

}
