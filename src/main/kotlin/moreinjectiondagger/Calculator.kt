package moreinjectiondagger

import javax.inject.Inject

/**
 * This is a simple calculator which adds 2 integers
 */
class Calculator @Inject constructor() {
  /**
   * Adds two integers
   */
  fun sum(a: Int, b: Int) = a + b
}
