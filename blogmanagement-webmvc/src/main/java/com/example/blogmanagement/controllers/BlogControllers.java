package com.example.blogmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blogmanagement.repositories.BlogRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.example.blogmanagement.beans.Topic;

@RestController
@RequestMapping(path="/api")
public class BlogControllers {
	@Autowired BlogRepository blogRepository;
	@GetMapping(path="/blogs")
	public Flux<Topic> getAll(){
		return blogRepository.findAll();
	}
	@GetMapping(path="/blogs/{id}")
	public Mono<Topic> getById(@PathVariable("id") String id){
		return blogRepository.findById(id);
	}
	@PostMapping(path="/blogs")
	public Flux<Topic> createBlogs(@RequestBody Flux<Topic> blogs){
		return blogRepository.saveAll(blogs);
	}
	@DeleteMapping
	public Mono<Void> deleteById(@PathVariable("id") String id){
		return blogRepository.deleteById(id);
	}
}
