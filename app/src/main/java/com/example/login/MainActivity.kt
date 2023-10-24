package com.example.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var editUsername: EditText
    private lateinit var editPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arquivo = getSharedPreferences("Username_Password", Context.MODE_PRIVATE)

        val btLogin = findViewById<Button>(R.id.btLogin)
        btLogin.setOnClickListener(this)

        editUsername = findViewById(R.id.editUsername)
        editPassword = findViewById(R.id.editPassword)

    }

    override fun onClick(view: View?) {
        val arquivo = getSharedPreferences("Username_Password", Context.MODE_PRIVATE)
        val Username = arquivo.getString("Username", "")
        val Password = arquivo.getString("Password", "")

        if (Username == "" && Password == "") {
            val editor = arquivo.edit()
            editor.putString("Username", editUsername.text.toString())
            editor.putString("Password", editPassword.text.toString())
            editor.commit()

            android.widget.Toast.makeText(
                this,
                "Entre com suas Credenciais",
                android.widget.Toast.LENGTH_LONG
            ).show()

        }
        else if ( editUsername.text.toString().equals(Username) //
            and editPassword.text.toString().equals(Password) ) {
            Toast.makeText(
                this,
                "Você esta Logado!",
                Toast.LENGTH_LONG
            ).show()

            val intent = Intent (this, MainActivity2::class.java)
            startActivity(intent)

        } else  {
            Toast.makeText(
                this,
                "Username e/ou Password Inválidos!",
                Toast.LENGTH_LONG
            ).show()
        }
    }


}
























