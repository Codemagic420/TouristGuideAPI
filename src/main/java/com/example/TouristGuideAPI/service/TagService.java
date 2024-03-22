package com.example.TouristGuideAPI.service;


import com.example.TouristGuideAPI.model.Tag;
import com.example.TouristGuideAPI.repository.TagRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {


    private final TagRepository tagRepository;

    public TagService(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    public List<Tag> getAllTags() {
        return this.tagRepository.findAll();
    }
}
