package com.imsoft.softwarecatalogapp

import androidx.recyclerview.widget.RecyclerView
import com.imsoft.softwarecatalogapp.databinding.CardCellBinding

class CardViewHolder (
    private val cardCellBinding: CardCellBinding,
    private val clickListener: SoftClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindSoft(soft: SoftTech) {
        cardCellBinding.cover.setImageResource(soft.cover)
        cardCellBinding.title.text = soft.title
        cardCellBinding.author.text = soft.author

        cardCellBinding.cardView.setOnClickListener {
            clickListener.onClick(soft)
        }
    }
}