package pl.jacobtheliar.sandbox.kotlin.course

import org.springframework.web.bind.annotation.*
import pl.jacobtheliar.sandbox.kotlin.topic.Topic


/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date  : 17.01.2020 13:01
 **
 * @className: CourseController
 **
 **
 ******************************************************/
@RestController
class CourseController(private val courseService: CourseService) {

    @GetMapping("/topics/{topicId}/courses")
    fun getAllCourses(@PathVariable("topicId") _topicId: Int) : List<Course>{
        val topic = Topic(_topicId);
        return courseService.getAllCoursesByTopic(topic);
    }


    @GetMapping("/topics/{topicId}/courses/{courseId}") // domyślnie GET
    fun getCourse(@PathVariable topicId: Int, @PathVariable courseId: Int): Course = courseService.getCourse(courseId).get();


    @PostMapping("/topics/{topicId}/courses/")
    fun addCourse(@RequestBody course: Course, @PathVariable topicId: Int) {
        course.topic = Topic(topicId)
        courseService.storeCourse(course)
    }


    @PutMapping("/topics/{topicId}/courses")
    fun updateCourse(@RequestBody course: Course, @PathVariable topicId: Int, @PathVariable courseId: Int) {
        course.topic = Topic(topicId)
        courseService.storeCourse(course)
    }


    @DeleteMapping("/topics/{topicId}/courses/{courseId}")
    fun deleteCourse(@PathVariable courseId: Int) {
        courseService.deleteCourse(courseId)
    }

}