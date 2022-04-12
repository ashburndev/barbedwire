package barbedwire
class Comment {
    String body
    static belongsTo = [document:Document]
    static constraints = {
    }
}
