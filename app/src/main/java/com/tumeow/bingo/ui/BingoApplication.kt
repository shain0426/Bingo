package com.tumeow.bingo.ui

import android.app.Application
import org.kodein.di.DI
import org.kodein.di.DIAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.bind
import org.kodein.di.singleton

class BingoApplication: Application(), DIAware {
    override val di by DI.lazy{

        import(androidXModule(this@BingoApplication))

        //ViewModelFactory
        bind { singleton { BingoViewModelFactory() } }

    }
}