package com.huangda7.serviceprovider.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {
    public static ResponseEntity responseSuccess(Object o) {
        Result<Object> result = new Result<>(o);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
