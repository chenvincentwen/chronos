package com.huffingtonpost.chronos.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OtherController {
  
  @RequestMapping(value="/ping", method=RequestMethod.GET)
  public @ResponseBody String ping() {
    return "pong";
  }

}
