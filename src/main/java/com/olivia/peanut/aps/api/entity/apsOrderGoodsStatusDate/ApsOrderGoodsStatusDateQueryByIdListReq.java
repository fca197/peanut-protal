package com.olivia.peanut.aps.api.entity.apsOrderGoodsStatusDate;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 订单商品状态表(ApsOrderGoodsStatusDate)查询对象入参
 *
 * @author peanut
 * @since 2024-06-14 10:26:59
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsOrderGoodsStatusDateQueryByIdListReq {

  private List<Long> idList;


  public void checkParam() {
  }

}

