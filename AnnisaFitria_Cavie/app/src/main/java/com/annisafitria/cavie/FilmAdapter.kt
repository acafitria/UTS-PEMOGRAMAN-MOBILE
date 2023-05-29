package com.annisafitria.cavie

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class FilmAdapter(val data: List<film>) : RecyclerView.Adapter<FilmAdapter.MyViewHolder>() {

    class MyViewHolder(val row: View) : RecyclerView.ViewHolder(row) {
        val textView1 = row.findViewById<TextView>(R.id.nama)
        val imageView = row.findViewById<ImageView>(R.id.image)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_film,
            parent, false)
        return MyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView1.text = data.get(position).judul
        holder.imageView.setImageResource(data.get(position).gambar)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val model = data.get(position)
            val gambar: Int = model.gambar
            val nama : String = model.judul
            val pemeran: String = model.pemeran
            val deskrpsi = model.sinopsis
            val tahun = model.tahun


            //Membuat Intent

            val intent = Intent(context, DetailberandaActivity::class.java)
            //Putextra
            intent.putExtra("Judul", nama)
            intent.putExtra("Pemeran",pemeran)
            intent.putExtra("Gambar" , gambar)
            intent.putExtra("Sinopsis", deskrpsi)
            intent.putExtra("Tahun", tahun)

            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = data.size
}