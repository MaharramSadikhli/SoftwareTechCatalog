package com.imsoft.softwarecatalogapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.imsoft.softwarecatalogapp.databinding.CardCellBinding

class CardAdapter (private val softTechs: List<SoftTech>,
                   private val clickListener: SoftClickListener
    )
    :RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun getItemCount(): Int = softTechs.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindSoft(softTechs[position])
    }
}