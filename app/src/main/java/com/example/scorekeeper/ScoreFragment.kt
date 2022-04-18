package com.example.scorekeeper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.scorekeeper.databinding.FragmentScoreBinding


class ScoreFragment: Fragment(){

    private lateinit var binding: FragmentScoreBinding
    lateinit var viewModel: ScoreKeeperViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_score, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val viewModel by viewModels<ScoreKeeperViewModel>()
        viewModel = ViewModelProvider(this)[ScoreKeeperViewModel::class.java]
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

    }
}