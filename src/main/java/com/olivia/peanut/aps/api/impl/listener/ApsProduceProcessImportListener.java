package com.olivia.peanut.aps.api.impl.listener;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.olivia.peanut.aps.api.entity.apsProduceProcess.ApsProduceProcessImportReq;

import java.util.Map;

/**
 * aps 生产路径(ApsProduceProcess)文件导入监听
 *
 * @author makejava
 * @since 2024-10-24 17:00:20
 */
public class ApsProduceProcessImportListener extends AnalysisEventListener<ApsProduceProcessImportReq> {

  @Override
  public void invoke(ApsProduceProcessImportReq data, AnalysisContext analysisContext) {
    //  文件校验
  }

  @Override
  public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    // 数据处理完毕后的操作（如果需要）
  }

  @Override
  public void onException(Exception exception, AnalysisContext context) throws Exception {
    // 异常处理
    super.onException(exception, context);
  }

  @Override
  public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
    //  log.info("headMap:{}", JSON.toJSONString(headMap));
    super.invokeHeadMap(headMap, context);
  }


}
