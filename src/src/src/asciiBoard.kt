
//import sun.jvm.hotspot.utilities.IntArray
//import sun.jvm.hotspot.utilities.IntArray



class Board{
    fun board(a: Int, b: Int){
        var list8 = arrayOf("+","_","_","_","_","_","_","_")
        var list7 = arrayOf("_","_","_","_","_","_","_","_")
        var list6 = arrayOf("_","_","_","_","_","_","_","_")
        var list5 = arrayOf("_","_","_","_","_","_","_","_")
        var list4 = arrayOf("_","_","_","_","_","_","_","_")
        var list3 = arrayOf("_","_","_","_","_","_","_","_")
        var list2 = arrayOf("_","_","_","_","_","_","_","_")
        var list1 = arrayOf("_","_","_","_","_","_","_","_")




//    val point = Point(1,3)
//    println(point.x)
//    print("Player 1 x coordinate: ")
//    var integerx:Int = reader.nextInt()
//    point.x = integerx
//    println(point.x)
        if(b == 8 || a ==8){
            list8[7] = "*"
        }


        println("     1 2 3 4 5 6 7 8 ")
        println("  1 |"+list8[0]+"|_|_|_|_|_|_|_|")
        println("  2 |_|_|_|_|_|_|_|_|")
        println("  3 |_|_|_|_|_|_|_|_|")
        println("  4 |_|_|_|_|_|_|_|_|")
        println("  5 |_|_|_|_|_|_|_|_|")
        println("  6 |_|_|_|_|_|_|_|_|")
        println("  7 |_|_|_|_|_|_|_|_|")
        println("  8 |_|_|_|_|_|_|_|_|")
        println("     ----------------")



    }


}