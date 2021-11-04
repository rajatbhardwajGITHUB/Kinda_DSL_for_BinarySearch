fun main(){
    val list = listOf(1,3,5,7,9)

    //with extension function
    list.givenToBinary(5)

    //with infix function
    list searchWithBinary 5

    //with lambda
    val index = list.newWay(5)
    println("value is at $index index")

}