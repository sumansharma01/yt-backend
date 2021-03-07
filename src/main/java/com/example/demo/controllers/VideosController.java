package com.example.demo.controllers;

import com.example.demo.models.VideosModel;
import com.example.demo.service.VideosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/youtube/api/")
@CrossOrigin(origins = "*")
public class VideosController {

    @Autowired
    private VideosService videosService;

    @GetMapping("/videos")
    public List<VideosModel> getAllVideos(){
        return videosService.getAllVideos();
    }

    @GetMapping("/videos/{id}")
    public Optional<VideosModel> getVideoById(@PathVariable int id){
        return videosService.getVideoById(id);
    }

    @PostMapping("/videos")
    public String postVideo(@RequestBody VideosModel videosModel){
        videosService.postVideo(videosModel);
        return "video uploaded successfully";

    }

    @PutMapping("/videos/{id}")
    public String putVideo(@PathVariable int id, @RequestBody VideosModel videosModel){
        String message=videosService.putVideo(id,videosModel);
        return message;
    }

    @DeleteMapping("/video/{id}")
    public String deleteVideo(@PathVariable int id){
        String message=videosService.deleteVideo(id);
        return message;
    }
}
