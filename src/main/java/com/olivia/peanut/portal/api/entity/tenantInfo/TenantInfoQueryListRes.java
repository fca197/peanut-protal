package com.olivia.peanut.portal.api.entity.tenantInfo;

import com.olivia.peanut.portal.api.entity.BaseEntityDto;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 租户信息(TenantInfo)查询对象返回
 *
 * @author makejava
 * @since 2024-03-11 10:55:21
 */
@Accessors(chain = true)
@Getter
@Setter

public class TenantInfoQueryListRes {

  /***
   * 返回对象列表
   */
  private List<Info> dataList;


  @Getter
  @Setter
  public static class Info extends BaseEntityDto {

    /***
     *  租户名称
     */
    private String tenantName;
    /***
     *  租户编码
     */
    private String tenantCode;

  }
}

