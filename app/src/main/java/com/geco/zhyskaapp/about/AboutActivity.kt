package com.geco.zhyskaapp.about

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnAboutToPanduan.setOnClickListener {
                val intent = Intent(this@AboutActivity, CaraPenggunaanAplikasiActivity::class.java)
                startActivity(intent)
            }
            btnAboutToBioDev.setOnClickListener {
                val intent = Intent(this@AboutActivity, BiodataDeveloperActivity::class.java)
                startActivity(intent)
            }
        }

    }
}