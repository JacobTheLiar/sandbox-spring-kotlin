package pl.jacobtheliar.sandbox.kotlin.topic

import org.springframework.stereotype.Service

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date  : 17.01.2020 11:55
 **
 * @className: TopicService
 **
 **
 ******************************************************/
@Service
class TopicService(_topicRepository: TopicRepository) {

    private val topicRepository: TopicRepository = _topicRepository;

    fun getAllTopics(): List<Topic> = topicRepository.findAll();
    fun storeTopic(_topic: Topic) = topicRepository.save(_topic);
    fun getTopic(_topicId: Int) = topicRepository.findById(_topicId);
    fun removeTopic(_topicId: Int) = topicRepository.deleteById(_topicId);


}