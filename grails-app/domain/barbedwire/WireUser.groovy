package barbedwire
class WireUser {
    Date dateCreated
    Date lastUpdated
    String firstName
    String lastName
    String email
    static hasMany = [searches:Search]
    static constraints = {
    }
}
