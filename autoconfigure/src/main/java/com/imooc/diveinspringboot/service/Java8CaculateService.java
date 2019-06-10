package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Profile("Java8")
@Service
public class Java8CaculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
       int sum = Stream.of(values).reduce(0,Integer::sum);

        return sum;
    }

    public static void main(String[] args) {
        CalculateService calculateService = new Java8CaculateService();
        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9,10));

    }
}
