package com.joao.sutding.login.views.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.joao.studing.login.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlinx.android.synthetic.main.login_fragment.*
import timber.log.Timber


class LoginFragment : Fragment(){

    private lateinit var navController: NavController
    private val viewModel: LoginFragmentViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = Navigation.findNavController(view)
        Timber.d("Nav: ${navController.currentDestination}")
        Toast.makeText(activity, "Ola", Toast.LENGTH_LONG).show()
        button.setOnClickListener {
            Toast.makeText(activity, "Ola 2", Toast.LENGTH_LONG).show()
            viewModel.login(editText.text.toString(), editText2.text.toString())
        }
    }

}