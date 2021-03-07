package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "videos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "video_name")
    private String videoName;

    @Column(name="video_views")
    private int videoViews;

    @Column(name = "upload_date")
    private String uploadDate;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name="channel_name")
    private String channelName;

    @Column(name="channel_logo")
    private String channelLogo;


    @Column (name="video_title")
    private String videoTitle;

    @Column (name="description")
    private String description;







}
