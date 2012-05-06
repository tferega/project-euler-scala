package com.ferega.pe
package problems

import scala.annotation.tailrec

/** The prime factors of 13195 are 5, 7, 13 and 29.
  *
  * What is the largest prime factor of the number 600851475143 ?
  */
object Problem003 extends Problem(3) {
  val Target = 600851475143L

  @tailrec
  def divideUntilDone(number: Long, divisor: Long): Long =
    number match {
      case x if x == divisor   => x
      case x if x%divisor == 0 => divideUntilDone(x / divisor, divisor)
      case x                   => divideUntilDone(x, divisor+1)
    }

  protected def solution =
    divideUntilDone(Target, 2)
}