import org.codeoverflow.chatoverflow.api.plugin.PluginImpl
import org.codeoverflow.chatoverflow.api.plugin.PluginManager

class KotlinTemplatePlugin(manager: PluginManager) : PluginImpl(manager) {

    // Kotlin's init is called after constructing by any constructor.
    init {
        // We can change the loop interval here.
        loopInterval = 2500
    }

    // Other Requirements can be added here.
    private val sampleReq = require.input.sample("sampleReq")

    // Gets called when the plugin gets started.
    override fun setup() {
        log("Kotlin Sample Plugin initialized")
    }

    // Gets called every in the above specified interval, can be disabled by setting the interval to 0.
    override fun loop() {
        log("Loop...")
    }

    // Gets called when the plugin gets stopped
    override fun shutdown() {
        log("Kotlin Sample Plugin is shutting down")
    }
}