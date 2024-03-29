package com.ferega.pe
package problems

import scala.annotation.tailrec

/** Each new term in the Fibonacci sequence is generated by adding the previous
  * two terms. By starting with 1 and 2, the first 10 terms will be:
  * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  *
  * By considering the terms in the Fibonacci sequence whose values do not
  * exceed four million, find the sum of the even-valued terms.
  */
object Problem002 extends Problem(2) {
  val Limit = 4000000

  @tailrec
  private def fibonacci(prev: Int, curr: Int, sum: Long): Long = {
    val next = prev + curr

    if (next > Limit) {
      sum
    } else {
      if (next%2 == 0) {
        fibonacci(curr, next, sum+next)
      } else {
        fibonacci(curr, next, sum)
      }
    }
  }


  protected def solution =
    fibonacci(0, 1, 0)
}
