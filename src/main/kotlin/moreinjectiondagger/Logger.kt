package moreinjectiondagger

import javax.inject.Inject

class Logger @Inject constructor() {

  init {
    println("Logger created")
  }

  fun log(msg: String) {
    println("${System.currentTimeMillis()} - $msg")
  }
}