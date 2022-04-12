package barbedwire
class Document {
    String title
    String summary
    static hasMany = [comments:Comment]
    static constraints = {
    }
}
