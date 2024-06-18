package com.olivia.peanut.portal.api.entity.uber.h3;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


/***
 *
 */
@Setter
@Getter
@Accessors(chain = true)
public class CellToBoundaryReq {

  @NotBlank(message = "")
  private String h3Code;
}
