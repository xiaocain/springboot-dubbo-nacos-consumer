package com.li.dubbo.controller;



import com.li.api.dubbo.model.User;
import com.li.api.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {

  @DubboReference
  private UserService userService;


  @RequestMapping(value = "/tutorials", method = RequestMethod.POST)
  public void findByTitleContaining(String title) {
    User byUserId = userService.getByUserId(1);
    System.out.println(byUserId);
  }

}
