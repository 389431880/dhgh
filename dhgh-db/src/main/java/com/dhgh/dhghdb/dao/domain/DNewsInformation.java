package com.dhgh.dhghdb.dao.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "d_news_information")
public class DNewsInformation {

    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 作者
     */
    private String creater;

    /**
     * 图片地址
     */
    private String image;

    /**
     * 创建时间
     */
    @Column(name = "end_time")
    private Date createTime;

    /**
     * 所属栏目
     */
    @Column(name = "parent_column")
    private Integer parentColumn;

    /**
     * 是否可用1是0否
     */
    private Boolean enabled;

    /**
     * 删除标示1删除0未删除
     */
    private Boolean deleted;

}
