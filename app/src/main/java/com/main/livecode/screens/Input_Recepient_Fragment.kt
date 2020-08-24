package com.main.livecode.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.main.livecode.R
import kotlinx.android.synthetic.main.fragment_input__recepient_.*


class Input_Recepient_Fragment : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_input__recepient_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController= Navigation.findNavController(view)
        next_recipientButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            next_recipientButton -> navController.navigate(R.id.action_input_Recepient_Fragment_to_amountFragment)
        }
    }
}