package com.example.convidadosapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.convidadosapp.R
import com.example.convidadosapp.databinding.ActivityGuestformBinding
import com.example.convidadosapp.ui.viewmodel.GuestFormViewModel

class GuestformActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityGuestformBinding
    private lateinit var viewModel: GuestFormViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuestformBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        binding.saveButton.setOnClickListener(this)
        binding.buttonPresent.isChecked = true
    }

    override fun onClick(v: View) {
        if(v.id == R.id.save_button){

        }
    }
}