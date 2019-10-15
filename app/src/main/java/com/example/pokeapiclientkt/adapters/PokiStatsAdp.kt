package com.example.pokeapiclientkt.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pokeapiclientkt.R
import kotlinx.android.synthetic.main.poki_stat_hld.view.*

class PokiStatsAdp(val stats: ArrayList<String>, val imgUrl: String, val imagePoki: ImageView) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
            = PokiStatVH(LayoutInflater.from(parent.context).inflate(R.layout.poki_stat_hld, parent, false))
    override fun getItemCount() = stats.size
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as PokiStatVH
        holder.statPoki.setText(stats.get(position))
        Glide.with(holder.itemView.context)
            .load(imgUrl)
            .placeholder(R.drawable.ic_launcher_round)
            .into(imagePoki)
    }
}
class PokiStatVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val statPoki = itemView.statsPoki
}
