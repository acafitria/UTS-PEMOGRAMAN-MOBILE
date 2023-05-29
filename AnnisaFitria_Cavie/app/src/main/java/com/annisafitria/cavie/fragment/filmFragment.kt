package com.annisafitria.cavie.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.annisafitria.cavie.FilmAdapter
import com.annisafitria.cavie.R
import com.annisafitria.cavie.listfavorite
import com.annisafitria.cavie.listfilmberanda


/**
 * A simple [Fragment] subclass.
 * Use the [BerandaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BerandaFragment : Fragment() {
    private lateinit var adapter: FilmAdapter
    private lateinit var recycleView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val grid = LinearLayoutManager(context)
        recycleView = view.findViewById(R.id.list_beranda_view)
        recycleView.layoutManager = grid
//        recycleView.hasFixedSize(true)
        adapter = FilmAdapter(listfilmberanda)
        recycleView.adapter = adapter
    }


}