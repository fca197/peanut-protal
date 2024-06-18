package com.olivia.peanut.aps.api.entity.apsGoodsForecastComputeSaleData;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * (ApsGoodsForecastComputeSaleData)保存入参
 *
 * @author peanut
 * @since 2024-03-31 20:58:34
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsGoodsForecastComputeSaleDataInsertReq extends ApsGoodsForecastComputeSaleDataDto {

  public void checkParam() {
  }
}

