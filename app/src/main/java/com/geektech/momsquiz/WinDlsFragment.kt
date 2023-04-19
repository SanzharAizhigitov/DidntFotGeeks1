package com.geektech.momsquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.momsquiz.databinding.FragmentWinDlsBinding

class WinDlsFragment : Fragment() {
   lateinit var binding: FragmentWinDlsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWinDlsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.homeBtn.setOnClickListener{
            findNavController().navigate(R.id.menuFragment)
        }
    }
}