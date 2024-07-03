package com.hamzeh.healthapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableIntStateOf(0) }
    StatelessCounter(modifier, count) { count++ }

}

@Composable
private fun StatelessCounter(
    modifier: Modifier,
    count: Int,
    onIncrement: () -> Unit
) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text(text = "You've had $count glasses.")
        }
        Row(Modifier.padding(top = 8.dp)) {
            Button(
                onClick = onIncrement,
                enabled = count < 10,
            ) {
                Text(
                    text = "Add One",
                )
            }
        }
    }
}