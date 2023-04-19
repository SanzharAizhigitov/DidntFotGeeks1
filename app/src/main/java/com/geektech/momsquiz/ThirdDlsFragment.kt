package com.geektech.momsquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.momsquiz.databinding.FragmentThirdDlsBinding
import kotlin.random.Random

class ThirdDlsFragment : Fragment() {
    lateinit var binding: FragmentThirdDlsBinding
    var random = Random.nextInt(1, 101)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdDlsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.checkBtn.setOnClickListener{
            if (binding.etFname.text.toString().toInt() > random){
                binding.tvResult.text = "Меньше"
            }else if (binding.etFname.text.toString().toInt() < random){
            binding.tvResult.text = "Больше"
        }else{
            findNavController().navigate(R.id.winDlsFragment)
        }
        }
    }
}