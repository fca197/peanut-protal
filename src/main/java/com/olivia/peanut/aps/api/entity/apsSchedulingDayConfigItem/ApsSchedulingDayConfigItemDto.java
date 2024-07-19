package com.olivia.peanut.aps.api.entity.apsSchedulingDayConfigItem;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.util.List;
import com.olivia.peanut.portal.api.entity.BaseEntityDto;
import com.alibaba.excel.annotation.ExcelProperty;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.olivia.sdk.ann.InsertCheck;
import com.olivia.sdk.ann.UpdateCheck;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * 排程版本配置表(ApsSchedulingDayConfigItem)查询对象返回
 *
 * @author peanut
 * @since 2024-07-19 15:05:04
 */
//@Accessors(chain=true)
@Getter
@Setter
@SuppressWarnings("serial")
public class ApsSchedulingDayConfigItemDto extends BaseEntityDto {

//  @NotNull(message = "${column.comment}不能为空", groups = {InsertCheck.class, UpdateCheck.class})
  private Long schedulingDayId;
  /***
   *  配置类型 sale,part,bom ,sleep
   */
  @NotBlank(message = "配置类型 sale,part,bom ,sleep不能为空", groups = {InsertCheck.class, UpdateCheck.class})
  private String configBizType;
  /***
   *  配置业务ID
   */
  @NotNull(message = "配置业务ID不能为空", groups = {InsertCheck.class, UpdateCheck.class})
  private Long configBizId;
  /***
   *  配置业务名称
   */
  @NotBlank(message = "配置业务名称不能为空", groups = {InsertCheck.class, UpdateCheck.class})
  private String configBizName;
  /***
   *  配置业务数量
   */
  @NotNull(message = "配置业务数量不能为空", groups = {InsertCheck.class, UpdateCheck.class})
  private Long configBizNum;
  /***
   *  配置业务耗时(秒)
   */
  @NotNull(message = "配置业务耗时(秒)不能为空", groups = {InsertCheck.class, UpdateCheck.class})
  private Long configBizTime;
//  /***
//   *  是否默认 0 否,1 是
//   */
//  @NotNull(message = "是否默认 0 否,1 是不能为空", groups = {InsertCheck.class, UpdateCheck.class})
//  private Boolean isDefault;

}


