package barbedwire
class Comment {
    Date dateCreated
    Date lastUpdated
    String body
    static belongsTo = [document:Document]
    static constraints = {
    }
}
