package ms_auth_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ms_auth_db.model.entities.User;
import ms_auth_db.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> selectAllUser(){
        return userService.selectAllUser();
    }
}

