package com.ybveg.govx.data.utils;

import tk.mybatis.mapper.common.Mapper;

public interface BaseMapper<T> extends Mapper<T>, InsertListMapper<T> {

}
