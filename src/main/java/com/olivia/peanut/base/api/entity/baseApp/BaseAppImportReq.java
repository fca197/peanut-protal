package com.olivia.peanut.base.api.entity.baseApp;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

import com.alibaba.excel.annotation.ExcelProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 应用表(BaseApp)查询对象返回
 *
 * @author peanut
 * @since 2024-08-05 11:18:57
 */
//@Accessors(chain=true)
@Getter
@Setter
@SuppressWarnings("serial")
public class BaseAppImportReq extends BaseAppDto {


  public void checkParam() {
  }

}


