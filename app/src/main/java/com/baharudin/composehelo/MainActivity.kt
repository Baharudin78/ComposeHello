package com.baharudin.composehelo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BackScreen()
        }
    }
}
@Composable
fun BackScreen() {
    Surface() {
        Column(
            modifier = Modifier.padding(5.dp)
                .fillMaxHeight()
                .fillMaxWidth()

        ) {


        }
    }
}


@Preview
@Composable
fun PreviewUcapan() {
    BackScreen()
}