package com.olivia.peanut.aps.api.entity.apsMakeCapacitySaleConfig;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * (ApsMakeCapacitySaleConfig)保存返回
 *
 * @author peanut
 * @since 2024-04-13 12:05:06
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsMakeCapacitySaleConfigInsertRes {

  /****
   * 写入行数
   */
  private int count;

  private Long id;
}

