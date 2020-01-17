package pl.jacobtheliar.sandbox.kotlin.course

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import pl.jacobtheliar.sandbox.kotlin.topic.Topic

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date  : 17.01.2020 12:57
 **
 * @className: CourseRepository
 **
 **
 ******************************************************/
@Repository
interface CourseRepository : JpaRepository<Course, Int> {


    fun findAllByTopic(topic: Topic): List<Course>;


}