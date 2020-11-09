package lab.main

import lab.main.hangman.Hangman
import org.junit.Assert.assertEquals
import org.junit.Test

class HangmanTests {
	@Test
	fun test1() {
		val hangman = Hangman("test")
		assertEquals(0, hangman.currentTry)
		assertEquals(6, hangman.remainingTries)
		assertEquals(listOf<Char>(), hangman.usedLetters)
		assertEquals("____", hangman.encryptedWordToGuess)
	}

	@Test
	fun test2() {
		val hangman = Hangman("impeccable")
		assertEquals(0, hangman.currentTry)
		assertEquals(6, hangman.remainingTries)
		assertEquals(listOf<Char>(), hangman.usedLetters)
		assertEquals("__________", hangman.encryptedWordToGuess)
	}
}