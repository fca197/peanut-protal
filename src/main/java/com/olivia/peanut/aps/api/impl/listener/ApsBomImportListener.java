package com.olivia.peanut.aps.api.impl.listener;


import cn.hutool.extra.spring.SpringUtil;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.fastjson2.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.olivia.peanut.aps.api.entity.apsBom.ApsBomImportReq;
import com.olivia.peanut.aps.model.ApsBomGroup;
import com.olivia.peanut.aps.service.ApsBomGroupService;
import com.olivia.sdk.dto.ExcelErrorMsg;
import com.olivia.sdk.listener.AbstractImportListener;
import com.olivia.sdk.utils.BaseEntity;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * BOM 清单(ApsBom)文件导入监听
 *
 * @author makejava
 * @since 2024-11-26 15:49:26
 */
@Slf4j
public class ApsBomImportListener extends AbstractImportListener<ApsBomImportReq> {

  List<ApsBomImportReq> reqList = new ArrayList<>();

  @Override
  public void invoke(ApsBomImportReq data, AnalysisContext analysisContext) {
    //  文件校验
    log.info("ApsBomImportListener invoke data:{}", JSON.toJSONString(data));
    checkData(data, analysisContext);
    reqList.add(data);
  }

  @Override
  public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    Map<String, Long> nameIdMap = SpringUtil.getBean(ApsBomGroupService.class)
        .list(new LambdaQueryWrapper<ApsBomGroup>().select(BaseEntity::getId, ApsBomGroup::getGroupName))
        .stream().collect(Collectors.toMap(ApsBomGroup::getGroupName, BaseEntity::getId));
    reqList.forEach(t -> {
      Long groupId = nameIdMap.get(t.getGroupName());
      t.setGroupId(groupId);
      if (Objects.isNull(groupId)) {
        addExcelErrorMsg(new ExcelErrorMsg().setRowIndex(t.getRowIndex()).setColumnName("组名称").setErrMsg("对应分组不存在"));
      }
    });
    super.doAfterAllAnalysed(analysisContext);
  }
}
