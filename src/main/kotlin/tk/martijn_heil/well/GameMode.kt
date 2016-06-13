package tk.martijn_heil.well


enum class GameMode(id: Int, displayName: String) {
    SURVIVAL(0, "survival"),
    CREATIVE(1, "creative"),
    ADVENTURE(2, "adventure"),
    SPECTATOR(3, "spectator"),
}