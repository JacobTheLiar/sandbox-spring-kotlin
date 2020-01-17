package pl.jacobtheliar.sandbox.kotlin.course

import pl.jacobtheliar.sandbox.kotlin.topic.Topic
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date  : 17.01.2020 12:53
 **
 * @className: Course
 **
 **
 ******************************************************/
@Entity
class Course {

    @Id
    var id: Int = 0;
    var name: String = "";
    var description: String = "";

    @ManyToOne
    lateinit var topic: Topic;

}