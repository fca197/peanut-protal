package com.olivia.peanut.aps.api.entity.apsOrderGoodsSaleHistory;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 销售规划订单历史销售占比(ApsOrderGoodsSaleHistory)查询对象返回
 *
 * @author makejava
 * @since 2025-02-18 14:28:43
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsOrderGoodsSaleHistoryQueryByIdListRes {
  /***
   * 返回对象列表
   */
  private List<ApsOrderGoodsSaleHistoryDto> dataList;


}

