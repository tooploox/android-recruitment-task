package com.tooploox.androidrecruitmenttask

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val dummyList = listOf(
        Song("title1", "artist1"),
        Song("title2", "artist2"),
        Song("title3", "artist3"),
        Song("title4", "artist4"),
        Song("title5", "artist5"),
    )
    private val _songs: MutableStateFlow<List<Song>> = MutableStateFlow(dummyList)
    val songs: StateFlow<List<Song>> = _songs
}
