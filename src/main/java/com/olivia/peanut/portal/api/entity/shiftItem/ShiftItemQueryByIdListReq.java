package com.olivia.peanut.portal.api.entity.shiftItem;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * (ShiftItem)查询对象入参
 *
 * @author peanut
 * @since 2024-04-04 12:10:16
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ShiftItemQueryByIdListReq {

  private List<Long> idList;


  public void checkParam() {
  }

}

