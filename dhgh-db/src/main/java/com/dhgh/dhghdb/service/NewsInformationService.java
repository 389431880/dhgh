package com.dhgh.dhghdb.service;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dhgh.dhghdb.dao.domain.DNewsInformation;
import com.dhgh.dhghdb.dao.mapper.DNewsInformationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class NewsInformationService extends ServiceImpl<DNewsInformationMapper, DNewsInformation> {

    @Resource
    private DNewsInformationMapper dNewsInformationMapper;

    public Page<DNewsInformation> getPageNews(Integer pageIndex, Integer pageSize){
        Page<DNewsInformation> page = new Page<>(pageIndex,pageSize,"create_time");
        page.setAsc(false);

        EntityWrapper<DNewsInformation> wrapper = new EntityWrapper<>();
        wrapper.eq("enabled",1);
        wrapper.eq("deleted",0);

        return selectPage(page, wrapper);
    }

    public DNewsInformation getDNewsInformationById(Integer id){
        EntityWrapper<DNewsInformation> wrapper = new EntityWrapper<>();
        wrapper.eq("enabled",1);
        wrapper.eq("deleted",0);
        wrapper.eq("id",id);

        return selectOne(wrapper);
    }


}
