package com.dhgh.dhghdb.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "实习生信息")
public class DTraineeDTO {

    /**
     * 实习生id
     */
    @ApiModelProperty(value = "id", name = "id", example = "1")
    private Integer id;

    /**
     * 实习生唯一id
     */
    @ApiModelProperty(value = "实习生唯一id", name = "number", example = "468646546544845545")
    private Integer number;

    /**
     * 学生姓名
     */
    @ApiModelProperty(value = "学生姓名", name = "traineeName", example = "张三")
    private String traineeName;

    /**
     * 入学时间
     */
    @ApiModelProperty(value = "入学时间", name = "startTime", example = "2018:01:15 09:39:00")
    private Date startTime;

    /**
     * 结业时间
     */
    @ApiModelProperty(value = "结业时间", name = "endTime", example = "2018:01:15 09:39:00")
    private Date endTime;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码", name = "mobile", example = "131321315254")
    private String mobile;

    /**
     * 是否可用1是0否
     */
    @ApiModelProperty(value = "是否可用1是0否", name = "enabled", example = "true")
    private Boolean enabled;

    /**
     * 删除标示1删除0未删除
     */
    @ApiModelProperty(value = "删除标示1删除0未删除", name = "deleted", example = "false")
    private Boolean deleted;

}
