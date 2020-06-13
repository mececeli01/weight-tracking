package com.creativeminds.weighttrackingapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.creativeminds.weighttrackingapp.R
import com.creativeminds.weighttrackingapp.viewmodel.DailyViewModel

class DailyFragment : Fragment() {

    private lateinit var viewModel: DailyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Toast.makeText(context, "Screen Name: ${arguments?.get("screenName")}", Toast.LENGTH_LONG ).show()
        return inflater.inflate(R.layout.daily_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DailyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}