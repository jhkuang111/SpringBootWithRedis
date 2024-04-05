package com.spring.redis;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

/*
Use the @RedisHash annotation of Spring Data Redis to map the Author entity with the book hash in the Redis datastore.
*/

@Data
@RedisHash("author")
public class Author {

    private String id;
    private String firstName;
    private String lastName;

    private List<Book> books;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ((null != books) ? ", books=" + books.stream().map(Book::getName).toList() + '\'' : "") +
                '}';
    }
}
