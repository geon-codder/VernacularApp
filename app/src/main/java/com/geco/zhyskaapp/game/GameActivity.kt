package com.geco.zhyskaapp.game

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.geco.zhyskaapp.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity(){

    private lateinit var binding: ActivityGameBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var bt1 = 0
        var bt5 = 0
        var bt6 = 0
        var bt7 = 0
        var bt8 = 0


        binding.apply{

            button1.setOnClickListener {
                bt1 += 1
                if (bt1 == 1 && bt5 == 1) {
                    btn1to5.visibility = View.GONE
                }else if (bt1 >= 2 || bt5 == 2){
                    btn1to5.visibility = View.VISIBLE
                    bt1 = 0
                    bt5 = 0
                }else if (bt1 >= 2 || bt6 == 2){
                    btn1to6.visibility = View.VISIBLE
                    bt1 = 0
                    bt6 = 0
                }else if (bt1 >= 2 || bt7 == 2){
                    btn1to7.visibility = View.VISIBLE
                    bt1 = 0
                    bt7 = 0
                }else if (bt1 >= 2 || bt8 == 2){
                    btn1to8.visibility = View.VISIBLE
                    bt1 = 0
                    bt8 = 0
                }
            }
            button5.setOnClickListener {
                bt5 += 1
                if (bt1 == 1 && bt5 == 1){
                    btn1to5.visibility = View.GONE
                }else if (bt1 == 2 || bt5 == 2){
                    btn1to5.visibility = View.VISIBLE
                    bt1 = 0
                    bt5 = 0
                }
            }
            button6.setOnClickListener {
                bt6 += 1
                if (bt1 == 1 && bt6 == 1){
                    btn1to6.visibility = View.GONE
                }else if (bt1 == 2 || bt6 == 2){
                    btn1to6.visibility = View.VISIBLE
                    bt1 = 0
                    bt6 = 0
                }
            }
            button7.setOnClickListener {
                bt7 += 1
                if (bt1 == 1 && bt7 == 1){
                    btn1to7.visibility = View.GONE
                }else if (bt1 == 2 || bt7 == 2){
                    btn1to7.visibility = View.VISIBLE
                    bt1 = 0
                    bt7 = 0
                }
            }
            button8.setOnClickListener {
                bt8 += 1
                if (bt1 == 1 && bt8 == 1){
                    btn1to8.visibility = View.GONE
                }else if (bt1 == 2 || bt8 == 2){
                    btn1to8.visibility = View.VISIBLE
                    bt1 = 0
                    bt8 = 0
                }
            }

        }
    }

}