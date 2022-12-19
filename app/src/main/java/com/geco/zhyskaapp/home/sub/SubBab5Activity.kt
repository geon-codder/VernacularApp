package com.geco.zhyskaapp.home.sub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivitySubBab5Binding
import com.geco.zhyskaapp.home.sub.bab5.Berbicara5Activity
import com.geco.zhyskaapp.home.sub.bab5.Membaca5Activity
import com.geco.zhyskaapp.home.sub.bab5.Menulis5Activity
import com.geco.zhyskaapp.home.sub.bab5.Menyimak5Activity

class SubBab5Activity : AppCompatActivity() {

    private lateinit var binding: ActivitySubBab5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBab5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnMenyimak5.setOnClickListener {
                val intent = Intent(this@SubBab5Activity, Menyimak5Activity::class.java)
                startActivity(intent)
            }
            btnBerbicara5.setOnClickListener {
                val intent = Intent(this@SubBab5Activity, Berbicara5Activity::class.java)
                startActivity(intent)
            }
            btnMembaca5.setOnClickListener {
                val intent = Intent(this@SubBab5Activity, Membaca5Activity::class.java)
                startActivity(intent)
            }
            btnMenulis5.setOnClickListener {
                val intent = Intent(this@SubBab5Activity, Menulis5Activity::class.java)
                startActivity(intent)
            }
        }
    }
}