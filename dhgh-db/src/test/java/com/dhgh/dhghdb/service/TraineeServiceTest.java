package com.dhgh.dhghdb.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TraineeServiceTest {

    @Autowired
    private TraineeService traineeService;

    @Test
    public void getTraineeByNum() {
        System.out.println(traineeService.getTraineeByNum("146416416514").getDeleted());
    }

    @Autowired
    private NewsInformationService newsInformationService;

    @Test
    public void getNews() {
        System.out.println(newsInformationService.getPageNews(1,10).getRecords().size());
    }

}