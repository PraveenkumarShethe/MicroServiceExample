package com.praveen.shethe.AdministratorSupport.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

/**
 * Created by Praveenkumar on 8/19/2020.
 */
@RestController
@RequestMapping(value = "/admincontrol", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdminController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @Transactional(Transactional.TxType.NEVER)
    public String getAllBooks() {
        return "adminSupport is up";
    }

}
