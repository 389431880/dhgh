package com.dhgh.dhghdoor.web;

import com.baomidou.mybatisplus.plugins.Page;
import com.dhgh.dhghcore.model.dto.SimpleDTO;
import com.dhgh.dhghdb.dao.dto.DNewsInformationDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = {"newsInformation-controller"},description = "新闻动态服务")
public interface NewsInformationController {

    //新闻展示
    String SHOW_NEWS = "/news/page";

    //根据id获取新闻详情
    String SHOW_NEWS_BY_ID ="/news/details/{id}";

    //无id获取新闻详情
    String SHOW_NEWS_WITHOUT_ID = "/news/details";

    @ApiOperation(value = "新闻展示", notes = "新闻展示", protocols = "http,https", httpMethod = "get")
    SimpleDTO<Page<DNewsInformationDTO>> getNews(Integer pageIndex, Integer pageSize);

    @ApiOperation(value = "根据id获取新闻详情/无id获取新闻详情", notes = "根据id获取新闻详情", protocols = "http,https", httpMethod = "get")
    SimpleDTO<DNewsInformationDTO> getNewsById(Integer id);
}
