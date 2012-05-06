package com.ferega.pe

trait Timer[T] {
  case class TimedResult(result: T, time: Long)

  def time(f: => T): TimedResult = {
    val start = System.currentTimeMillis
    val result = f
    val end = System.currentTimeMillis
    TimedResult(result, end-start)
  }
}

