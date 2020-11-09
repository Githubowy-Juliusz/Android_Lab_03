package lab.main.hangman

import java.util.*

class Hangman(private val wordToGuess: String) {
	private val MAX_TRIES = 6
	private val _usedLetters = mutableListOf<Char>()

	var currentTry = 0
		private set
	val usedLetters: List<Char>
		get() {
			return Collections.unmodifiableList(_usedLetters)
		}
	val remainingTries: Int
		get() {
			return MAX_TRIES - currentTry
		}
	val encryptedWordToGuess: String
		get() {
			val tmpList = mutableListOf<Char>()
			for(c in wordToGuess) {
				if(c in _usedLetters)
					tmpList.add(c)
				else
					tmpList.add('_')
			}
			return tmpList.joinToString(separator = "")
		}

	fun guess(letter: Char): Boolean {
		if(letter in _usedLetters)
			return false
		currentTry++
		return true
	}


}