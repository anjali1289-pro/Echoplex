package com.echoplex.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.echoplex.entities.Post;
import com.echoplex.repositories.PostRepo;

@Service
public class PostServiceImplementation implements PostService{
	
	@Autowired
	PostRepo repo;

	@Override
	public void createPost(Post post) {
		repo.save(post);
	}

	@Override
	public List<Post> getAllPosts() {
		return repo.findAll();
	}

	@Override
	public List<Post> fetchAllPosts() {
		return repo.findAll();
	}
	
	@Override
	public Post getPost(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public void updatePost(Post post) {
		repo.save(post);
	}

}
