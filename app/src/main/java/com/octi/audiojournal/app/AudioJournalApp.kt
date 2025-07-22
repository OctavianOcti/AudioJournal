package com.octi.audiojournal.app

import android.app.Application
import com.octi.audiojournal.BuildConfig
import com.octi.audiojournal.app.di.appModule
import com.octi.audiojournal.core.database.di.databaseModule
import com.octi.audiojournal.echos.di.echoModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class AudioJournalApp: Application() {

    val applicationScope = CoroutineScope(Dispatchers.Default + SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidContext(this@AudioJournalApp)
            modules(
                appModule,
                echoModule,
                databaseModule
            )
        }
    }
}