package com.main.livecode.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.main.livecode.R
import kotlinx.android.synthetic.main.fragment_login_user.*


class LoginUserFragment : Fragment(), View.OnClickListener {

   private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)

        submitUser.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            submitUser -> {
                if (emailInput.text.toString() ==  "Admin" && passwordInput.text.toString() == "admin") {
                    navController.navigate(R.id.action_loginUserFragment_to_homeFragment)
                    Toast.makeText(context, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "LOGIN FAILED", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}