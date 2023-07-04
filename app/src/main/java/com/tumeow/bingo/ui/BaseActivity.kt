package com.tumeow.bingo.ui

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import org.kodein.di.DIAware
import org.kodein.di.android.closestDI

abstract class BaseActivity: AppCompatActivity(), DIAware, View.OnClickListener {

    override val di by closestDI()

}