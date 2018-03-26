package domaineexercise

class LinkResource extends Resource{
    String url

    Date dateCreated
    Date dateUpdated

    static constraints = {
        url(url: true)
    }
}
