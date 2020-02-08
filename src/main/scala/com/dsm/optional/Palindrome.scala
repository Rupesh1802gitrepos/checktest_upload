package com.dsm.optional

object Palindrome {

  def main(args: Array[String]): Unit = {
    def isnumberpalindrome(a:Int):Unit = {
      var rev_num = 0
      var r = 0
      var c = a
      println(c)
      while(c > 0) {
        r = c%10
        println(r)
        rev_num = (rev_num * 10) + r
        println(rev_num)
        c= c/10
        println(c)
      }
      println(c)
    }
    isnumberpalindrome(1976)
  }

}
