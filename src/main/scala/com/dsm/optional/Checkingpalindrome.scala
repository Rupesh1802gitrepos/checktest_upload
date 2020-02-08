package com.dsm.optional

object Checkingpalindrome {
  def main(args: Array[String]): Unit = {

    val a:List[Int] = List(1,2,3,4,5,6,5,4,3,2)
    println(isPalindrome(a))
     if (a == a.reverse) {
       println("its palindrome")
     }


    def isPalindrome(list:List[Int]):Boolean =
    {
      list match {
    case Nil => true
    case _ :: Nil => true
    case list => (list.head == list.last && isPalindrome(list.tail.init))
    }
    }
  }

}
