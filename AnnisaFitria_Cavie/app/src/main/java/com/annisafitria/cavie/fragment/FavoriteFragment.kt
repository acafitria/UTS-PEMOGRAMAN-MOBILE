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

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FavoriteFragment : Fragment() {
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
        adapter = FilmAdapter(listfavorite)
        recycleView.adapter = adapter
    }


}