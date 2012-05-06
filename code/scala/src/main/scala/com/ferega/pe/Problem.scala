package com.ferega.pe

abstract class Problem(val number: Int) extends Timer[Long] {
  def run {
    val tr = time(solution)
    println("Problem %03d Time:     %d ms".format(number, tr.time))
    println("Problem %03d Solution: %s".format(number, tr.result))
  }

  protected def solution: Long
}
