package lab.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import lab.main.hangman.HangmanFragment
import lab.main.wordstest.WordstestFragment

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val wordstestFragment = WordstestFragment()
		val hangmanFragment = HangmanFragment()
		val buttonToWordstest = findViewById<Button>(R.id.mainToWordstestButton)
		val buttonToHangman = findViewById<Button>(R.id.mainToHangmanButton)

		supportFragmentManager.beginTransaction().apply {
			replace(R.id.frameLayout, wordstestFragment)
			commit()
		}
		buttonToWordstest.visibility = View.GONE

		buttonToWordstest.setOnClickListener {
			buttonToWordstest.visibility = View.GONE
			buttonToHangman.visibility = View.VISIBLE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, wordstestFragment)
				commit()
			}
		}
		buttonToHangman.setOnClickListener {
			buttonToWordstest.visibility = View.VISIBLE
			buttonToHangman.visibility = View.GONE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, hangmanFragment)
				commit()
			}
		}
	}
}