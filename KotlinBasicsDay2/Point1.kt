//primary constructor syntax for class Point1 in Kotlin
class Point1(var x : Int, var y : Int) {

    constructor() : this(0,0){
        println("This is secondary constructor called")
    }

    constructor(coordinate : Int) : this(coordinate,coordinate){
        println("---This is secondary constructor called--")
    }
    fun display() : Int{
        println("The display function called")
        println("$x -- $y")
        return 1
    }

    fun show(){
        println("The show function called")
        println("$x -- $y")
    }
}