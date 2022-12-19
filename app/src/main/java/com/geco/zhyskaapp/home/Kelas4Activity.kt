package com.geco.zhyskaapp.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivityKelas4Binding
import com.geco.zhyskaapp.home.latihan.LatihanSoalActivity
import com.geco.zhyskaapp.home.sub.SubBab4Activity
import com.geco.zhyskaapp.home.sub.SubBab5Activity
import com.geco.zhyskaapp.home.sub.SubBab6Activity

class Kelas4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityKelas4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelas4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnKlsToBab4.setOnClickListener {
                val intent = Intent(this@Kelas4Activity, SubBab4Activity::class.java)
                startActivity(intent)
            }
            btnKlsToBab5.setOnClickListener {
                val intent = Intent(this@Kelas4Activity, SubBab5Activity::class.java)
                startActivity(intent)
            }
            btnKlsToBab6.setOnClickListener {
                val intent = Intent(this@Kelas4Activity, SubBab6Activity::class.java)
                startActivity(intent)
            }
            btnKlsToLatihan.setOnClickListener {
                val intent = Intent(this@Kelas4Activity, LatihanSoalActivity::class.java)
                startActivity(intent)
            }
        }
    }
}