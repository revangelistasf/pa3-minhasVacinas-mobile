package com.jry.minhasvacinas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cadastroButton.setOnClickListener {
            var cadastroIntent = Intent(this, CadastroActivity::class.java)
            startActivity(cadastroIntent)
        }
    }
}
