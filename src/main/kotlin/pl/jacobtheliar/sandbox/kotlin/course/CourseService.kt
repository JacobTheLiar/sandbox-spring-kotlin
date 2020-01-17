package pl.jacobtheliar.sandbox.kotlin.course

import org.springframework.stereotype.Service
import pl.jacobtheliar.sandbox.kotlin.topic.Topic
import java.util.*

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date  : 17.01.2020 12:59
 **
 * @className: CourseService
 **
 **
 ******************************************************/
@Service
class CourseService(private val courseRepository: CourseRepository) {

    fun getCourse(_courseId: Int): Optional<Course> = courseRepository.findById(_courseId);
    fun storeCourse(_course: Course) = courseRepository.save(_course);
    fun deleteCourse(_courseId: Int) = courseRepository.deleteById(_courseId);
    fun getAllCoursesByTopic(topic: Topic) = courseRepository.findAllByTopic(topic);

}