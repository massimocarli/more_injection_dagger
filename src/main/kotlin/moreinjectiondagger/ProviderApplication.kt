package moreinjectiondagger

import javax.inject.Inject
import javax.inject.Provider

/**
 * Application which uses a Calculator and an IntReader in order to read
 * two integer from the standard input and make the sum
 */
class ProviderApplication @Inject constructor(
  private val calculator: Calculator,
  private val intReader: IntReader,
  private val logger: Provider<Logger>
) {

  fun execute() {
    val first = intReader.read()
    val providedLog = logger.get();
    providedLog.log("First value $first")
    val second = intReader.read()
    providedLog.log("Second value $second")
    val result = calculator.sum(first, second)
    providedLog.log("Result $result")
    println("$first + $second = $result")
    providedLog.log("End!")
  }
}
