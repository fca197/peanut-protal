package com.olivia.peanut.aps.api.entity.apsSchedulingDayConfig;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 排程版本表(ApsSchedulingDayConfig)根据ID删除多个入参
 *
 * @author peanut
 * @since 2024-07-19 19:19:49
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsSchedulingDayConfigDeleteByIdListReq {

  /***
   * 要删除的ID
   */
  @NotEmpty(message = "请选择删除对象")
  private List<Long> idList;


}

