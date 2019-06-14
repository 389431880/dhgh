package com.dhgh.dhghdoor.web.Impl;

import com.dhgh.dhghdb.service.NewsInformationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsInformationControllerImplTest {

    @Autowired
    private NewsInformationService newsInformationService;

    @Test
    public void getNews() {

        List<Integer> list = Arrays.asList(6,2,3,5,4,1);

        //list.forEach(System.out::println);
        list.stream().map(i -> i*i).filter(i -> i>2).sorted().forEach(System.out::println);

        LocalDate today = LocalDate.now();

        new VervharImlpl().print("456");
    }

    interface Verchar{
        default void print(String a){
            System.out.println(a + "123");
        }
    }

    class VervharImlpl implements Verchar{
        @Override
        public void print(String a) {
            Verchar.super.print(a);
        }
    }
}