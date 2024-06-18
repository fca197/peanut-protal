package com.olivia.peanut.portal.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.yulichang.base.MPJBaseServiceImpl;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.olivia.peanut.portal.api.entity.baseTableHeader.*;
import com.olivia.peanut.portal.mapper.BaseTableHeaderMapper;
import com.olivia.peanut.portal.model.BaseTableHeader;
import com.olivia.peanut.portal.service.BaseTableHeaderService;
import com.olivia.sdk.utils.$;
import com.olivia.sdk.utils.DynamicsPage;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * (BaseTableHeader)表服务实现类
 *
 * @author peanut
 * @since 2024-03-25 14:19:10
 */
@Service("baseTableHeaderService")
@Transactional
public class BaseTableHeaderServiceImpl extends MPJBaseServiceImpl<BaseTableHeaderMapper, BaseTableHeader> implements BaseTableHeaderService {

  final static Cache<String, Map<String, String>> cache = CacheBuilder.newBuilder().maximumSize(100).expireAfterWrite(30, TimeUnit.MINUTES).build();

  public @Override BaseTableHeaderQueryListRes queryList(BaseTableHeaderQueryListReq req) {

    MPJLambdaWrapper<BaseTableHeader> q = getWrapper(req.getData());
    List<BaseTableHeader> list = this.list(q);

    List<BaseTableHeaderDto> dataList = list.stream().map(t -> $.copy(t, BaseTableHeaderDto.class)).collect(Collectors.toList());

    return new BaseTableHeaderQueryListRes().setDataList(dataList);
  }


  public @Override DynamicsPage<BaseTableHeaderExportQueryPageListInfoRes> queryPageList(BaseTableHeaderExportQueryPageListReq req) {

    DynamicsPage<BaseTableHeader> page = new DynamicsPage<>();
    page.setCurrent(req.getPageNum()).setSize(req.getPageSize());
    setQueryListHeader(page);
    MPJLambdaWrapper<BaseTableHeader> q = getWrapper(req.getData());
    List<BaseTableHeaderExportQueryPageListInfoRes> records;
    if (Boolean.TRUE.equals(req.getQueryPage())) {
      IPage<BaseTableHeader> list = this.page(page, q);
      IPage<BaseTableHeaderExportQueryPageListInfoRes> dataList = list.convert(t -> $.copy(t, BaseTableHeaderExportQueryPageListInfoRes.class));
      records = dataList.getRecords();
    } else {
      records = $.copyList(this.list(q), BaseTableHeaderExportQueryPageListInfoRes.class);
    }

    // 类型转换，  更换枚举 等操作
    List<BaseTableHeaderExportQueryPageListInfoRes> listInfoRes = $.copyList(records, BaseTableHeaderExportQueryPageListInfoRes.class);

    return DynamicsPage.init(page, listInfoRes);
  }

  // 以下为私有对象封装


  private MPJLambdaWrapper<BaseTableHeader> getWrapper(BaseTableHeaderDto obj) {
    MPJLambdaWrapper<BaseTableHeader> q = new MPJLambdaWrapper<>();

    if (Objects.nonNull(obj)) {
      q.eq(Objects.nonNull(obj.getId()), BaseTableHeader::getId, obj.getId())
          //
          .eq(StringUtils.isNoneBlank(obj.getBizKey()), BaseTableHeader::getBizKey, obj.getBizKey())
          .eq(StringUtils.isNoneBlank(obj.getFieldName()), BaseTableHeader::getFieldName, obj.getFieldName())
          .eq(StringUtils.isNoneBlank(obj.getShowName()), BaseTableHeader::getShowName, obj.getShowName())
          .eq(Objects.nonNull(obj.getWidthPx()), BaseTableHeader::getWidthPx, obj.getWidthPx())
          .eq(Objects.nonNull(obj.getIsPicture()), BaseTableHeader::getIsPicture, obj.getIsPicture())
          .eq(Objects.nonNull(obj.getTenantId()), BaseTableHeader::getTenantId, obj.getTenantId())

      ;
    }
    q.orderByDesc(BaseTableHeader::getId);
    return q;

  }

  private void setQueryListHeader(DynamicsPage<BaseTableHeader> page) {
    this.listByBizKey(page, "queryPageList");
  }

  @Override
  public void listByBizKey(DynamicsPage<?> page, String bizKey) {
    List<BaseTableHeader> headerList = this.list(new LambdaUpdateWrapper<BaseTableHeader>().eq(BaseTableHeader::getBizKey, bizKey).orderByAsc(BaseTableHeader::getSortIndex));
    headerList.forEach(t -> page.addHeader(t.getFieldName(), t.getShowName(), t.getWidthPx()));
  }
}

