package innossh.springdata.jpa.example.controller;

import innossh.springdata.jpa.example.bean.UsersGetResponse;
import innossh.springdata.jpa.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public UsersGetResponse getUsers() {
        UsersGetResponse res = userService.getUsers();
        return res;
    }

}