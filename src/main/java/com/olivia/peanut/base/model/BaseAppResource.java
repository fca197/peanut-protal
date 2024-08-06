package com.olivia.peanut.base.model;


import java.time.LocalDate;
import java.time.LocalDateTime;
import com.olivia.sdk.utils.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 资源(BaseAppResource)表实体类
 *
 * @author peanut
 * @since 2024-08-06 17:30:28
 */
@Accessors(chain = true)
@Getter
@Setter
//@SuppressWarnings("serial")
@TableName("base_app_resource")
public class BaseAppResource extends BaseEntity {

  /***
   *  应用ID
   */
  private Long appId;
  /***
   *  资源ID
   */
  private Long resourceId;
  /***
   *  是否按钮 0 否,1 是
   */
  private Boolean isButton;
  /***
   *  是否隐藏 0 否,1 是
   */
  private Boolean isHidden;
  /***
   *  文件路径
   */
  private String filePath;
  /***
   *  父菜单ID
   */
  private Long parentId;
  /***
   *  菜单路径
   */
  private String path;

}

