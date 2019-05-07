package com.dhgh.dhghdoor.web.Impl;

import com.dhgh.dhghdb.service.NewsInformationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsInformationControllerImplTest {

    @Autowired
    private NewsInformationService newsInformationService;

    @Test
    public void getNews() {
        System.out.println(newsInformationService.getPageNews(1,10).getRecords().size());
    }
}