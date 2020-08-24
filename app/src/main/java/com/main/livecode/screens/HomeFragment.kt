package com.main.livecode.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.main.livecode.R
import kotlinx.android.synthetic.main.fragment_home.*



class HomeFragment : Fragment(),View.OnClickListener {
   private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)

        recipient_bank.setOnClickListener(this)
        history_balance.setOnClickListener(this)
        callLocal.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            recipient_bank -> navController.navigate(R.id.action_homeFragment_to_input_Recepient_Fragment)
            history_balance -> navController.navigate(R.id.action_homeFragment_to_historyFragment)
        }
    }
}