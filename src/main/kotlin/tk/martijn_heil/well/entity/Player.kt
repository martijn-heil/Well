package tk.martijn_heil.well.entity

interface Player : OfflinePlayer, Comparable<Player> {
    val name: String

}