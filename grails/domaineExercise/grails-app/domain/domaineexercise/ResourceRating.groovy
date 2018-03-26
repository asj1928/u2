package domaineexercise

class ResourceRating {
//    Resource resource
//    User user
    Integer score

    Date dateCreated
    Date dateUpdated

    static belongsTo = [resource:Resource,user:User]



    static constraints = {
        user(nullable: false ,unique: true)
        score(validator: {val->
            if(val in 1..5){return true}
            else {
                return false
            }
        },nullable: false)
        resource(nullable: false)
    }
}
