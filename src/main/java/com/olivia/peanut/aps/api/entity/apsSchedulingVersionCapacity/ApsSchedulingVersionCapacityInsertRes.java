package com.olivia.peanut.aps.api.entity.apsSchedulingVersionCapacity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * (ApsSchedulingVersionCapacity)保存返回
 *
 * @author peanut
 * @since 2024-04-18 14:57:34
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsSchedulingVersionCapacityInsertRes {

  /****
   * 写入行数
   */
  private int count;

  private Long id;
}

