package com.example.SingleGateWayService.service;

import org.springframework.stereotype.Service;

/**
 * Created by Praveenkumar on 9/7/2020.
 */
@Service
public class RestTemplete {

    private static RestTemplete restTemplete = null;

    private RestTemplete(){}

    public RestTemplete getRestTemplete(){
        if (restTemplete == null){
            restTemplete = new RestTemplete();
        }
        return restTemplete;
    }
}
