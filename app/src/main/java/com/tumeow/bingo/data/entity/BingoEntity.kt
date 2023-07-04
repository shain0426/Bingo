package com.tumeow.bingo.data.entity

import android.view.View
import androidx.lifecycle.MutableLiveData

data class BingoEntity(

    val number1: MutableLiveData<String> = MutableLiveData(""),
    val number2: MutableLiveData<String> = MutableLiveData(""),
    val number3: MutableLiveData<String> = MutableLiveData(""),
    val number4: MutableLiveData<String> = MutableLiveData(""),
    val number5: MutableLiveData<String> = MutableLiveData(""),
    val number6: MutableLiveData<String> = MutableLiveData(""),
    val number7: MutableLiveData<String> = MutableLiveData(""),
    val number8: MutableLiveData<String> = MutableLiveData(""),
    val number9: MutableLiveData<String> = MutableLiveData(""),

    val press1: MutableLiveData<Boolean> = MutableLiveData(false),
    val press2: MutableLiveData<Boolean> = MutableLiveData(false),
    val press3: MutableLiveData<Boolean> = MutableLiveData(false),
    val press4: MutableLiveData<Boolean> = MutableLiveData(false),
    val press5: MutableLiveData<Boolean> = MutableLiveData(false),
    val press6: MutableLiveData<Boolean> = MutableLiveData(false),
    val press7: MutableLiveData<Boolean> = MutableLiveData(false),
    val press8: MutableLiveData<Boolean> = MutableLiveData(false),
    val press9: MutableLiveData<Boolean> = MutableLiveData(false),

    val bingo: MutableLiveData<Int> = MutableLiveData(View.GONE)


)
