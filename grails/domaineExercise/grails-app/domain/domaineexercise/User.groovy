package domaineexercise

class User {
    String email
    String userName
    transient String name
    String password
    String firstName
    byte photo
    boolean admin
    boolean active
    Date dateCreated
    Date dateUpdated
    static hasMany = [topics:Topic,subscriptions:Subscription,readingItems:ReadingItem,resources:Resource]


    static constraints = {
        email(unique: true ,nullable: false,blank: false, email: true)
        password(size: 5..20,nullable: false,blank: false)
        firstName(nullable: false,blank: false)
        userName(nullable: false,blank: false)
        photo(nullable:true)
        admin(nullable:true)
        active(nullable:true)


    }
    static mapping = {
        photo(sqlType: "longblob")
    }
}
