package com.jiggy.diceroller

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlin.random.Random

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    lateinit var rollerbtn: Button
    lateinit var diceTextView: TextView
    lateinit var diceImageView: ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rollerbtn = view.findViewById<Button>(R.id.button_first)
        diceTextView=view.findViewById(R.id.textview_first)
        diceImageView=view.findViewById(R.id.dice_image)
        rollerbtn.text="Let's Roll"
        rollerbtn.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)



            rollDice()





        }
    }
    private  val TAG = "FirstFragment"

    fun rollDice() {

        var randomNumber= Random.nextInt(6)+1

        var oldVal=diceTextView.text

        Log.i(TAG, "rollDice:randomNumber "+randomNumber+":oldVal : "+oldVal)

        diceTextView.text = if (oldVal.equals(randomNumber)) {

            if (randomNumber == 6) {
                val dicNumber=randomNumber--
                dicNumber.toString()
            } else {
                val dicNumber=randomNumber++
                dicNumber.toString()
            }
        }else{
            randomNumber.toString()
        }

        var diceImage=when(randomNumber){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImageView.setImageResource(diceImage)


    }

}