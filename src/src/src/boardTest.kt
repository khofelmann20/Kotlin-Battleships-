import java.awt.Point
import java.util.Scanner
import java.util.Random;

fun main(){
    val reader = Scanner(System.`in`)
//   val rand = ListOf Random.nextInt(0,10)
    var shipX = arrayOf(1,2,3)
    var shipY = arrayOf(1,1,1)
    var ship2X = arrayOf(8,8,8)
    var ship2Y = arrayOf(2,3,4)
    var hit1 = 0
    var miss1 = 0
    var hit2 = 0
    var miss2 = 0
    var b = 0
    var a = 0
    var d = 0
    var c = 0
    var boardX = arrayOf(1,2,3,4,5)
    var boardY = arrayOf(1,2,3,4,5)


//    val point = Point(1,3)
//    println(point.x)
//    print("Player 1 x coordinate: ")
//    var integerx:Int = reader.nextInt()
//    point.x = integerx
//    println(point.x)
    val eo = "#"
  println("     _______________")
    println("  1 |_|_|_|_|_|_|_|_|")
    println("  2 |_|_|_|_|_|_|_|_|")
    println("  3 |_|_|_|_|_|_|_|_|")
    println("  4 |_|_|_|_|_|_|_|_|")
    println("  5 |_|_|_|_|_|_|_|_|")
    println("  6 |_|_|_|_|_|_|_|_|")
    println("  7 |_|_|_|_|_|_|_|_|")
    println("  8 |_|_|_|_|_|_|_|_|")
    println("     1 2 3 4 5 6 7 8 ")

    print("Enter a pointX: ")
    var integerx:Int = reader.nextInt()
    print("Enter a pointY: ")
    var integery:Int = reader.nextInt()
    println("$integerx and $integery")

    var point = Board()
    point.board(integerx,integery)


//    while (b < 3 && d < 3) {
//        print("Player 1 x coordinate: ");
//        var integerx:Int = reader.nextInt();// nextInt() reads the next integer from the keyboard
//
//        print("Player 1 y coordinate: ")
//        var integery:Int = reader.nextInt()
//
//
//        if (shipX[0] == integerx) {
//            if (shipY[0] == integery) {
//                hit1++
//                a++
//            }
//        } else {
//            miss1++
//        }
//        if (shipX[1] == integerx) {
//            if (shipY[0] == integery) {
//                hit1++
//                a++
//            }
//        } else {
//            miss1++
//        }
//        if (shipX[2] == integerx) {
//            if (shipY[0] == integery) {
//                hit1++
//                a++
//            }
//        } else {
//            miss1++
//        }
//        if (hit1 > 0) {
//            println(" HIT ")
//        } else {
//            println(" MISS ")
//        }
//        b = a
//        print("Player 2 x coordinate: ");
//        var integer2x:Int = reader.nextInt();// nextInt() reads the next integer from the keyboard
//
//        print("Player 2 y coordinate: ")
//        var integer2y:Int = reader.nextInt()
//
//        if (ship2Y[0] == integer2y) {
//            if (ship2X[0] == integer2x) {
//                hit2++
//                c++
//            }
//        } else {
//            miss2++
//        }
//        if (ship2Y[1] == integer2y) {
//            if (ship2X[0] == integer2x) {
//                hit2++
//                c++
//            }
//        } else {
//            miss2++
//        }
//        if (ship2Y[2] == integer2y) {
//            if (ship2X[0] == integer2x) {
//                hit2++
//                c++
//            }
//        } else {
//            miss2++
//        }
//        if (hit2 > 0) {
//            println(" HIT ")
//        } else {
//            println(" MISS ")
//        }
//
//        d = c
//
//        hit1 = 0
//        hit2 = 0
//    }


}