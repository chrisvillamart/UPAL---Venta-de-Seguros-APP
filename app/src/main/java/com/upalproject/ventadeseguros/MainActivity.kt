package com.upalproject.ventadeseguros

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ProgressBar
import androidx.activity.ComponentActivity
import com.upalproject.ventadeseguros.activity.MenuPrincipalActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        // Encuentra el ProgressBar en el layout
        val progressBar: ProgressBar = findViewById(R.id.progressBar)

        Handler(Looper.getMainLooper()).postDelayed({
            progressBar.visibility = View.GONE

            // Iniciar la nueva actividad
            val intent = Intent(this, MenuPrincipalActivity::class.java)
            startActivity(intent)

            finish()

        }, 2000) // 2000 milisegundos = 2 segundos
    }
}

