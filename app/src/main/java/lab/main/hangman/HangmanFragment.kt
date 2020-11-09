package lab.main.hangman

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import lab.main.R

class HangmanFragment :
	Fragment(R.layout.fragment_hangman) {
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		val tryNumberText =
			view.findViewById<TextView>(R.id.hangmanTryNumberTextView)
		val wordToGuessText =
			view.findViewById<TextView>(R.id.hangmanWordToGuessTextView)
		val usedLettersText =
			view.findViewById<TextView>(R.id.hangmanUsedLettersTextView)
		val remainingTriesText =
			view.findViewById<TextView>(R.id.hangmanRemainingTriesTextView)
		val letterInput = view.findViewById<EditText>(R.id.hangmanLetterEditText)
		val confirmButton = view.findViewById<Button>(R.id.hangmanConfirmButton)
	}
}