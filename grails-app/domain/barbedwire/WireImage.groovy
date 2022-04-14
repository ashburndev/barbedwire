package barbedwire
class WireImage {
    Date dateCreated
    Date lastUpdated
    static belongsTo = [wireBinary:WireBinary]
    static constraints = {
    }
}
