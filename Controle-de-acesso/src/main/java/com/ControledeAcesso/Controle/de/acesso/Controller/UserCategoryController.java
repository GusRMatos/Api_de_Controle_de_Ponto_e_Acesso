package com.ControledeAcesso.Controle.de.acesso.Controller;

import com.ControledeAcesso.Controle.de.acesso.Model.UserCategory;
import com.ControledeAcesso.Controle.de.acesso.Service.UserCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/UserCategory")
public class UserCategoryController {

    @Autowired
    UserCategoryService userCategoryService
            ;

    @PostMapping
    public UserCategory createUserCategory(@RequestBody UserCategory userCategory){
        return userCategoryService.saveUserCategory(userCategory);
    }

    @GetMapping
    public List<UserCategory> getUserCategoryList(){
        return userCategoryService.findAll();
    }
    @GetMapping("/{idUserCategory}")
    public ResponseEntity<UserCategory> getUserCategoryById(@PathVariable("idUserCategory") Long idUserCategory) throws Exception{
        return ResponseEntity.ok(userCategoryService.getById(idUserCategory).orElseThrow(() ->
                new NoSuchElementException("UserCategory not found")));
    }

    @PutMapping
    public UserCategory updateUserCategory(@RequestBody UserCategory userCategory){
        return userCategoryService.updateUserCategory(userCategory);
    }

    @DeleteMapping("/{idUserCategory}")
    public ResponseEntity<UserCategory>deleteUserCategoryById(@PathVariable("idUserCategory") Long idUserCategory) throws Exception{
        userCategoryService.deleteUserCategoryById(idUserCategory);
        return (ResponseEntity<UserCategory>) ResponseEntity.ok();
    }

}
