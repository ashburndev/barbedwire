package barbedwire
class DocumentTopic {
    Date dateCreated
    Date lastUpdated
    String code
    static belongsTo = [document:Document]
    static constraints = {
    }
}
