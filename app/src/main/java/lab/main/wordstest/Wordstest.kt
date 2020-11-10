package lab.main.wordstest

class Wordstest {
	private val dictionary = mapOf(
		"gruszka" to "pear", "ananas" to "pineapple",
		"woda" to "water", "drukarka" to "printer"
	)
	var current = dictionary.keys.random()
		private set
	var points = 0
		private set
	var wordCount = 0
		private set

	fun next() {
		wordCount++
		val tmpCurrent = current
		current = dictionary.keys.random()
		while(tmpCurrent == current)
			current = dictionary.keys.random()
	}

	fun check(str: String): Boolean {
		val bool = str == dictionary[current]
		if(bool)
			points++
		return bool
	}
}