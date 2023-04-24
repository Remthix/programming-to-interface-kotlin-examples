package patterns

interface AnalyticsAdapter {
    fun trackEvent(eventName: String, properties: Map<String, Any>)
}

class GoogleAnalyticsAdapter : AnalyticsAdapter {
    // Implementation details...
    override fun trackEvent(eventName: String, properties: Map<String, Any>) {
        TODO("Not yet implemented")
    }
}

class FlurryAdapter : AnalyticsAdapter {
    // Implementation details...
    override fun trackEvent(eventName: String, properties: Map<String, Any>) {
        TODO("Not yet implemented")
    }
}