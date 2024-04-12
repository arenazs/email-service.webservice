package org.controller;

import org.filters.AllowedAccess;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllowedAccess(property = "allowed.access")
public class EmailServiceController {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getEmailById(@RequestParam String id){
        return id;
    }

    @RequestMapping(value = "/username/{user}", method = RequestMethod.GET)
    public String getEmailByUserName(@RequestParam String userName){
        return userName;
    }
}
