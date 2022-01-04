package com.project1.CalebTracy.controller;

import com.project1.CalebTracy.domain.YoutubeDetails;
import com.project1.CalebTracy.service.YoutubeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/youtube")
public class YoutubeController {

    YoutubeService youtubeService;

    YoutubeController(YoutubeService youtubeService) {
        this.youtubeService = youtubeService;
    }

    @GetMapping("/name/{channel}") //gradle imports from spring @'s are annotations
    public YoutubeDetails getName(@PathVariable String channel) {

        YoutubeDetails details = youtubeService.gatherInformation(channel);
        return details;
    }

}
