package com.creativeminds.weighttrackingapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.creativeminds.weighttrackingapp.R
import com.creativeminds.weighttrackingapp.viewmodel.HomeViewModel

class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var navigationController: NavController

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigationController = Navigation.findNavController(view)

        view.findViewById<Button>(R.id.button).setOnClickListener(this)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.button -> navigationController.navigate(HomeFragmentDirections.actionHomeFragmentToDailyFragment())
        }
    }
}