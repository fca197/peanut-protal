package com.olivia.peanut.task.engine;


import com.alibaba.fastjson2.JSONObject;
import com.olivia.peanut.task.engine.entity.ExecTaskReq;

import java.util.Map;

public interface TaskRunnerExec {
  Map<String, Object> exec(ExecTaskReq req);
}
