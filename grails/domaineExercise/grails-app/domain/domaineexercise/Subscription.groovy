package domaineexercise

class Subscription {
//    Topic topic
//    User user

    Seriousness seriousness
    Date dateCreated
    Date dateUpdated

    static belongsTo = [user:User,topic:Topic ]
    static constraints = {
        topic(nullable: false ,unique:'user')
        user(nullable: false)
        seriousness(nullable: false)



    }
}
