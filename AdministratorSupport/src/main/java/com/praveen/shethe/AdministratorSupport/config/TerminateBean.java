package com.praveen.shethe.AdministratorSupport.config;

import javax.annotation.PreDestroy;

/**
 * Created by Praveenkumar on 10/2/2020.
 */
public class TerminateBean {
    @PreDestroy
    public void onDestroy() throws Exception {
        System.out.println("Spring Container is destroyed!");
    }
}
