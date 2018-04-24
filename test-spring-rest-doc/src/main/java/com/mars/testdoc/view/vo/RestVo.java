package com.mars.testdoc.view.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RestVo {

    private boolean success = false;
    private String message = "";
    private Object data;

}
