package com.upalproject.ventadeseguros.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.upalproject.ventadeseguros.R

class MenuPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
        // Recuperar los datos del Intent
        val username = intent.getStringExtra("USERNAME")

        // Mostrar el nombre de usuario en un TextView
        val welcomeTextView: TextView = findViewById(R.id.lblUsuario)
        welcomeTextView.text = "Bienvenido, $username!"
    }
}