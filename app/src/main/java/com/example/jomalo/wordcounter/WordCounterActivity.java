package com.example.jomalo.wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText editText;
    TextView answerText;
    Button count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout.activity_word_counter);

        editText = findViewById(R.id.id.edit_text);
        answerText = findViewById(R.id.answer_text);
        count = findViewById(R.id.count);
    }
//
//    public void onCountWords(View button) {
//        String words = editText.getText().toString();
//        WordCounter wordCounter = new WordCounter();
//
//        int answer = wordCounter.splitInputIntoSeparateWords(String words);
//        answerText.setText(answer);
//    }

}