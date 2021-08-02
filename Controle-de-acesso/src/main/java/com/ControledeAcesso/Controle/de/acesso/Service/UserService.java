package com.ControledeAcesso.Controle.de.acesso.Service;

import com.ControledeAcesso.Controle.de.acesso.Model.User;
import com.ControledeAcesso.Controle.de.acesso.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }


    public Optional<User> getById(Long idUser) {
        return userRepository.findById(idUser);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserById(Long idUser) {
        userRepository.deleteById(idUser);
    }

}
