package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author xiebin
 * @Date ${Date}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultBean<T> {
    private String responsrCod;
    private  T date;



}
