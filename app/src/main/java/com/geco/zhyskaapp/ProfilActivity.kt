package com.geco.zhyskaapp

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.geco.zhyskaapp.databinding.ActivityProfilBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.*
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class ProfilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnProfilToComplete.setOnClickListener {
                val intent = Intent(this@ProfilActivity, CompleteBioActivity::class.java)
                startActivity(intent)
            }

            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference("dataUser")
            val getUserID = Firebase.auth.currentUser?.uid
            if (getUserID != null) {
                myRef.child("users").child(getUserID).child("biodata").get().addOnSuccessListener {
                    if (it.exists()){
                        Toast.makeText(this@ProfilActivity,"Data Ditemukan",Toast.LENGTH_SHORT).show()

                        tvNamaSiswa.text = it.child("nama").value.toString()
                        tvNISSiswa.text = it.child("nis").value.toString()
                        tvKelasSiswa.text = it.child("kelas").value.toString()
                        tvAlamatSiswa.text = it.child("alamat").value.toString()
                        tvSekolahSiswa.text = it.child("sekolah").value.toString()

                    }else{
                        Toast.makeText(this@ProfilActivity,"Data Belum Ditemukan",Toast.LENGTH_SHORT).show()
                    }
                }.addOnFailureListener{
                    Log.e("firebase", "Error getting data", it)
                }
            }
            //TODO RAPIKAN UI SAAT DATA SUDAH MUNCUL, TOMBOL LENGKAPI DATA HILANG DAN MUNCULKAN TOMBOL UPDATE DATA
        }
    }
}