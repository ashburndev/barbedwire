package barbedwire
class Attachment {
    Date dateCreated
    Date lastUpdated
    static hasOne = [wireBinary:WireBinary]
    static belongsTo = [document:Document]
    static constraints = {
    }
}
