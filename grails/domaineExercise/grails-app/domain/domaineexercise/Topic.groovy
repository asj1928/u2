package domaineexercise

import java.beans.Visibility

class Topic {
    String name
    User createdBy
    Date dateCreated
    Date lastupdated

    domaineexercise.Visibility visibility

    static constraints = {
        name(unique: User,blank: false,nullable: false )
        createdBy(nullable: false)
        visibility(nullable: false)
    }
}
