package de.com.apoc.generatorData

enum class Race(val locations: Set<Location>, val size: Set<Size>) {
    Voidling(setOf(), setOf()),
    Rat(setOf(Location.Dungeon), setOf(Size.Small)),
    Goblin(setOf(Location.Dungeon, Location.Forest), setOf(Size.Small)),
    Dragon(setOf(Location.Dungeon), setOf(Size.Large))
}
