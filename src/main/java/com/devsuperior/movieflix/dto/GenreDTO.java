package com.devsuperior.movieflix.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.movieflix.entities.Genre;

public class GenreDTO {

    private Long id;
    private String name;
    
    public GenreDTO() {
    	
    }

    public GenreDTO(Genre entity) {
    	BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
