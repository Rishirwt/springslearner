package io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class topicController {

    @Autowired
    private topicservice topicservice;


    @RequestMapping("/topics")
    public List<topicclass> getalltopics()
    {
    return topicservice.getAlltopics();
    }

    @RequestMapping("/topics/{id1}")
    public topicclass getTopic(@PathVariable("id1") String id)
    {
        return topicservice.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody topicclass topic)
    {
        topicservice.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody topicclass topic,@PathVariable String id)
    {
        topicservice.updateTopic(id,topic);
    }
    @RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@RequestBody topicclass topic,@PathVariable String id)
    {
        topicservice.deleteTopic(id,topic);
    }
}



