package com.akash.acronym.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.akash.acronym.viewmodel.LfItem
import com.akash.acronym.R
import com.akash.acronym.databinding.AccItemBinding

class AccAdapter(val lfList : MutableList<LfItem>) : RecyclerView.Adapter<AccAdapter.AccItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = AccItemViewHolder(
        DataBindingUtil.inflate<AccItemBinding>(
            LayoutInflater.from(parent.context),
            R.layout.acc_item,
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: AccItemViewHolder, position: Int) {
        holder.binding.variable =lfList[position]
    }

    override fun getItemCount(): Int {
        return lfList.size
    }

    inner class AccItemViewHolder( val binding: AccItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}

