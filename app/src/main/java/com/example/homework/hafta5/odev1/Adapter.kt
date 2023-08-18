package com.example.homework.hafta5.odev1

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework.databinding.CardDesignBinding

class Adapter (val mContext: Context, val iconList: ArrayList<DataModel>) :
    RecyclerView.Adapter<Adapter.CardDesign>() {

    class CardDesign(val binding: CardDesignBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardDesignBinding.inflate(layoutInflater, parent, false)
        return CardDesign(binding)
    }

    override fun getItemCount(): Int {
        return iconList.size
    }

    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        val icon = iconList[position]
        holder.binding.textViewIcon.text = icon.iconIsim
        holder.binding.imageViewIcon.setImageResource(icon.iconResim)
    }


}