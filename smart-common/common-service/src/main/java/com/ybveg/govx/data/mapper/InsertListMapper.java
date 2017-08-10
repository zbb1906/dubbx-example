package com.ybveg.govx.data.mapper;

import java.util.List;
import org.apache.ibatis.annotations.InsertProvider;
import tk.mybatis.mapper.provider.SpecialProvider;

public interface InsertListMapper<T> {

  @InsertProvider(type = SpecialProvider.class, method = "dynamicSQL")
  int insertList(List<T> recordList);
}

