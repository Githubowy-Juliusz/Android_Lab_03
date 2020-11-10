package lab.main

import lab.main.wordstest.Wordstest
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Test

class WordstestTests {
	@Test
	fun test1() {
		val wordstest = Wordstest()
		val tmpCurrent = wordstest.current
		wordstest.next()
		assertNotEquals(tmpCurrent, wordstest.current)
		assertFalse(wordstest.check("qweqjhekqjbqk"))
	}
}