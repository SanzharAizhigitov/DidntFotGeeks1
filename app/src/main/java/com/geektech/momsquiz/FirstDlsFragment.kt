package com.geektech.momsquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.geektech.momsquiz.databinding.FragmentFirstDlsBinding


class FirstDlsFragment : Fragment() {
    lateinit var binding: FragmentFirstDlsBinding
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstDlsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
initClickers()
    }

    private fun initClickers() {
        with(binding){
            btn1.setOnClickListener{
                changeBtn(btn1, btn2)
                binding.tv.changeText("ТЫ РЕАЛЬНО БОЛЬНОЙ? Я ЖЕ СКАЗАЛ НЕ НАЖИМАТЬ! ЕЩЕ РАЗ НАЖМЕШЬ....")
            }
            btn2.setOnClickListener{
                changeBtn(btn2, btn3)
                binding.tv.changeText("Мда уж, человечек не может без приключений да???? Иди ты...")
            }
            btn3.setOnClickListener{
                changeBtn(btn3, btn4)
                binding.tv.changeText("ДА ЗАЧЕМ????????????? БЕСИШЬ УЖЕ!")
            }
            btn4.setOnClickListener{
                changeBtn(btn4, btn5)
                binding.tv.changeText("ХВАТИТ ПОЖАЛУЙСТА! ИЛИ ТЫ ИНДЮК НЕДОВАРЕННЫЙ ЯЗЫКА НЕ ПОНИМАЕШЬ?")
            }
            btn5.setOnClickListener{
                changeBtn(btn5, btn6)
                binding.tv.changeText(".....")
            }
            btn6.setOnClickListener{
                changeBtn(btn6, btn7)
                binding.tv.changeText("ПОСЛЕДНЕЕ ПРЕДУПРЕЖДЕНИЕ!!!! ИЛИ ТЕБЕ НА ПОЗДОРОВИТСЯ!!!!")
            }
            btn7.setOnClickListener{
findNavController().navigate(R.id.secondDlsFragment)
            }
        }
    }

    private fun changeBtn(button1: Button, button2: Button){
        button1.visibility =View.GONE
        button2.visibility = View.VISIBLE
    }
 fun TextView.changeText(message: String){
     this.text = message
 }
}