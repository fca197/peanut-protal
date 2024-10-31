package com.olivia.peanut.aps.api.entity.apsOrderGoodsBom;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 订单商品零件表(ApsOrderGoodsBom)查询对象入参
 *
 * @author peanut
 * @since 2024-07-30 10:28:23
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsOrderGoodsBomQueryByIdListReq {

  private List<Long> idList;


  public void checkParam() {
  }

}

