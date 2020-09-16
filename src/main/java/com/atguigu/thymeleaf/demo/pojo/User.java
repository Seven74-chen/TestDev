package com.atguigu.thymeleaf.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Baozhong Chen
 * @version 1.0
 * @date 2020/8/30 16:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private Integer age;
    private User friend;
}
