package com.spring.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(RedisApplication.class);

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AuthorRepository authorRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Author andyWeir = new Author();
		andyWeir.setFirstName("Andy");
		andyWeir.setLastName("Weir");
		authorRepository.save(andyWeir);
		logger.info(String.valueOf(authorRepository.findAll()));

		Book martian = new Book();
		martian.setName("Martian");
		martian.setSummary("One problem at a time and survive");
		bookRepository.save(martian);
		logger.info(String.valueOf(bookRepository.findAll()));
	}

}
