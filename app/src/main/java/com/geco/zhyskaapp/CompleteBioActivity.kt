package com.geco.zhyskaapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geco.zhyskaapp.databinding.ActivityCompleteBioBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase


class CompleteBioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCompleteBioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCompleteBioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("dataUser")

        binding.apply {
            btnSave.setOnClickListener {
                val nama = inputNama.text.toString()
                val nis = inputNIS.text.toString()
                val kelas = inputKelas.text.toString()
                val alamat = inputAlamat.text.toString()
                val sekolah = inputSekolah.text.toString()

                val dataSiswa = DataSiswa(nama, nis, kelas, alamat, sekolah)
                val getUserID = Firebase.auth.currentUser?.uid

                if (getUserID != null) {
                    myRef.child("users").child(getUserID).child("biodata")
                        .setValue(dataSiswa)
                }
                val intent = Intent(this@CompleteBioActivity, ProfilActivity::class.java)
                startActivity(intent)

                //TODO RAPIKAN UI SETELAH BERHASIL TIDAK BISA KEMBALI KE HALAMAN INI.
            }
        }

    }
}