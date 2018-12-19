package de.com.apoc

import de.com.apoc.generator.Difficulty
import de.com.apoc.generator.NpcGenerator
import de.com.apoc.generatorData.Location
import de.com.apoc.generatorData.Size
import de.com.apoc.generatorData.Skill
import kotlin.test.Test

class GeneratorTest {
    @Test
    fun testRaceGenerator() {
        val a = NpcGenerator.generateRace(Location.Dungeon, Size.Small)
        val b = NpcGenerator.generateRace(Location.Dungeon, Size.Large)
        val c = NpcGenerator.generateRace(Location.Forest, Size.Tiny)

        println("$a and $b and $c")
    }

    @Test
    fun testPrefixGenerator() {
        var diffs = Difficulty.values().toList().shuffled().take(10)

        diffs.forEach {
            val pre = NpcGenerator.generatePrefixes(it)
            val skills = mutableListOf<Skill>()

            pre.forEach {
                skills.addAll(it.skills)
            }

            println("Prefixes: " +
                    "${pre.joinToString(",")} " +
                    "with skills: ${skills.joinToString(",")}")
        }
        val a = NpcGenerator.generatePrefixes(Difficulty.Terrible)
    }
}
