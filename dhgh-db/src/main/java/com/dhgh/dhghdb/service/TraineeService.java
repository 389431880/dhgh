package com.dhgh.dhghdb.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dhgh.dhghdb.dao.domain.DTrainee;
import com.dhgh.dhghdb.dao.mapper.DTraineeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TraineeService extends ServiceImpl<DTraineeMapper, DTrainee> {

    @Resource
    private DTraineeMapper dTraineeMapper;

    /**
     * 根据学生唯一id(number) 查询学生信息
     */
    public DTrainee getTraineeByNum(String number){
        EntityWrapper<DTrainee> wrapper = new EntityWrapper<>();
        wrapper.eq("enabled",1);
        wrapper.eq("deleted",0);
        wrapper.eq("number",number);

        return selectOne(wrapper);
    }

}
