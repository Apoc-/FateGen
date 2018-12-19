package de.com.apoc.generator

import de.com.apoc.generatorData.*

object NpcGenerator {
    fun generateNpc(difficulty: Difficulty,
                    encounterType: EncounterType,
                    location: Location,
                    size: Size): Any
    {
        val race = generateRace(location, size)
        val affixes = generatePrefixes(difficulty)

        TODO()
    }

    fun generatePrefixes(difficulty: Difficulty): List<Prefix> {
        val prefixCount = clamp(1, 3, difficulty.value)

        return Prefix.values().toList().shuffled().take(prefixCount)
    }

    fun generateRace(location: Location, size: Size): Race {
        val races = Race.values()
                .filter { it.locations.contains(location) }
                .filter { it.size.contains(size) }

        return races.shuffled().firstOrNull() ?: Race.Voidling
    }

    private fun clamp(lower: Int, upper: Int, value: Int): Int {
        if(value < lower) return lower
        if(value > upper) return upper

        return value
    }
}