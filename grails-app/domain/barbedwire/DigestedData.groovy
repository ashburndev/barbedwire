package barbedwire
class DigestedData {
    Date dateCreated
    Date lastUpdated   
    byte[] data
    static belongsTo = [mediaFile:MediaFile]
    static constraints = {
    }
}
