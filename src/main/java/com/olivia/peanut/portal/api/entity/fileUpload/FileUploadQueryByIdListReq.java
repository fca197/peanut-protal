package com.olivia.peanut.portal.api.entity.fileUpload;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * (FileUpload)查询对象入参
 *
 * @author peanut
 * @since 2024-03-18 15:22:32
 */
@Accessors(chain = true)
@Getter
@Setter
@SuppressWarnings("serial")
public class FileUploadQueryByIdListReq {

  private List<Long> idList;


}

