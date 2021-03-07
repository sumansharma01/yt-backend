package com.example.demo.repository;

import com.example.demo.models.VideosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideosRepo extends JpaRepository<VideosModel,Integer> {
}
