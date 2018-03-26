package domaineexercise


class Topic {
    String name
//    User createdBy
    Date dateCreated
    Date lastupdated

    domaineexercise.Visibility visibility

    static belongsTo = [createdBy:User]
    static hasMany = [subscriptions:Subscription,resources:Resource]

    static constraints = {
       name(unique:'createdBy',blank: false,nullable: false )
        createdBy(nullable: false)
        visibility(nullable: false)
    }
}
