package com.geektech.momsquiz

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.geektech.momsquiz.databinding.FragmentRestartBinding

class RestartFragment : Fragment() {
    lateinit var binding: FragmentRestartBinding
    lateinit var preferences: MyPreferences
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentRestartBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        preferences = MyPreferences(requireActivity())
        binding.btnRestart.setOnClickListener{
            findNavController().navigate(R.id.oneFragment)
        }
        binding.btnNo.setOnClickListener{
            Toast.makeText(context, "Ну и не очень то и хотелось!", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.menuFragment)
        }
        if (preferences.isYouCreator()){
            binding.tvLose.text = "Проиграть с своем же приложении... Рестарт?"
        }else{
            binding.tvLose.text = "Вы проиграли( Желаете повторить?"
        }
    }

}