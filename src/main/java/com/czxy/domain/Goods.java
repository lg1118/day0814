package com.czxy.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2020/8/14.
 */
@Data
@Table(name = "t_user")
public class Goods {
    @Id
    private Integer uid;
    private String username;
    private String password;
}
