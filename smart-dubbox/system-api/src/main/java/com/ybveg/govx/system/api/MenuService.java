package com.ybveg.govx.system.api;

import com.github.pagehelper.PageInfo;
import com.ybveg.govx.system.model.dto.MenuDto;
import java.util.Map;

/**
 * Created by hb on 2017/8/16.
 */
public interface MenuService {

  /**
   * @Author: hb
   * @Description:
   * @Date: 16:39 2017/8/16
   * @Params: * @param pageNum 页数, @param pageSize 条数
   * @Return: Map<String, Object>
   */
  PageInfo<Map<String, Object>> listForPage(int pageNum, int pageSize) throws Exception;

  /**
   * @Author: hb
   * @Description: 添加菜单
   * @Date: 16:39 2017/8/16
   * @Params: * MenuDto dto 菜单dto
   */
  void add(MenuDto dto) throws Exception;

  /**
   * @Author: hb
   * @Description: 编辑菜单
   * @Date: 16:39 2017/8/16
   * @Params: * MenuDto dto 菜单dto
   */
  void edit(MenuDto dto) throws Exception;
}
