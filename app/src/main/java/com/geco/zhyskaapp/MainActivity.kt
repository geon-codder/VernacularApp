package com.geco.zhyskaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.geco.zhyskaapp.auth.LoginActivity
import com.geco.zhyskaapp.databinding.ActivityMainBinding
import com.geco.zhyskaapp.game.GameActivity
import com.geco.zhyskaapp.home.HomeActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFirebaseAuth()
        getData()

        binding.apply{
            btnHome.setOnClickListener {
                val intent = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(intent)
            }
            btnProfil.setOnClickListener {
                val intent = Intent(this@MainActivity, ProfilActivity::class.java)
                startActivity(intent)
            }

            btnAbout.setOnClickListener {
//                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                val intent = Intent(this@MainActivity, GameActivity::class.java)
                startActivity(intent)
            }

            btnLogout.setOnClickListener {
                auth.signOut()
                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intent)
            }

        }
    }

    private fun getData() {
        val user = auth.currentUser
        if(user != null){
            val namaPengguna = user.email
            Toast.makeText(this@MainActivity, "Selamat datang user $namaPengguna ", Toast.LENGTH_LONG).show()
        }
    }

    private fun initFirebaseAuth() {
        auth = FirebaseAuth.getInstance()
    }
}