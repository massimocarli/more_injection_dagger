package moreinjectiondagger

import javax.inject.Inject
import javax.inject.Provider

/**
 * Application which uses a Calculator and an IntReader in order to read
 * two integer from the standard input and make the sum
 */
class ProviderRepeatApplication @Inject constructor(
  private val calculator: Calculator,
  private val intReader: IntReader,
  private val logger: Provider<Logger>
) {

  fun execute() {
    val first = intReader.read()
    logger.get().log("First value $first")
    val second = intReader.read()
    logger.get().log("Second value $second")
    val result = calculator.sum(first, second)
    logger.get().log("Result $result")
    println("$first + $second = $result")
    logger.get().log("End!")
  }
}
