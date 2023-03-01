class Point {
    private var x : Int = 0
    private var y : Int = 0

    //secondary constructors
    constructor(){
        println("secondary constructor called")
        x = 0
        y = 0
    }

    //secondary constructors
    constructor(x : Int,y:Int){
        println("secondary -- constructor called")
        this.x = x
        this.y = y
    }

    fun display(){
        println("x value : $x")
        println("y value : $y")
    }

    override fun equals(other: Any?): Boolean {
        println("Equals method is called")
        var point = other as Point      //typecasting
        if(this.x == point.x){
            return true
        }
        return this.y == point.y
    }
}