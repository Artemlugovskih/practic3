import java.util.*

fun main() {
    //1
   val myAge=18
    println(myAge)
    val isTeenager=13<=myAge&&myAge<=19
    println(isTeenager)
    //2
    val theirAge=30
    val bothTeenager=13<=myAge&&13<=theirAge&&myAge<=19&&theirAge<=19
    println(bothTeenager)
    //3
    var reader="Artem"
    var author="Richard Lucas"
    val authorIsReader=(reader==author)
    println(authorIsReader)
 //4
   reader="Artem"
   author="Richard Lucas"
 val readerBeforeAuthor=author > reader
 println(readerBeforeAuthor)
    //5
    val myAge2=18
    if (13<=myAge2&&myAge2<=19){
        println("Подросток")
    }
    else{
        println("Не подросток")
    }
    //6
    val answer=myAge2
    if (13<=answer&&answer<=19){
        println("Подросток")
    }
    else
    {
        println("Не подросток")
    }
    //7
    var counter=0
    while (counter<10){
        var x:Int=counter
        counter++
        println(x)
    }
    //8
    var roll:Int=0
    do {
        roll= Random().nextInt(6)
        counter++
        println("После $counter бросков, roll равен $roll")
    }
    while(counter < 0)
    //9
    val range=Random().nextInt(10)
    val number=10
    var sum=0
    for (range in range..number) {
        print("range =$range=")
        sum=range*range
        println(sum)}
    //11
    var sum1:Int=0
    for(row in 1 until 8 step 2) {
        for(column in 0 until 8) {
            sum1+=row*column
        }
    }
    println(sum1)
}