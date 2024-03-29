package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"), 
				new Topic("spring1", "Spring Framework1", "Spring Framework Description1"),
				new Topic("spring3", "Spring Framework2", "Spring Framework Description2")				
				);
	}
	
}
