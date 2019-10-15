package com.example.pokeapiclientkt.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokeapiclientkt.R
import com.example.pokeapiclientkt.adapters.PokiStatsAdp
import kotlinx.android.synthetic.main.poki_stat_frg.*

class PokiStatsFrg : Fragment() {
    private lateinit var rvList: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?)
            = inflater.inflate(R.layout.poki_stat_frg, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imagePoki: ImageView = imagePokiStat
        recyclerCreate()
        val stats = arguments!!.getStringArrayList("stats")
        val imgUrl = stats.get(7)
        stats.removeAt(7)
        recyclerViewStat.adapter = PokiStatsAdp(stats, imgUrl, imagePoki)
    }

    fun recyclerCreate() {
        val linearLayoutManager = LinearLayoutManager(context)
        rvList = recyclerViewStat
        rvList.layoutManager = linearLayoutManager
        rvList.setHasFixedSize(true)
    }
}