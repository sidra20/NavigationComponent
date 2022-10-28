package com.sidrakotlin.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sidrakotlin.navigationcomponent.databinding.FragmentContactBinding


class ContactFragment : Fragment() {

    private lateinit var viewModel : ViewModelFragment
    private lateinit var binding : FragmentContactBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ViewModelFragment::class.java)

        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(inflater, R.layout.fragment_contact, container, false)
       // val view = inflater.inflate(R.layout.fragment_contact, container, false)
       binding.viewModelFragment = viewModel
        binding.lifecycleOwner=this
       return binding.root
    }


}