package lab.main.wordstest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import lab.main.R

class WordstestFragment :
	Fragment(R.layout.fragment_wordstest) {
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		val pointsText =
			view.findViewById<TextView>(R.id.wordstestPointsTextView)
		val wordCountText =
			view.findViewById<TextView>(R.id.wordstestWordCountTextView)
		val currentWordText =
			view.findViewById<TextView>(R.id.wordstestCurrentWordTextView)
		val wordInput = view.findViewById<EditText>(R.id.wordstestEnterWordEditText)
		val resultText =
			view.findViewById<TextView>(R.id.wordstestResultTextView)
		val confirmButton = view.findViewById<Button>(R.id.wordstestConfirmButton)

		val wordstest = Wordstest()

		fun updateFields() {
			pointsText.text = "Points: " + wordstest.points.toString()
			wordCountText.text = "Word count: " + wordstest.wordCount
			currentWordText.text = "Current word: " + wordstest.current
			wordInput.text.clear()
		}
		updateFields()
		resultText.text = ""

		confirmButton.setOnClickListener() {
			val input = wordInput.text.toString()
			if(wordstest.check(input))
				resultText.text = "Correct!"
			else
				resultText.text = "Wrong!"
			wordstest.next()
			updateFields()
		}
	}
}