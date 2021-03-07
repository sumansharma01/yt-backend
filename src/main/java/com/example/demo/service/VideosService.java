package com.example.demo.service;

import com.example.demo.models.VideosModel;
import com.example.demo.repository.VideosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideosService {

    @Autowired
    private VideosRepo videosRepo;

    public List<VideosModel> getAllVideos(){
        return videosRepo.findAll();
    }

    public Optional<VideosModel> getVideoById(int id){
        return videosRepo.findById(id);
    }

    public String postVideo(VideosModel videosModel){
        videosRepo.save(videosModel);
        return "video saved successfully";
    }

    public String putVideo(int id,VideosModel videosModel){
        videosRepo.save(videosModel);
        return "updated successfully";
    }

    public String deleteVideo(int id){
        videosRepo.deleteById(id);
        return "deleted successfully";
    }

}
