package com.dhgh.dhghdb.dao.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description = "新闻动态")
public class DNewsInformationDTO {

    /**
     * 新闻id
     */
    @ApiModelProperty(value = "新闻id", name = "id", example = "1")
    private Integer id;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题", name = "title", example = "抄底迪拜，巴菲特出手了！")
    private String title;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容", name = "content", example = "抄底迪拜，巴菲特出手了！抄底迪拜，巴菲特出手了！抄底迪拜，巴菲特出手了！")
    private String content;

    /**
     * 作者
     */
    @ApiModelProperty(value = "作者", name = "creater", example = "财经")
    private String creater;

    /**
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址", name = "image", example = "http://pics6.baidu.com/feed/d52a2834349b033baddc5271142df5d7d439bd29.jpeg?token=9f5d70281ff2803cf4b134afe431a3cf&s=FFA20DC7421825D64FDD49B70300D042")
    private String image;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间", name = "createTime", example = "2019-05-06 13:12:28")
    private Date createTime;

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
