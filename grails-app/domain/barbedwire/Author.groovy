package barbedwire
class Author {
    Date dateCreated
    Date lastUpdated
    String name
    static hasMany = [documents:Document]
    static constraints = {
    }
}
