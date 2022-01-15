package com.project1.CalebTracy.service;

import com.project1.CalebTracy.domain.YoutubeDetails;
import com.project1.CalebTracy.webclient.YoutubeClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class YoutubeService {
    public YoutubeDetails gatherInformation(String channelName) {
        try {
            String baseUrl = "https://www.youtube.com/c/";
            return getDetails(baseUrl + channelName);
        } catch (Exception E) {
            return null;
        }
    }

    RestTemplate template = new RestTemplate();

    public YoutubeDetails getDetails(String youtubeUrl) throws Exception {
        String response = template.getForObject(youtubeUrl, String.class);
        YoutubeDetails details = new YoutubeDetails();
        //pulling out details
        return details;
    }

}
