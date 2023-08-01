package com.example.contactsapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.databinding.ItemContactBinding

class ContactsAdapter(
    var data: List<RvData>
) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    class ViewHolder(itemViewBinding: ItemContactBinding) :
        RecyclerView.ViewHolder(itemViewBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}