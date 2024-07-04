package com.hamzeh.healthapp

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun WellnessScreen(modifier: Modifier = Modifier, wellnessViewModel: WellnessViewModel = viewModel()) {
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList(list = wellnessViewModel.tasks, onCloseTask = { task -> wellnessViewModel.remove(task) })
    }
}

@Composable
fun TestCompose(modifier: Modifier = Modifier) {
    Row {
        Image(painterResource(id = R.drawable.ic_launcher_background) , contentDescription = "")
        Text(text = "Spark", color = Color(0xFFFFFFFF))
    }
}

@FontScalePreviews
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL)
@Preview
@Composable
private fun SurveyAnswerPreview() {
    TestCompose()
}

@BigFontScalePreviews
@Composable
private fun LightPreview() {
    TestCompose()
    
}

@Preview(
    name = "Small font light",
    group = "Font Scale",
    fontScale = 0.5f
)
annotation class FontScalePreviews

@Preview(
    name = "Small font light",
    group = "Font Scale",
    fontScale = 2.5f
)
annotation class BigFontScalePreviews
