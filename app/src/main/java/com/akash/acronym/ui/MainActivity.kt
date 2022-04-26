package com.akash.acronym.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.akash.acronym.R
import com.akash.acronym.databinding.ActivityAccBinding
import com.akash.acronym.repository.AccNetworkRepository
import com.akash.acronym.viewmodel.AccActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAccBinding
    val repository = AccNetworkRepository()

    val viewModel = AccActivityViewModel(repository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_acc)
        binding.apply {
            viewModel = this@MainActivity.viewModel
            lifecycleOwner = this@MainActivity
        }

        setContentView(binding.root)


        viewModel.varItemList.observe(this, Observer {
            binding.recyclerView.also {
                it.layoutManager = LinearLayoutManager(this)
            }
            binding.adapter = AccAdapter(it)
        })
    }
}