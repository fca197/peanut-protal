package com.olivia.peanut.portal.api.entity.tenantInfo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 租户信息(TenantInfo)保存入参
 *
 * @author makejava
 * @since 2024-03-11 10:55:21
 */
@Accessors(chain = true)
@Getter
@Setter

public class TenantInfoInsertReq extends TenantInfoDto {

  public void checkParam() {
  }
}

