package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Java7")
@Service
public class Java7CaculateService implements CalculateService {

    @Override
    public Integer sum(Integer... values) {
       int sum = 0;
       for(int i = 0;i<values.length;i++){
           sum += values[i];
       }

        return sum;
    }

    public static void main(String[] args) {
        CalculateService calculateService = new Java7CaculateService();
        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9,10));

    }
}
