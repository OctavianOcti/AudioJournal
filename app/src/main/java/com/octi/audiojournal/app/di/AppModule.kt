package com.octi.audiojournal.app.di

import com.octi.audiojournal.app.AudioJournalApp
import kotlinx.coroutines.CoroutineScope
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {
    single<CoroutineScope> {
        (androidApplication() as AudioJournalApp).applicationScope
    }
}