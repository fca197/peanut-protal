package com.olivia.peanut.aps.api.entity.apsGoodsForecastMainSaleData;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * (ApsGoodsForecastMainSaleData)根据ID删除多个反参
 *
 * @author peanut
 * @since 2024-04-02 09:42:27
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsGoodsForecastMainSaleDataDeleteByIdListRes {

  /***
   * 受影响行数
   */
  private int count;

}

