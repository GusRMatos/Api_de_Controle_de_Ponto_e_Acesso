package com.ControledeAcesso.Controle.de.acesso.Service;


import com.ControledeAcesso.Controle.de.acesso.Model.UserCategory;
import com.ControledeAcesso.Controle.de.acesso.Repository.UserCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserCategoryService {

    UserCategoryRepository userCategoryRepository;

    @Autowired
    public UserCategoryService(UserCategoryRepository userCategoryRepository) {
        this.userCategoryRepository = userCategoryRepository;
    }

    public UserCategory saveUserCategory(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);
    }

    public List<UserCategory> findAll(){
        return userCategoryRepository.findAll();
    }


    public Optional<UserCategory> getById(Long idUserCategory) {
        return userCategoryRepository.findById(idUserCategory);
    }

    public UserCategory updateUserCategory(UserCategory userCategory){
        return userCategoryRepository.save(userCategory);
    }

    public void deleteUserCategoryById(Long idUserCategory) {
        userCategoryRepository.deleteById(idUserCategory);
    }

}
