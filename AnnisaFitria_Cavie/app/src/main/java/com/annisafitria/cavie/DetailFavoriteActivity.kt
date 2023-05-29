package com.annisafitria.cavie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class DetailFavoriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_favorite)

        val namaDiLayout = findViewById<TextView>(R.id.tv_nama)
        val deskripsiDiLayout = findViewById<TextView>(R.id.tv_item_description)
        val gambarDiLayout = findViewById<ImageView>(R.id.img_item_photo)

        val button = findViewById<Button>(R.id.button_id)


        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        //get data from putExtra
        var intent = intent
        val nama = intent.getStringExtra("Nama")
        val gambar = intent.getIntExtra("Gambar", 0)
        val deskripsi = intent.getStringExtra("Sinopsis")
        val tahun = intent.getStringExtra("Tahun")



        actionBar.setTitle(nama)
        namaDiLayout.text = nama





        deskripsiDiLayout.text = deskripsi
        gambarDiLayout.setImageResource(gambar)




    }
}