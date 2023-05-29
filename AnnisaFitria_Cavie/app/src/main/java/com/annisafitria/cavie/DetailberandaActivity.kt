package com.annisafitria.cavie

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class DetailberandaActivity : AppCompatActivity() {
    companion object {
        const val SEARCH_PREFIX = "https://www.youtube.com/search?q="
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_favorite)

        val namaDiLayout = findViewById<TextView>(R.id.tv_nama)
        val deskripsiDiLayout = findViewById<TextView>(R.id.tv_item_description)
        val gambarDiLayout = findViewById<ImageView>(R.id.img_item_photo)
        val buttonn = findViewById<Button>(R.id.button_id)
        val pemeranDilayoutt = findViewById<TextView>(R.id.tv_pemeran)




        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)


        var intent = intent
        val nama = intent.getStringExtra("Judul")
        val gambar = intent.getIntExtra("Gambar", 0)
        val deskripsi = intent.getStringExtra("Sinopsis")
        val pemeranDilayout = intent.getStringExtra("Pemeran")


        actionBar.setTitle(nama)
        namaDiLayout.text = nama


        deskripsiDiLayout.text = deskripsi
        gambarDiLayout.setImageResource(gambar)
        pemeranDilayoutt.text = pemeranDilayout

        buttonn.setOnClickListener {
            val queryUrl: Uri = Uri.parse("${DetailberandaActivity.SEARCH_PREFIX}${nama}")
            val intent = Intent(Intent.ACTION_VIEW, queryUrl)
            startActivity(intent)
        }




    }
}