package moreinjectiondagger

import java.util.*
import javax.inject.Inject

/**
 * Reads an int value from the stdin
 */
class IntReader @Inject constructor() {

  private val scanner = Scanner(System.`in`)

  /**
   * Read an Int value
   */
  fun read() = scanner.nextInt()
}
