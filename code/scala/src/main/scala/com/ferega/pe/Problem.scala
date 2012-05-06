package com.ferega.pe

trait Problem extends Timer[String] {
  val Number: Int
  def run {
    val tr = time(solution)
    println("Problem %03d Time: %d ms".format(Number, tr.time))
    println("Problem %03d Solution: %s".format(Number, tr.result))
  }

  protected def solution: String
}
