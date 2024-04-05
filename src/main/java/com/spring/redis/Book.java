package com.spring.redis;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

/*
Use the @RedisHash annotation of Spring Data Redis to map the Book entity with the book hash in the Redis datastore.
*/

@Data
@RedisHash
public class Book {

    private String id;
    private String name;
    private String summary;

    private List<Author> authors;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", summary='" + summary + '\'' +
                ((null != authors) ? ", authors=" + authors.stream().map(Author::getFullName).toList() + '\'' : "") +
                '}';
    }
}
