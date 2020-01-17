package pl.jacobtheliar.sandbox.kotlin.topic

import org.springframework.web.bind.annotation.*

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date  : 17.01.2020 12:00
 **
 * @className: TopicController
 **
 **
 ******************************************************/

@RestController
class TopicController(_topicService: TopicService) {

    private val topicService: TopicService = _topicService;


    @GetMapping("/topics")
    fun allTopics() = topicService.getAllTopics();

    @PostMapping("/topics")
    fun addTopic(@RequestBody _topic: Topic) = topicService.storeTopic(_topic);

    @PutMapping("/topics")
    fun updateTopic(@RequestBody _topic: Topic) = topicService.storeTopic(_topic);

    @GetMapping("/topics/{topicId}")
    fun getTopic(@PathVariable("topicId") _topicId: Int) = topicService.getTopic(_topicId);

    @DeleteMapping("/topics/{topicId}")
    fun removeTopic(@PathVariable("topicId") _topicId: Int) = topicService.removeTopic(_topicId);


}