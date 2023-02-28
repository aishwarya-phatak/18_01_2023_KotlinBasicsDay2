fun revRange(){
    var numbersRange = (-100..90).reversed().step(5)
    for (num in numbersRange){
        println(num)
    }
}
//switch case syntax in function f1
fun f1(){
    var number = 2
    when(number){
        1-> println("The number value is $number")
        2->{
            println("The case 2 matched")
            println("${number+2}")
        }
        in 50..100 ->{println("The case 100 is matched -- ${number+10}")}
        else-> println("No case matched")
    }
}

fun addition(){
    var num1 = 19
    var num2 = 120
    val num3 = 160
    var maximum : Int
    maximum = if(num1>num2){
        println("num1 is > that's why res is: ${num1+5}")
        num1+5
    } else {
        println("number 2 is > hence res is: ${num2+10}")
        num2+10
    }
    println("Max : $maximum")
}

fun main(){
    var p : Point = Point()
    //var p2 : Point = Point(10,90)
    var p1 : Point = Point(10,90)
    var p2 = p1
    println("${p.equals(p1)}")
    p1.display()
    p.display()
    println("p1 === p2 --> ${p1 === p2}")
    println("p1 == p2 --> ${p1 == p2}")
    addition()
    f1()
    revRange()
}