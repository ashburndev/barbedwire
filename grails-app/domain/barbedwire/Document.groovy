package barbedwire
class Document {
    String title
    String summary
    static hasMany = [searches:Search, documents:Document, 
        countries:DocumentCountry, topics:DocumentTopic,
        authors:Author, nonStateActors:NonStateActor]
    static constraints = {
    }
}
