package com.ybveg.govx.serialize;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * This class must be accessible from both the provider and consumer
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {

  @SuppressWarnings({"rawtypes", "unchecked"})
  public Collection getSerializableClasses() {
    List<Class> classes = new LinkedList<>();
//    classes.add(UserDto.class);
    return classes;
  }
}
