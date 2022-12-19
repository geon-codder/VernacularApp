package com.geco.zhyskaapp.home.sub.bab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivityBerbicara4Binding
import com.geco.zhyskaapp.home.sub.SubBab4Activity

class Berbicara4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityBerbicara4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBerbicara4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnBerbicara4Selesai.setOnClickListener {
                //TODO cek skor apabila kurang dari jumlah skor halaman sebelumnya, maka tambahkan skor karena menyelesaikan level ini
                val intent = Intent(this@Berbicara4Activity, SubBab4Activity::class.java)
                startActivity(intent)
            }
        }
    }
}