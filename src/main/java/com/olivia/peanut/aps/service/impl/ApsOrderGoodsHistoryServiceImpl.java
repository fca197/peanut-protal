package com.olivia.peanut.aps.service.impl;

import org.springframework.aop.framework.AopContext;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import jakarta.annotation.Resource;
import com.olivia.sdk.utils.$;
import com.olivia.sdk.utils.LambdaQueryUtil;
import com.olivia.sdk.utils.DynamicsPage;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.olivia.peanut.aps.mapper.ApsOrderGoodsHistoryMapper;
import com.olivia.peanut.aps.model.ApsOrderGoodsHistory;
import com.olivia.peanut.aps.service.ApsOrderGoodsHistoryService;
import cn.hutool.core.collection.CollUtil;
//import com.olivia.peanut.aps.service.BaseTableHeaderService;
import com.olivia.peanut.portal.service.BaseTableHeaderService;
import com.olivia.peanut.aps.api.entity.apsOrderGoodsHistory.*;
import com.olivia.peanut.util.SetNamePojoUtils;
import com.olivia.sdk.service.SetNameService;

/**
 * 历史订单记录(ApsOrderGoodsHistory)表服务实现类
 *
 * @author makejava
 * @since 2025-02-20 17:18:46
 */
@Service("apsOrderGoodsHistoryService")
@Transactional
public class ApsOrderGoodsHistoryServiceImpl extends MPJBaseServiceImpl<ApsOrderGoodsHistoryMapper, ApsOrderGoodsHistory> implements ApsOrderGoodsHistoryService {

  final static Cache<String, Map<String, String>> cache = CacheBuilder.newBuilder().maximumSize(100).expireAfterWrite(30, TimeUnit.MINUTES).build();

  @Resource
  BaseTableHeaderService tableHeaderService;
  @Resource
  SetNameService setNameService;


  public @Override ApsOrderGoodsHistoryQueryListRes queryList(ApsOrderGoodsHistoryQueryListReq req) {

    MPJLambdaWrapper<ApsOrderGoodsHistory> q = getWrapper(req.getData());
    List<ApsOrderGoodsHistory> list = this.list(q);

    List<ApsOrderGoodsHistoryDto> dataList = list.stream().map(t -> $.copy(t, ApsOrderGoodsHistoryDto.class)).collect(Collectors.toList());
    ((ApsOrderGoodsHistoryService) AopContext.currentProxy()).setName(dataList);
    return new ApsOrderGoodsHistoryQueryListRes().setDataList(dataList);
  }


  public @Override DynamicsPage<ApsOrderGoodsHistoryExportQueryPageListInfoRes> queryPageList(ApsOrderGoodsHistoryExportQueryPageListReq req) {

    DynamicsPage<ApsOrderGoodsHistory> page = new DynamicsPage<>();
    page.setCurrent(req.getPageNum()).setSize(req.getPageSize());
    setQueryListHeader(page);
    MPJLambdaWrapper<ApsOrderGoodsHistory> q = getWrapper(req.getData());
    List<ApsOrderGoodsHistoryExportQueryPageListInfoRes> records;
    if (Boolean.TRUE.equals(req.getQueryPage())) {
      IPage<ApsOrderGoodsHistory> list = this.page(page, q);
      IPage<ApsOrderGoodsHistoryExportQueryPageListInfoRes> dataList = list.convert(t -> $.copy(t, ApsOrderGoodsHistoryExportQueryPageListInfoRes.class));
      records = dataList.getRecords();
    } else {
      records = $.copyList(this.list(q), ApsOrderGoodsHistoryExportQueryPageListInfoRes.class);
    }

    // 类型转换，  更换枚举 等操作 

    List<ApsOrderGoodsHistoryExportQueryPageListInfoRes> listInfoRes = $.copyList(records, ApsOrderGoodsHistoryExportQueryPageListInfoRes.class);
    ((ApsOrderGoodsHistoryService) AopContext.currentProxy()).setName(listInfoRes);

    return DynamicsPage.init(page, listInfoRes);
  }

  // 以下为私有对象封装

  public @Override void setName(List<? extends ApsOrderGoodsHistoryDto> list) {

    //   setNameService.setName(list, SetNamePojoUtils.FACTORY, SetNamePojoUtils.OP_USER_NAME);

  }


  @SuppressWarnings("unchecked")
  private MPJLambdaWrapper<ApsOrderGoodsHistory> getWrapper(ApsOrderGoodsHistoryDto obj) {
    MPJLambdaWrapper<ApsOrderGoodsHistory> q = new MPJLambdaWrapper<>();


    LambdaQueryUtil.lambdaQueryWrapper(q, obj, ApsOrderGoodsHistory.class
        // 查询条件
        , ApsOrderGoodsHistory::getFactoryId //
        , ApsOrderGoodsHistory::getGoodsId //
        , ApsOrderGoodsHistory::getYear //
        , ApsOrderGoodsHistory::getMonthCount01 //
        , ApsOrderGoodsHistory::getMonthRatio01 //
        , ApsOrderGoodsHistory::getMonthCount02 //
        , ApsOrderGoodsHistory::getMonthRatio02 //
        , ApsOrderGoodsHistory::getMonthCount03 //
        , ApsOrderGoodsHistory::getMonthRatio03 //
        , ApsOrderGoodsHistory::getMonthCount04 //
        , ApsOrderGoodsHistory::getMonthRatio04 //
        , ApsOrderGoodsHistory::getMonthCount05 //
        , ApsOrderGoodsHistory::getMonthRatio05 //
        , ApsOrderGoodsHistory::getMonthCount06 //
        , ApsOrderGoodsHistory::getMonthRatio06 //
        , ApsOrderGoodsHistory::getMonthCount07 //
        , ApsOrderGoodsHistory::getMonthRatio07 //
        , ApsOrderGoodsHistory::getMonthCount08 //
        , ApsOrderGoodsHistory::getMonthRatio08 //
        , ApsOrderGoodsHistory::getMonthCount09 //
        , ApsOrderGoodsHistory::getMonthRatio09 //
        , ApsOrderGoodsHistory::getMonthCount10 //
        , ApsOrderGoodsHistory::getMonthRatio10 //
        , ApsOrderGoodsHistory::getMonthCount11 //
        , ApsOrderGoodsHistory::getMonthRatio11 //
        , ApsOrderGoodsHistory::getMonthCount12 //
        , ApsOrderGoodsHistory::getMonthRatio12 //
    );


    q.orderByDesc(ApsOrderGoodsHistory::getId);
    return q;

  }

  private void setQueryListHeader(DynamicsPage<ApsOrderGoodsHistory> page) {

    tableHeaderService.listByBizKey(page, "ApsOrderGoodsHistoryService#queryPageList");

  }


}

