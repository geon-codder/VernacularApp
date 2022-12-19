package com.geco.zhyskaapp.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnSejarahBhsDaerah.setOnClickListener {
                val intent = Intent(this@HomeActivity,SejarahBahasaDaerahActivity::class.java)
                startActivity(intent)
            }
            btnKelas.setOnClickListener {
                val intent = Intent(this@HomeActivity,Kelas4Activity::class.java)
                startActivity(intent)
            }
        }
    }
}