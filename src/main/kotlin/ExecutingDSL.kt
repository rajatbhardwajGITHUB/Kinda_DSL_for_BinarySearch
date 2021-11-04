//with extension function
fun List<Int>.givenToBinary(requiredElement: Int) {
    val search = BinaryProvidingFunction()
    val Index = search.calBinary(this, requiredElement)
    println("value is at $Index th index")


}

//with infix function
infix fun List<Int>.searchWithBinary(reqElement: Int) {
    val search = BinaryProvidingFunction()
    val index = search.calBinary(this, reqElement)
    println("value is at $index index ")
}
//with lambdas


val newWay: List<Int>.(Int) -> Int = {
    val binarycall = BinaryProvidingFunction()
    val elementIndex = binarycall.calBinary(this, it)
    elementIndex
}





