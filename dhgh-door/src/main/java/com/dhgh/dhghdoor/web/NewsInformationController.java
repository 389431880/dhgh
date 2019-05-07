package com.dhgh.dhghdoor.web;

import com.baomidou.mybatisplus.plugins.Page;
import com.dhgh.dhghcore.model.dto.SimpleDTO;
import com.dhgh.dhghdb.dao.dto.DNewsInformationDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = {"newsInformation-controller"},description = "新闻动态服务")
public interface NewsInformationController {

    //广告展示
    String SHOW_NEWS = "/news/show";

    @ApiOperation(value = "广告展示", notes = "广告展示", protocols = "http,https", httpMethod = "get")
    SimpleDTO<Page<DNewsInformationDTO>> getNews(Integer pageIndex, Integer pageSize);

}
