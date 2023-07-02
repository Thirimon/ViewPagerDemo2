package com.example.viewpagerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagerdemo.databinding.FourthFragmentBinding

class FourthFragment: Fragment() {
    private lateinit var binding:FourthFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FourthFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtMain.text="Fourth Fragment"
        binding.imgMain.setImageResource(R.mipmap.ic_launcher_round)
    }
}