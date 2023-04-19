package com.geektech.momsquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.momsquiz.databinding.FragmentSecondDls3Binding
import com.geektech.momsquiz.databinding.FragmentSecondDlsBinding


class SecondDls3Fragment : Fragment() {
    lateinit var binding: FragmentSecondDls3Binding
    lateinit var preferences: MyPreferences
    private var num:Int = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondDls3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        preferences = MyPreferences(requireActivity())
        binding.btn1.setOnClickListener{
            num++
            binding.tvNum.text = "$num/1000"
            if (num>999 ){
                findNavController().navigate(R.id.secondDls2Fragment)
            }
        }
        if (preferences.isYouCreator()){
            binding.btnSkip.visibility = View.VISIBLE
        }else{binding.btnSkip.visibility = View.GONE}
        binding.btnSkip.setOnClickListener{
            num += 100
            binding.tvNum.text = "$num/1000"
            if (num>999 ){
                findNavController().navigate(R.id.thirdDlsFragment)
            }
        }

    }

}