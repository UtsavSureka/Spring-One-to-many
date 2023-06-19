package com.springBoot;

import org.jpa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.entity.Comments;
import com.entity.Post;

@SpringBootApplication
public class SpringBootHibernateOneManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateOneManyMappingApplication.class, args);
	}
	
	@Autowired
	private PostRepository postRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Post post = new Post("one to many using jpa and hibernate","one to many using jpa and hibernate");
		
		Comments comment1 = new Comments("very useful");
		Comments comment2 = new Comments("Informative");
		Comments comment3 = new Comments("lovely");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		this.postRepository.save(post);
	}

}
