package com.octi.audiojournal.echos.presentation.echos.models

import com.octi.audiojournal.core.presentation.util.UiText
import com.octi.audiojournal.echos.presentation.models.EchoUi

data class EchoDaySection(
    val dateHeader: UiText,
    val echos: List<EchoUi>
)
