package com.geektech.momsquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.momsquiz.databinding.FragmentMenuBinding
import com.geektech.momsquiz.databinding.FragmentRestartBinding

class MenuFragment : Fragment() {
    lateinit var binding: FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnStart.setOnClickListener{
            findNavController().navigate(R.id.oneFragment)
        }
        binding.btnCreator.setOnClickListener{
            findNavController().navigate(R.id.creatorFragment)
        }
        binding.btnInfo.setOnClickListener{
            findNavController().navigate(R.id.infoFragment)
        }
    }

}