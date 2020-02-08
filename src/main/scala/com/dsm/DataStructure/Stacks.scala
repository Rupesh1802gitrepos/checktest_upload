package com.dsm.DataStructure
import scala.collection.mutable._

object Stacks {
  def main(args: Array[String]): Unit = {
    var s = Stack[Int]()
    s.push(100)
    s.push(200)
    s.push(300)

    println("s:" + s)
    var s2 = Stack[Int]()
    s2.push(5,1,2,3)

    println("s2:" + s2)

//    println("Popped:" + s.pop)
//    println("s:" + s)
//    println("Popped:" + s.pop)
//    println("s:" + s)
//    println("Popped:" + s.pop)
//    println("s:" +
    val l = s.map(x => println(x))

  }

}
