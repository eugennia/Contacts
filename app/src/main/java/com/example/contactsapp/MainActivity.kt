package com.example.contactsapp

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView = binding.rvContacts
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<RvData>()
//            data.add()
        repeat(20) {
            data.add(
                RvData(
                    photo = it,
                    name = "Title ${it + 1}",
                    number = it
                )
            )
        }

        val adapter = ContactsAdapter(data)

        recyclerView.adapter = adapter

    }


    private fun requestPermission() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS) != packageManager.PERMISSION_GRANTED) {
        }

    }

    private fun getContacts() {

    }
}