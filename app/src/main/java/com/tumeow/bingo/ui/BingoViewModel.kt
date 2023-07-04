package com.tumeow.bingo.ui

import android.view.View
import androidx.lifecycle.ViewModel
import com.tumeow.bingo.data.entity.BingoEntity

class BingoViewModel: ViewModel() {

    val entity = BingoEntity()

    fun random() {

        entity.press1.value = false
        entity.press2.value = false
        entity.press3.value = false
        entity.press4.value = false
        entity.press5.value = false
        entity.press6.value = false
        entity.press7.value = false
        entity.press8.value = false
        entity.press9.value = false
        entity.bingo.value = View.GONE

        val randomList = (0..25).shuffled()

        entity.number1.value = randomList[0].toString()
        entity.number2.value = randomList[1].toString()
        entity.number3.value = randomList[2].toString()
        entity.number4.value = randomList[3].toString()
        entity.number5.value = randomList[4].toString()
        entity.number6.value = randomList[5].toString()
        entity.number7.value = randomList[6].toString()
        entity.number8.value = randomList[7].toString()
        entity.number9.value = randomList[8].toString()
    }

    fun checking() {

        var lines = 0

        if (
            entity.press1.value == true &&
            entity.press2.value == true &&
            entity.press3.value == true
        ) {
            lines = lines + 1
        }

        if (
            entity.press4.value == true &&
            entity.press5.value == true &&
            entity.press6.value == true
        ) {
            lines = lines + 1
        }

        if (
            entity.press7.value == true &&
            entity.press8.value == true &&
            entity.press9.value == true
        ) {
            lines = lines + 1
        }

        if (
            entity.press1.value == true &&
            entity.press5.value == true &&
            entity.press9.value == true
        ) {
            lines = lines + 1
        }

        if (
            entity.press1.value == true &&
            entity.press4.value == true &&
            entity.press7.value == true
        ) {
            lines = lines + 1
        }

        if (
            entity.press2.value == true &&
            entity.press5.value == true &&
            entity.press8.value == true
        ) {
            lines = lines + 1
        }

        if (
            entity.press3.value == true &&
            entity.press5.value == true &&
            entity.press7.value == true
        ) {
            lines = lines + 1
        }

        if (
            entity.press3.value == true &&
            entity.press6.value == true &&
            entity.press9.value == true
        ) {
            lines = lines + 1
        }

        if (lines >= 2) {
            entity.bingo.value = View.VISIBLE
        }

    }


}