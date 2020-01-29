package moreinjectiondagger

import javax.inject.Inject

/**
 * Application which uses a Calculator and an IntReader in order to read
 * two integer from the standard input and make the sum
 */
class LazyApplication @Inject constructor(
  private val calculator: Calculator,
  private val intReader: IntReader,
  private val logger: dagger.Lazy<Logger>
) {

  fun execute() {
    val first = intReader.read()
    val lazyLog = logger.get();
    lazyLog.log("First value $first")
    val second = intReader.read()
    lazyLog.log("Second value $second")
    val result = calculator.sum(first, second)
    lazyLog.log("Result $result")
    println("$first + $second = $result")
    lazyLog.log("End!")
  }
}
