package com.jkx.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xinjianxun
 * @version 1.0
 * @description: TODO
 * @date 2021/12/13 0:44
 */
@Data
@AllArgsConstructor
public class ResultVo<T> {
    private String msg;
    private int code;
    private T data;
}
