package com.olivia.peanut.aps.api.entity.workshopStation;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 工位信息(WorkshopStation)保存入参
 *
 * @author makejava
 * @since 2024-03-11 10:55:23
 */
@Accessors(chain = true)
@Getter
@Setter

public class WorkshopStationInsertReq extends WorkshopStationDto {

  public void checkParam() {
  }
}

