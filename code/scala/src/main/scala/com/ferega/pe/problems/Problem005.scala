package com.ferega.pe
package problems

import scala.annotation.tailrec

/** 2520 is the smallest number that can be divided by each of the numbers from
  * 1 to 10 without any remainder.
  *
  * What is the smallest positive number that is evenly divisible by all of the
  * numbers from 1 to 20?
  */
object Problem005 extends Problem(5) {
  def getPrimeList(number: Int): List[Int] = {
    @tailrec
    def getPrimeListDoit(number: Int, divisor: Int, primeList: List[Int]): List[Int] =
      number match {
        case x if x == divisor   => x :: primeList
        case x if x%divisor == 0 => getPrimeListDoit(x / divisor, divisor, divisor :: primeList)
        case x                   => getPrimeListDoit(x, divisor+1, primeList)
      }
    getPrimeListDoit(number, 2, Nil)
  }

  def getCounts(primeList: List[Int]) =
    primeList groupBy identity mapValues (_.size)

  def getMaxCounts(primeCountList: Seq[(Int, Int)]) =
    primeCountList.map(_._2).max

  def powPair(pair: (Int, Int)): Int =
    math.pow(pair._1, pair._2).toInt



  protected def solution = {
    val numList = 2 to 20
    val primeCounts = numList map getPrimeList flatMap getCounts
    val primeMaxCounts = primeCounts groupBy(_._1) mapValues getMaxCounts
    primeMaxCounts map powPair product
  }

}