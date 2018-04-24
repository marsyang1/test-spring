package com.mars.testdoc.view;

import com.mars.testdoc.view.vo.RestVo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler({AccessDeniedException.class})
//    public ResponseEntity<Object> handleAccessDeniedException(Exception ex, WebRequest request) {
//        return new ResponseEntity<Object>(
//                "Access denied message here", new HttpHeaders(), HttpStatus.FORBIDDEN);
//    }

    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ResponseEntity<RestVo> handleException(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(RestVo.builder()
                .success(false)
                .message("IllegalArgument:" + e.getMessage())
                .build());
    }


}
