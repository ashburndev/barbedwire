package barbedwire
class NonStateActor {
    Date dateCreated
    Date lastUpdated
    String name
    static hasMany = [comments:Comment]
    static constraints = {
    }
}
