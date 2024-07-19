package com.olivia.peanut.aps.api.entity.apsSchedulingDayConfigVersion;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 排程版本(ApsSchedulingDayConfigVersion)保存入参
 *
 * @author peanut
 * @since 2024-07-19 15:05:06
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsSchedulingDayConfigVersionInsertReq extends ApsSchedulingDayConfigVersionDto {

  public void checkParam() {
  }
}

