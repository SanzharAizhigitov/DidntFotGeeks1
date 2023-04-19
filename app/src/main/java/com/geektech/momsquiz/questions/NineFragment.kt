package com.geektech.momsquiz.questions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.geektech.momsquiz.PointsSystem
import com.geektech.momsquiz.R
import com.geektech.momsquiz.databinding.FragmentNineBinding

class NineFragment : Fragment() {
    lateinit var binding: FragmentNineBinding
    private val point: PointsSystem by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        startQuiz()
    }

    private fun startQuiz() {
        with(binding) {
            buttonOption1.setOnClickListener {
                no()
            }
            buttonOption2.setOnClickListener {
                no()
            }
            buttonOption3.setOnClickListener {
                no()
            }
            buttonOption4.setOnClickListener {
                yes()
            }
        }
    }

    private fun yes() {
        findNavController().navigate(R.id.tenFragment)
    }

    private fun no() {
        findNavController().navigate(R.id.restartFragment)
    }

}
