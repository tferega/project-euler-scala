package com.ferega.pe
package problems

/** A palindromic number reads the same both ways. The largest palindrome made
  * from the product of two 2-digit numbers is 9009 = 91 × 99.
  *
  * Find the largest palindrome made from the product of two 3-digit numbers.
  */
object Problem004 extends Problem(4) {
  def isPalindrome(n: Int) =
    n.toString == n.toString.reverse

  def getProduct(pair: (Int, Int)) =
    pair._1 * pair._2

  protected def solution = {
    val pairList =
      for {
        i <- 100 to 999
        j <- i to 999
      } yield (i, j)

    pairList map getProduct filter isPalindrome max
  }

}