package com.example.login

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(), AdapterView.OnItemClickListener {

    private val meses = arrayOf(
        "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    )

    private lateinit var listview: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        listview = findViewById(R.id.listMeses)
        listview.onItemClickListener = this
    }

    override fun onResume() {
        super.onResume()

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, meses)
        listview.adapter = adapter
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this, "Mês: ${meses[position]}", Toast.LENGTH_LONG).show()
    }
}