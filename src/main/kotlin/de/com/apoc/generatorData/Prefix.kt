package de.com.apoc.generatorData

enum class Prefix(val skills: Set<Skill>) {
    Strong(setOf(Skill.Fight, Skill.Physique)),
    Agile(setOf(Skill.Athletics)),
    Fast(setOf(Skill.Athletics, Skill.Fight)),
    Smart(setOf(Skill.Investigate, Skill.Lore)),
    Shady(setOf(Skill.Burglary, Skill.Deceive, Skill.Stealth)),
    Evil(setOf(Skill.Burglary, Skill.Deceive)),
    Lovely(setOf(Skill.Contacts, Skill.Empathy)),
}