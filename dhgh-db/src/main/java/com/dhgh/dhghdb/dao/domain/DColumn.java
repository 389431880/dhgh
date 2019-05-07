package com.dhgh.dhghdb.dao.domain;

import lombok.Data;

import javax.persistence.*;

@Table(name = "d_column")
@Data
public class DColumn {

    /**
     * 栏目id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     *
     */
    @Column(name = "column_name")
    private String columnName;

    /**
     * 是否可用1是0否
     */
    private Boolean enabled;

    /**
     * 删除标示1删除0未删除
     */
    private Boolean deleted;

}
