package com.olivia.peanut.aps.api.entity.apsOrderGoods;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * (ApsOrderGoods)查询对象返回
 *
 * @author peanut
 * @since 2024-04-09 13:19:36
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsOrderGoodsQueryByIdListRes {

  /***
   * 返回对象列表
   */
  private List<ApsOrderGoodsDto> dataList;


}

