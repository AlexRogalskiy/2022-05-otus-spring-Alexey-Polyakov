package ru.otus.spring.hw09.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.otus.spring.hw09.domain.Comment;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {

    @Override
    List<Comment> findAllById(Iterable<String> ids);
}
