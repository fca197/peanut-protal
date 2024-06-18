package com.olivia.peanut.aps.api.entity.apsMakeCapacityFactory;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * (ApsMakeCapacityFactory)根据ID删除多个反参
 *
 * @author peanut
 * @since 2024-04-13 12:05:04
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsMakeCapacityFactoryDeleteByIdListRes {

  /***
   * 受影响行数
   */
  private int count;

}

