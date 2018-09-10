package io;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class topicservice {

        private List<topicclass> topic = new ArrayList<>(Arrays.asList(
                new topicclass("Spring","springframework","spring framework desc"),
                new topicclass("java","core java","core java desc")
        ));


        public List<topicclass> getAlltopics()
        {
            return topic;
        }
        public void addTopic(topicclass topicc)
        {
            topic.add(topicc);
        }

        public topicclass getTopic(String id)
        {
           return topic.stream().filter(t-> t.getId().equals(id)).findFirst().get();
        }

    public void updateTopic(String id, topicclass topicc) {

        for (int i = 0; i < topic.size(); i++) {
            topicclass t=topic.get(i);
            if(t.getId().equals(id))
            {
                topic.set(i,topicc);
            }
        }
    }

    public void deleteTopic(String id, topicclass topicc) {

        for (int i = 0; i < topic.size(); i++) {
            topicclass t=topic.get(i);
            if(t.getId().equals(id))
            {
                topic.remove(i);
            }
        }
    }
}
