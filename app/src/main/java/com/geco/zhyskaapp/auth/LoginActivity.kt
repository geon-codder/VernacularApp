package com.geco.zhyskaapp.auth

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import com.geco.zhyskaapp.CustomDialog
import com.geco.zhyskaapp.MainActivity
import com.geco.zhyskaapp.R
import com.geco.zhyskaapp.databinding.ActivityLoginBinding
import com.geco.zhyskaapp.game.GameActivity
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.EmailAuthProvider
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFirebaseAuth()

        binding.apply {
            btnLogin.setOnClickListener {
                val email = inputEmailLogin.text.toString()
                val password = inputPasswordLogin.text.toString()
                if (checkValidation(email, password)){
                    loginToServer(email, password)
                }
            }
            tvDaftarAkun.setOnClickListener {
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun loginToServer(email: String, pass: String) {
        val credential = EmailAuthProvider.getCredential(email, pass)
        fireBaseAuth(credential)
    }

    private fun fireBaseAuth(credential: AuthCredential) {
        auth.signInWithCredential(credential)
            .addOnCompleteListener { task ->
                CustomDialog.hideLoading()
                if (task.isSuccessful) {
                    startActivity(Intent(this, MainActivity::class.java))
                    finishAffinity()
                } else {
                    Toast.makeText(this, "Sign-In failed", Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener { exception ->
                CustomDialog.hideLoading()
                Toast.makeText(this, exception.message, Toast.LENGTH_SHORT).show()
            }
    }
    private fun checkValidation(email: String, pass: String): Boolean {
        if (email.isEmpty()){
            binding.inputEmailLogin.error = "Please Ffield your email"
            binding.inputEmailLogin.requestFocus()
        }else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.inputEmailLogin.error = "Please use valid email"
            binding.inputEmailLogin.requestFocus()
        }else if (pass.isEmpty()){
            binding.inputPasswordLogin.error = "Please field your password"
            binding.inputPasswordLogin.requestFocus()
        }else{
            return true
        }
        CustomDialog.hideLoading()
        return false
    }

    private fun initFirebaseAuth() {
        auth = FirebaseAuth.getInstance()
    }

//    private fun initActionBar() {
//        setSupportActionBar(tbSignIn)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        supportActionBar?.title = ""
//    }
}