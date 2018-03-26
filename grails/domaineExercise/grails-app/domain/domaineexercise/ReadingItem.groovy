package domaineexercise

class ReadingItem {
//    Resource resource
//    User user
    boolean isRead

    Date dateCreated
    Date dateUpdated

    static belongsTo = [resource:Resource,user:User]

    static constraints = {
        resource(nullable: false,unique: 'user')
        user(nullable: false)
        isRead(nullable:false)

    }
}
