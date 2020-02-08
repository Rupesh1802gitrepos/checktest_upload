package com.dsm.optional

object fibonaci {
  def main(args: Array[String]): Unit = {
    println(fibonaci(10))

    def fibonaci(a: Int): Unit = {
      var term1: Int = 0
      var nextterm: Int = 0
      var term2: Int = 1
      for (i <- 0 until a) {
        if (i == 0) {
          println(0)
        }
        if (i == 1) {
          println(1)
        }
        if (i > 1) {
          nextterm = term1 + term2
          term1 = term2
          term2 = nextterm
          println(nextterm)
        }
      }

    }
  }
}


