package com.hamzeh.healthapp

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hamzeh.healthapp.ui.theme.HealthAppTheme

@Composable
fun WellnessTaskItem(
    taskName: String,
    onClose: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier, verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier
                .weight(1f)
                .padding(start = 16.dp),
            text = taskName
        )
        Icon(imageVector = Icons.Filled.Close, contentDescription = "Close")
    }
}

@Preview(showBackground = true)
@Composable
fun WellnessTaskItemPreview() {
    HealthAppTheme {
        WellnessTaskItem(taskName = "This is a task", onClose = {})
    }
}