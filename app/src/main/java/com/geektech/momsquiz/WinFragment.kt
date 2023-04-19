package com.geektech.momsquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geektech.momsquiz.databinding.FragmentWinBinding

class WinFragment : Fragment() {
    lateinit var binding: FragmentWinBinding
    lateinit var preferences:MyPreferences
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWinBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        preferences = MyPreferences(requireActivity())
        binding.buttonRestart.setOnClickListener{
            findNavController().navigate(R.id.oneFragment)
        }
        binding.buttonMenu.setOnClickListener{
            findNavController().navigate(R.id.menuFragment)
        }
        if (preferences.isYouCreator()){
            binding.winText.text = "А смысл? Твое же приложение!"
        }else{
            binding.winText.text = "Ура ты выиграл! Хочешь переиграть?"
        }
    }

}