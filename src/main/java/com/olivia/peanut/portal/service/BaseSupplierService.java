package com.olivia.peanut.portal.service;

import com.github.yulichang.base.MPJBaseService;
import com.olivia.peanut.portal.api.entity.baseSupplier.*;
import com.olivia.peanut.portal.model.BaseSupplier;
import com.olivia.sdk.utils.DynamicsPage;
import java.util.List;

/**
 * (BaseSupplier)表服务接口
 *
 * @author peanut
 * @since 2024-03-28 15:35:38
 */
public interface BaseSupplierService extends MPJBaseService<BaseSupplier> {

  BaseSupplierQueryListRes queryList(BaseSupplierQueryListReq req);

  DynamicsPage<BaseSupplierExportQueryPageListInfoRes> queryPageList(BaseSupplierExportQueryPageListReq req);


  void setName(List<? extends BaseSupplierDto> BaseSupplierDtoList);
}

