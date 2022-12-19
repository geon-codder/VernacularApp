package com.geco.zhyskaapp.home.sub.bab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivityMenyimak4Binding
import com.geco.zhyskaapp.home.sub.SubBab4Activity

class Menyimak4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMenyimak4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenyimak4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply{

            btnMenyimak4Selesai.setOnClickListener {
                //TODO cek skor apabila belum ada, maka tambahkan skor karena menyelesaikan level ini
                val intent = Intent(this@Menyimak4Activity, SubBab4Activity::class.java)
                startActivity(intent)
            }
        }
    }
}