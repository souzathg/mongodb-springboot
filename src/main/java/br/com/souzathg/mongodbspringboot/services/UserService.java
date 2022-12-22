package br.com.souzathg.mongodbspringboot.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;

import br.com.souzathg.mongodbspringboot.domain.User;
import br.com.souzathg.mongodbspringboot.dto.UserDTO;
import br.com.souzathg.mongodbspringboot.repositories.UserRepository;
import br.com.souzathg.mongodbspringboot.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        try {
            User user = repository.findById(id).get();
            return user;
        } catch (NoSuchElementException e) {
            throw new ObjectNotFoundException(e.getMessage());
        }
    }

    public User insert(User user) {
        return repository.insert(user);
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }

}
