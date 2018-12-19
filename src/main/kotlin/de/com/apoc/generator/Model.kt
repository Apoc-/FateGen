package de.com.apoc.generator

open class FateEntity(val name: String,
                      val aspects: List<Aspect>)

class Aspect(val description: String)

open class Character(val description: String,
                     val skills: List<Skill>,
                     val stunts: List<Stunt>,
                     val stress: Int, name: String, aspects: List<Aspect>)
    : FateEntity(name, aspects)

class Skill(val name: String,
            val value: Int)

class Stunt(val name: String,
            val description: String)
