package com.geco.zhyskaapp.home.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivityLatihanSoalBinding

class LatihanSoalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLatihanSoalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatihanSoalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnLatToSoalBab4.setOnClickListener {
                val intent = Intent(this@LatihanSoalActivity, LatihanSoal4Activity::class.java)
                startActivity(intent)
            }
            btnLatToSoalBab5.setOnClickListener {
                val intent = Intent(this@LatihanSoalActivity, LatihanSoal5Activity::class.java)
                startActivity(intent)
            }
            btnLatToSoalBab6.setOnClickListener {
                val intent = Intent(this@LatihanSoalActivity, LatihanSoal6Activity::class.java)
                startActivity(intent)
            }
        }
    }
}