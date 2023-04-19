package com.geektech.momsquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.geektech.momsquiz.databinding.FragmentCreatorBinding
import com.geektech.momsquiz.databinding.FragmentMenuBinding

class CreatorFragment : Fragment() {
    lateinit var binding: FragmentCreatorBinding
    lateinit var preferences: MyPreferences
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreatorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClicker()
        preferences = MyPreferences(requireActivity())
    }

    private fun initClicker() {
        with(binding) {
            homeBtn.setOnClickListener {
                findNavController().navigateUp()
            }
            yesBtn.setOnClickListener {
                preferences.iAmNotCreator()
                Toast.makeText(context, "Ну вот, другое дело", Toast.LENGTH_SHORT).show()
            }
            noBtn.setOnClickListener {
                preferences.iAmCreator()
                Toast.makeText(context, "Ладно, ладно....", Toast.LENGTH_SHORT).show()
            }
        }
    }

}