package br.com.souzathg.mongodbspringboot.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.souzathg.mongodbspringboot.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
