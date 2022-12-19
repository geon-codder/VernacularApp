package com.geco.zhyskaapp.home.sub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivitySubBab6Binding
import com.geco.zhyskaapp.home.sub.bab6.Berbicara6Activity
import com.geco.zhyskaapp.home.sub.bab6.Membaca6Activity
import com.geco.zhyskaapp.home.sub.bab6.Menulis6Activity
import com.geco.zhyskaapp.home.sub.bab6.Menyimak6Activity

class SubBab6Activity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBab6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBab6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnMenyimak6.setOnClickListener {
                val intent = Intent(this@SubBab6Activity, Menyimak6Activity::class.java)
                startActivity(intent)
            }
            btnBerbicara6.setOnClickListener {
                val intent = Intent(this@SubBab6Activity, Berbicara6Activity::class.java)
                startActivity(intent)
            }
            btnMembaca6.setOnClickListener {
                val intent = Intent(this@SubBab6Activity, Membaca6Activity::class.java)
                startActivity(intent)
            }
            btnMenulis6.setOnClickListener {
                val intent = Intent(this@SubBab6Activity, Menulis6Activity::class.java)
                startActivity(intent)
            }
        }
    }
}