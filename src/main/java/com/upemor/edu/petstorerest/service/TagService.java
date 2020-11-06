package com.upemor.edu.petstorerest.service;


import java.util.List;

import com.upemor.edu.petstorerest.model.Tag;

public interface TagService {
	
	//Operaciones crud en base de datos
	
	List<Tag> listAllTags();
	
	Tag findById(int id);
	
	void createTag(Tag tag);
	
	Tag updateTag(int id, Tag tag);
	
	void deleteTag(int id);

}