package tk.martijn_heil.well

class Well {
    companion object : WellImplementation {

        override val server: Server
            get() = implementation.server





        var implementation: WellImplementation
            get() = implementation
            set(value: WellImplementation) {
                implementation = value}
    }
}
