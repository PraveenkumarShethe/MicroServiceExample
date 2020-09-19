package com.praveen.shethe.TechSupport.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Praveenkumar on 8/19/2020.
 */
@RestController
@RequestMapping(value = "/support", produces = MediaType.APPLICATION_JSON_VALUE)
public class SupportController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public HttpStatus status(){
        return HttpStatus.OK;
    }

}
