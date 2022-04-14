package barbedwire
class MediaFile {
    Date dateCreated
    Date lastUpdated
    String mimeType
    static belongsTo = [attachment:Attachment, digestedData:DigestedData]
    static constraints = {
    }
}
