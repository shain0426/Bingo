package com.tumeow.bingo.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class BingoViewModelFactory: ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>) = BingoViewModel() as T

}