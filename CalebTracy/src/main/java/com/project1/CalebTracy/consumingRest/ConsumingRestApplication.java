package com.project1.CalebTracy.consumingRest;

import com.project1.CalebTracy.domain.YoutubeDetails;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumingRestApplication {

	RestTemplate template = new RestTemplate();

	public YoutubeDetails getDetails(String youtubeUrl) throws Exception {
		return template.getForObject(youtubeUrl, YoutubeDetails.class);
	}
}