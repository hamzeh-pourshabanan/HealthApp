package com.hamzeh.healthapp

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    val list = remember { getWellnessTasks().toMutableStateList() }
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList(list = list, onCloseTask = { task -> list.remove(task) })
    }
}

fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i") }
