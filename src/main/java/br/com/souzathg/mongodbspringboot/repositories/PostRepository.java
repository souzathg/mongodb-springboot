package br.com.souzathg.mongodbspringboot.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.souzathg.mongodbspringboot.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
