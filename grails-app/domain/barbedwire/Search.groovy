package barbedwire
class Search {
    Date dateCreated
    Date lastUpdated
    static belongsTo = [wireUser:WireUser]
    static constraints = {
    }
}
