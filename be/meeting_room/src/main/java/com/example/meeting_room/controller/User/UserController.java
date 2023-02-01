package com.example.meeting_room.controller.User;

import com.example.meeting_room.models.user.Account;
import com.example.meeting_room.models.user.User;
import com.example.meeting_room.service.IAccountService;
import com.example.meeting_room.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private IAccountService iAccountService;

    @PostMapping("/add-user")
    public ResponseEntity<User> categoryResponseEntity(@RequestBody User user){
        iUserService.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/get-user")
    public ResponseEntity<List<User>> list(){
        List<User> userList  = iUserService.getAll();
        return new ResponseEntity<>(userList,HttpStatus.OK);
    }


//-----------------account---------------


    @PostMapping("/add-account")
    public ResponseEntity<Account> saveAccount(@RequestBody Account account){
        iAccountService.save(account);
        return new ResponseEntity<Account>(HttpStatus.OK);
    }

    @GetMapping("/get-account")
    public ResponseEntity<List<Account>> listAccount(){
        List<Account> accountList = iAccountService.getAll();
        return new ResponseEntity<>(accountList,HttpStatus.OK);
    }
}
