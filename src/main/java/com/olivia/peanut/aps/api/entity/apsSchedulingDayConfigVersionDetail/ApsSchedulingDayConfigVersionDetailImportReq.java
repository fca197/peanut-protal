package com.olivia.peanut.aps.api.entity.apsSchedulingDayConfigVersionDetail;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.util.List;

import com.alibaba.excel.annotation.ExcelProperty;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 排程版本配置明细表(ApsSchedulingDayConfigVersionDetail)查询对象返回
 *
 * @author peanut
 * @since 2024-07-19 15:05:09
 */
//@Accessors(chain=true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsSchedulingDayConfigVersionDetailImportReq extends ApsSchedulingDayConfigVersionDetailDto {


  public void checkParam() {
  }

}


