package barbedwire
class PdfBook {
    Date dateCreated
    Date lastUpdated
    String title
    String summary
    static hasMany = [comments:Comment]
    static constraints = {
    }
}
