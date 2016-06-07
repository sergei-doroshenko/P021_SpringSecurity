package org.sergei.rest.api.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/device")
@Secured("ROLE_ADMIN")
public class DeviceService
{
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String findAll()
    {
        return "Hello, Sergei!";
    }
}
