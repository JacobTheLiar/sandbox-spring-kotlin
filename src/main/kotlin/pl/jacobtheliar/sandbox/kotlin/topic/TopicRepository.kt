package pl.jacobtheliar.sandbox.kotlin.topic

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date  : 17.01.2020 11:54
 **
 * @className: TopicRepository
 **
 **
 ******************************************************/
@Repository
interface TopicRepository : JpaRepository<Topic, Int> {


}