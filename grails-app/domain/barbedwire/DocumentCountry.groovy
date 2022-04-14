package barbedwire
class DocumentCountry {
    Date dateCreated
    Date lastUpdated
    String code
    static belongsTo = [document:Document]
    static constraints = {
    }
}
