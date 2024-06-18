package com.olivia.peanut.portal.api.entity.msgMessageRead;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * (MsgMessageRead)查询对象返回
 *
 * @author peanut
 * @since 2024-03-23 19:17:48
 */
//@Accessors(chain=true)
@Getter
@Setter
@SuppressWarnings("serial")
public class MsgMessageReadDto {


  private Long userId;
  private LocalDateTime lastReadTime;


}


