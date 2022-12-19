package com.geco.zhyskaapp.home.sub.bab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivityMenulis4Binding
import com.geco.zhyskaapp.home.sub.SubBab4Activity

class Menulis4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenulis4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenulis4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnMenulis4Selesai.setOnClickListener {
                //TODO cek skor apabila kurang dari jumlah skor halaman sebelumnya, maka tambahkan skor karena menyelesaikan level ini
                val intent = Intent(this@Menulis4Activity, SubBab4Activity::class.java)
                startActivity(intent)
            }
        }
    }
}