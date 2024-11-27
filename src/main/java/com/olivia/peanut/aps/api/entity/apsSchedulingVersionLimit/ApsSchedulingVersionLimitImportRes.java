package com.olivia.peanut.aps.api.entity.apsSchedulingVersionLimit;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * (ApsSchedulingVersionLimit)保存返回
 *
 * @author peanut
 * @since 2024-04-19 14:56:59
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsSchedulingVersionLimitImportRes {

  /****
   * 写入行数
   */
  private int count;
  /**
   * 错误信息
   */
  private List<String> errorMsg;
}

