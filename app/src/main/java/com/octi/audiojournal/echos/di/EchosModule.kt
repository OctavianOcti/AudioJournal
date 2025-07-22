package com.octi.audiojournal.echos.di

import com.octi.audiojournal.echos.data.audio.AndroidAudioPlayer
import com.octi.audiojournal.echos.data.echo.RoomEchoDataSource
import com.octi.audiojournal.echos.data.recording.AndroidVoiceRecorder
import com.octi.audiojournal.echos.data.recording.InternalRecordingStorage
import com.octi.audiojournal.echos.data.settings.DataStoreSettings
import com.octi.audiojournal.echos.domain.audio.AudioPlayer
import com.octi.audiojournal.echos.domain.echo.EchoDataSource
import com.octi.audiojournal.echos.domain.recording.RecordingStorage
import com.octi.audiojournal.echos.domain.recording.VoiceRecorder
import com.octi.audiojournal.echos.domain.settings.SettingsPreferences
import com.octi.audiojournal.echos.presentation.create_echo.CreateEchoViewModel
import com.octi.audiojournal.echos.presentation.echos.EchosViewModel
import com.octi.audiojournal.echos.presentation.settings.SettingsViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

val echoModule = module {
    singleOf(::AndroidVoiceRecorder) bind VoiceRecorder::class
    singleOf(::InternalRecordingStorage) bind RecordingStorage::class
    singleOf(::AndroidAudioPlayer) bind AudioPlayer::class
    singleOf(::RoomEchoDataSource) bind EchoDataSource::class
    singleOf(::DataStoreSettings) bind SettingsPreferences::class

    viewModelOf(::EchosViewModel)
    viewModelOf(::CreateEchoViewModel)
    viewModelOf(::SettingsViewModel)
}