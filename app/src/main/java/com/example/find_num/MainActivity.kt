package com.example.find_num

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number: Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint)
        textview_question.text = resources.getString(R.string.first_qsn)
    }
    fun downward(view: View){
        if(number==5){
            number = 3
            textview_question.text = resources.getString(R.string.second_qsn)
        }else if(number ==3){
            number =2
            textview_question.text = resources.getString(R.string.third_qsn)
        }else if(number==2){
            number =1
            textview_question.text = resources.getString(R.string.fourth_qsn)
        }else if(number ==7){
            number =6
            textview_question.text = resources.getString(R.string.tenth_qsn)
        }else if(number==9){
            number = 8
            textview_question.text = resources.getString(R.string.ninth_qsn)
        }

    }
    fun upward(view: View){
        if(number==3) {
            number = 4
            textview_question.text = resources.getString(R.string.fifth_qsn)
        }else if(number==5){
            number = 7
            textview_question.text = resources.getString(R.string.sixth_qsn)
        }
        else if(number==7){
            number = 9
            textview_question.text = resources.getString(R.string.seventh_qsn)
        }else if(number ==9){
            number = 10
            textview_question.text = resources.getString(R.string.eigth_qsn)
        }
    }
    fun success(view: View){
        textview_success.visibility = View.VISIBLE
        target_num.visibility = View.VISIBLE
        textview_success.text = resources.getString(R.string.success)
        textview_question.visibility = View.INVISIBLE
        target_num.text = resources.getString(R.string.target_num,number)

    }
    fun resetfun(view: View){
        textview_success.visibility = View.INVISIBLE
        target_num.visibility = View.INVISIBLE
        textview_question.visibility = View.VISIBLE
        number = 5
        textview_question.text = resources.getString(R.string.first_qsn)
    }
}