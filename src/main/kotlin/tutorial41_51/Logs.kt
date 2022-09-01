package tutorial41_51

import kotlin.properties.Delegates

class Logs(log: String) {
    var log: String by Delegates.observable(log){
        property, oldValue, newValue ->
            println("${property.name} chnaged value from $oldValue to $newValue")
    }
}