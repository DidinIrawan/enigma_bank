package com.main.livecode.recycle_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.main.livecode.R
import com.main.livecode.bank.Bank

class HistoryRecycleAdapter(private val transactionList: List<Bank>) :
    RecyclerView.Adapter<HistoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.history_recycle_view, parent, false)
        return HistoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
//        holder.imageMoney = transactionList[position].destination
        holder.dateTransaction.text = transactionList[position].trans_date
        holder.amountTransaction.text = transactionList[position].amount
    }

}

class HistoryViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    //    var imageMoney: ImageView = v.findViewById(R.id.image_recycle)
    var dateTransaction: TextView = v.findViewById(R.id.date_recycle)
    var amountTransaction: TextView = v.findViewById(R.id.amount_recycle)
}