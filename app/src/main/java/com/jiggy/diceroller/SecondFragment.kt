package com.jiggy.diceroller

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.jiggy.diceroller.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private lateinit var binding:FragmentSecondBinding
//done
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSecondBinding.inflate(layoutInflater,container,false)
        binding=DataBindingUtil.inflate(layoutInflater,R.layout.fragment_second,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.buttonSecond.setOnClickListener{

            Toast.makeText(context,"hii",Toast.LENGTH_SHORT).show()

            binding.apply {
                binding.textviewSecond.text="On click of button"
            }

        }
/*
        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            findNavController().navigate(
                R.id.action_SecondFragment_to_FirstFragment
            )
        }*/
    }
}