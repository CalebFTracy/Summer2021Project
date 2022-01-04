package com.project1.CalebTracy.service;

import com.project1.CalebTracy.domain.YoutubeDetails;
import com.project1.CalebTracy.webclient.YoutubeClient;
import org.springframework.stereotype.Service;

import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class YoutubeService {
    public YoutubeDetails gatherInformation(String channelName) {

        String baseUrl = "https://www.youtube.com/c/";
        YoutubeClient client = new YoutubeClient();
        String rawHtml = client.getDetails(baseUrl + channelName);
        // TODO go through the html and get what you want
        YoutubeDetails details = new YoutubeDetails();
        // scraping youtube with raw-html
        return details;
    }

}
