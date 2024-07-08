package com.akirachix.enwalletapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

 open class ExpenseAdapter(var expenditure: List< Expenses>): RecyclerView.Adapter< ExpenseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpenseViewHolder {
        var itemVeiw = LayoutInflater.from(parent.context).inflate(R.layout.expenses_list,parent,false)
        return ExpenseViewHolder(itemVeiw)
    }

    override fun onBindViewHolder(holder: ExpenseViewHolder, position: Int) {
        val wallet = expenditure[position]
        holder.dpDate.text = wallet.date
        holder.dpReason.text = wallet.reason
        holder.dpAmount.text = wallet.amount.toString()
    }

    override fun getItemCount(): Int {
        return expenditure.size
    }
}

class ExpenseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var dpDate = itemView.findViewById<TextView>(R.id.dpDate)
    var dpReason = itemView.findViewById<TextView>(R.id.dpReason)
    var dpAmount = itemView.findViewById<TextView>(R.id.dpAmount)
}