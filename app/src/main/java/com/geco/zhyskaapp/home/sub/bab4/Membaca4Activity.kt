package com.geco.zhyskaapp.home.sub.bab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivityMembaca4Binding
import com.geco.zhyskaapp.home.sub.SubBab4Activity

class Membaca4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMembaca4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMembaca4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnMembaca4Selesai.setOnClickListener {
                //TODO cek skor apabila kurang dari jumlah skor halaman sebelumnya, maka tambahkan skor karena menyelesaikan level ini
                val intent = Intent(this@Membaca4Activity, SubBab4Activity::class.java)
                startActivity(intent)
            }
        }
    }
}