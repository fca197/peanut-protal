package com.olivia.peanut.base.api.entity.baseOplog;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 操作日志(BaseOplog)根据ID删除多个反参
 *
 * @author makejava
 * @since 2024-11-30 16:01:01
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class BaseOplogDeleteByIdListRes {
  /***
   * 受影响行数
   */
  private int count;

}

