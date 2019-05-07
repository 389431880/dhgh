package com.dhgh.dhghdb.dao.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Table(name = "d_trainee")
@Data
public class DTrainee {

    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 学生唯一id
     */
    private String number;

    /**
     * 学生姓名
     */
    @Column(name = "trainee_name")
    private String traineeName;

    /**
     * 学生性别1男2女
     */
    @Column(name = "trainee_sex")
    private Integer traineeSex;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 学生照片
     */
    private Date image;

    /**
     * 入学时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结业时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 联系手机
     */
    private String mobile;

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
