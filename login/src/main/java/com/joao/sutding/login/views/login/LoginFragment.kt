package com.joao.sutding.login.views.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.joao.commom.data.core.base.BaseFragment
import com.joao.commom.data.core.user.entities.User
import com.joao.commom.data.core.utils.launchUI
import com.joao.studing.login.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlinx.android.synthetic.main.login_fragment.*
import timber.log.Timber


class LoginFragment : BaseFragment(){

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


        setupActions()
        setupObservers()

    }

    private fun setupActions() {
        //button register click action
        button2.setOnClickListener {
            startRegister()
        }
        //button login click action
        button.setOnClickListener {
            login()
        }
    }

    /**
     * Action to change frament to register
     */
    private fun startRegister(){
        navController.navigate(R.id.action_welcomeFragment_to_registerFragment)
    }

    /**
     * Actions login button
     */
    private fun login(){
        launchUI{
            viewModel.login(editText.text.toString(), editText2.text.toString())
        }
    }

    /**
     * Response handler to login click action
     */
    private fun handleData(user: User?){

    }

    /**
     * Setup obsers from ViewModel
     */
    override fun setupObservers() {
        viewModel.observe(this, ::showProgress, ::hideProgress, ::showAlterMessage, :: handleData)
    }
}