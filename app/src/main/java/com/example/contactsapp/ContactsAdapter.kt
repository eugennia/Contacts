package com.example.contactsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.databinding.ItemContactBinding

class ContactsAdapter(
    var data: List<RvData>
) : RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    class ViewHolder(private val itemViewBinding: ItemContactBinding) :
        RecyclerView.ViewHolder(itemViewBinding.root) {
            fun bind(rvData: RvData) = with(itemViewBinding) {
                imgContactPhoto.imageAlpha = rvData.photo
                labelContactName.text = rvData.name
                labelContactNumber.text = rvData.number.toString()
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }
}