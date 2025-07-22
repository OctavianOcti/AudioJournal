package com.octi.audiojournal.echos.presentation.echos.models

import com.octi.audiojournal.R
import com.octi.audiojournal.core.presentation.util.UiText

data class MoodChipContent(
    val iconsRes: List<Int> = emptyList(),
    val title: UiText = UiText.StringResource(R.string.all_moods)
)
