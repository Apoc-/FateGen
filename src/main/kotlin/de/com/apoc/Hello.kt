package de.com.apoc

import tornadofx.*

/*
fun main(args: Array<String>) {
    println("Hello, World")
}*/



class MyView: View() {
    override val root = vbox {
        button("hallo")
        label("welt")
    }
}
