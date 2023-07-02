package com.example.viewpagerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagerdemo.databinding.FirstFragmentBinding
import com.example.viewpagerdemo.databinding.SecondFragmentBinding

class SecondFragment:Fragment() {
    private lateinit var binding: SecondFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondFragmentBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupData()
    }

    private fun setupData() {
        binding.txtMain.text = getString(R.string.second_fragment)
        binding.imgMain.setImageResource(R.mipmap.ic_launcher)
    }

}