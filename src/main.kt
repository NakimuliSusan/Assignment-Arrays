fun main () {
    myArray(arrayOf("Susan","Tessa","Eunice","Ryan"))
    Orignal()
    reShuffle(arrayOf( 32,17,4,213,78,43,90,31,3,73,11,158,62))
    joined(arrayOf("Mary","Susan","Brenda","Grace"))
}
fun myArray (names:Array<String>) {
    println(names.contentToString())
}
fun Orignal () {
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")

    cities . forEach { city ->
        println(city.capitalize())
    }

}
fun reShuffle (num:Array<Int>) {
    var result = num[2] + num[5]
    println(result)
    var index = num.indexOf(158)
    println(index)
    var sortArray = num
    sortArray.sort()
    println(sortArray.contentToString())

}
fun joined (name:Array<String>):Array<String> {
    var names = name
    println(name.contentToString())
    return names

}


