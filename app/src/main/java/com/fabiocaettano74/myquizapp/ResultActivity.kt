package com.fabiocaettano74.myquizapp

import android.content.Intent
import android.media.tv.TvView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

            var tvName : TextView  = findViewById(R.id.tv_name)
            tvName.text = intent.getStringExtra(Constants.USER_NAME)

            var tvScore : TextView =  findViewById(R.id.tv_score)
            val totalQuestions  = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

            val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

            tvScore.text = "Your Score is $correctAnswers  of $totalQuestions"

            var btnFinish: Button =  findViewById(R.id.btn_finish)
            btnFinish.setOnClickListener{
                startActivity(Intent(this,MainActivity::class.java))
            }
        }
    }


