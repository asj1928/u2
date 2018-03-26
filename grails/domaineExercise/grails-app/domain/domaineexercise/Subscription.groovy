package domaineexercise

class Subscription {
    Topic topic
    User user

    Seriousness seriousness
    Date dateCreated

    static constraints = {
        topic(nullable: false ,unique: User)
        user(nullable: false)
        seriousness(nullable: false)



    }
}
