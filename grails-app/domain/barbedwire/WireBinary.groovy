package barbedwire
class WireBinary {
    Date dateCreated
    Date lastUpdated
    byte[] data
    static belongsTo = [document:Document]
    static constraints = {
    }
}
