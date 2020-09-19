package com.praveen.shethe.DomainLibraryManager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Praveenkumar on 9/19/2020.
 */
@RestController
@RequestMapping(value = "/domain", produces = MediaType.APPLICATION_JSON_VALUE)
public class DomainLibraryController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public HttpStatus status(){
        return HttpStatus.OK;
    }
}
