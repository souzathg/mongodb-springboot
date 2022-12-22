package br.com.souzathg.mongodbspringboot.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.souzathg.mongodbspringboot.domain.Post;
import br.com.souzathg.mongodbspringboot.repositories.PostRepository;
import br.com.souzathg.mongodbspringboot.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Post findById(String id) {
        try {
            Post post = repository.findById(id).get();
            return post;
        } catch (NoSuchElementException e) {
            throw new ObjectNotFoundException(e.getMessage());
        }
    }

    public List<Post> findByTitle(String text) {
        return repository.findByTitleContainingIgnoreCase(text);
    }

}
