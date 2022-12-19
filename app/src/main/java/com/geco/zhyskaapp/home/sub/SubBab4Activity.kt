package com.geco.zhyskaapp.home.sub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivitySubBab4Binding
import com.geco.zhyskaapp.home.sub.bab4.Berbicara4Activity
import com.geco.zhyskaapp.home.sub.bab4.Membaca4Activity
import com.geco.zhyskaapp.home.sub.bab4.Menulis4Activity
import com.geco.zhyskaapp.home.sub.bab4.Menyimak4Activity

class SubBab4Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySubBab4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBab4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnMenyimak4.setOnClickListener {
                val intent = Intent(this@SubBab4Activity, Menyimak4Activity::class.java)
                startActivity(intent)
            }
            btnBerbicara4.setOnClickListener {
                val intent = Intent(this@SubBab4Activity, Berbicara4Activity::class.java)
                startActivity(intent)
            }
            btnMembaca4.setOnClickListener {
                val intent = Intent(this@SubBab4Activity, Membaca4Activity::class.java)
                startActivity(intent)
            }
            btnMenulis4.setOnClickListener {
                val intent = Intent(this@SubBab4Activity, Menulis4Activity::class.java)
                startActivity(intent)
            }
        }

    }
}