import kotlin.system.exitProcess

/*CLASS OF PROVIDING FUNCTION FOR THIS BINARY SEARCH DSL
* Now DSL is Domain Specific Language
* For example lets take this Binary Search Operation or Domain
* Code written just to make underStanding the Binary search easier.
* We will create function which will be easy feel like we are reading english.
* LET'S GET TO IT*/

//PROVIDING FUNCTIONS
class BinaryProvidingFunction {

    //this will perform the binary search
    fun calBinary(list: List<Int>, requiredElement: Int): Int {
        //reg binary search
        val check = checkSorted(list)
        if(!check){
            println("need a sorted array")
            exitProcess(1)
        }else{
            val lastElement = list.size - 1
            for (i in 0..lastElement) {
                var mid = list.size / 2
                if (list[mid] == requiredElement) {
                    return mid
                } else if (list[mid] > requiredElement) {
                    mid -= 1
                } else {
                    mid += 1
                }
            }
            return -1
        }
    }

    //this one will check weather the list is sorted or not
    private fun checkSorted(list: List<Int>):Boolean{
        for (i in list.indices){
            if(i == list.size-1){ //MAKE SURES THAT THE INDEX DON'T GO OUT OF BOUNDS
                break
            }
            else{
                if( list[i] > list[i+1]){ //If the previous element in the list is bigger then the later then it is unsorted
                    return false
                }
                else{
                    continue
                }
            }
        }
        return true
    }
}