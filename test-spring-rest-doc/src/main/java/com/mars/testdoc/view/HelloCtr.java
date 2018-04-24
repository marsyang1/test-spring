package com.mars.testdoc.view;

import com.mars.testdoc.view.vo.RestVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtr {

    @RequestMapping("/hello")
    public RestVo hello(@RequestParam(required = false) String name) {
        if (StringUtils.isNotBlank(name)) {
            return RestVo.builder()
                    .success(true)
                    .message("success")
                    .data("Hello " + name)
                    .build();
        }
        throw new IllegalArgumentException("lll");
    }

}
