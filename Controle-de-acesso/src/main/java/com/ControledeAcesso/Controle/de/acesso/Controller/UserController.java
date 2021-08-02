package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.User;
import com.ControledeAcesso.Controle.de.acesso.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getUserList(){
        return userService.findAll();
    }
    @GetMapping("/{idUser}")
    public ResponseEntity<User> getUserById(@PathVariable("idUser") Long idUser) throws Exception{
        return ResponseEntity.ok(userService.getById(idUser).orElseThrow(() ->
                new NoSuchElementException("User not found")));
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{idUser}")
    public ResponseEntity<User>deleteUserById(@PathVariable("idUser") Long idUser) throws Exception{
        userService.deleteUserById(idUser);
        return (ResponseEntity<User>) ResponseEntity.ok();
    }

}
