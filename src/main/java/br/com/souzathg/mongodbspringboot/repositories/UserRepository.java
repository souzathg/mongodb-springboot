package br.com.souzathg.mongodbspringboot.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.souzathg.mongodbspringboot.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
