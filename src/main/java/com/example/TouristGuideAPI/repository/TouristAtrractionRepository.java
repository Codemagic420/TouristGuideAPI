package com.example.TouristGuideAPI.repository;

import com.example.TouristGuideAPI.model.Tag;
import com.example.TouristGuideAPI.model.TouristAttraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristAtrractionRepository extends JpaRepository<TouristAttraction, String> {
}
