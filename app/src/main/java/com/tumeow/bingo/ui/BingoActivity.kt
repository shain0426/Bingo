package com.tumeow.bingo.ui

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.tumeow.bingo.R
import com.tumeow.bingo.databinding.ActivityBingoBinding
import org.kodein.di.instance

class BingoActivity: BaseActivity() {

    private val binding: ActivityBingoBinding by lazy { DataBindingUtil.setContentView(this, R.layout.activity_bingo) }
    private val viewModelFactory by instance<BingoViewModelFactory>()
    private val viewModel by viewModels<BingoViewModel> { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        with(binding) {
            lifecycleOwner = this@BingoActivity
            entity = viewModel.entity
            setBt = this@BingoActivity
        }

        viewModel.entity.press1.observe(this) { viewModel.checking() }

        viewModel.entity.press2.observe(this) { viewModel.checking() }

        viewModel.entity.press3.observe(this) { viewModel.checking() }

        viewModel.entity.press4.observe(this) { viewModel.checking() }

        viewModel.entity.press5.observe(this) { viewModel.checking() }

        viewModel.entity.press6.observe(this) { viewModel.checking() }

        viewModel.entity.press7.observe(this) { viewModel.checking() }

        viewModel.entity.press8.observe(this) { viewModel.checking() }

        viewModel.entity.press9.observe(this) { viewModel.checking() }

    }

    override fun onClick(v: View) {

        when(v) {
            binding.randomBt -> viewModel.random()
        }
    }
}