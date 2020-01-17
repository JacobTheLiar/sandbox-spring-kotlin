package pl.jacobtheliar.sandbox.kotlin.topic

import javax.persistence.Entity
import javax.persistence.Id

/**
 * @author: Jakub O.  [https://github.com/JacobTheLiar]
 * @date  : 17.01.2020 11:39
 **
 * @className: Topic
 **
 **
 ******************************************************/

@Entity
class Topic {

    @Id
    var id: Int = 0;
    var name: String = "";
    var description: String ="";


    constructor(id: Int) {
        this.id = id
    }
}