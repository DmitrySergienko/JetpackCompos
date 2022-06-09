package com.example.jetpackcomposcardviewl2

import android.os.Bundle
import android.text.Layout
import android.util.Log
import android.util.SizeF
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonColors
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                cyrcleItem()
            }

        }
    }
}


@Composable
private fun cyrcleItem() {
    var counter = remember { mutableStateOf(0) }
    var myColor = remember { mutableStateOf(Color.Cyan) }
    val cycleSize = remember {mutableStateOf(100)}

    Box(
        modifier = Modifier
            .size(cycleSize.value.dp)
            .clickable {
                when (++counter.value) {
                    3 -> myColor.value = Color.Gray
                    6 -> myColor.value = Color.Red
                    10 -> myColor.value = Color.LightGray
                    12 -> cycleSize.value = 120
                    14 -> cycleSize.value = 140
                    16 -> cycleSize.value = 160


                }

            }
            .background(myColor.value, shape = CircleShape),
        contentAlignment = Alignment.Center

    ) {

        Text(text = counter.value.toString(),
        style = TextStyle(color = Color.Blue, fontSize = 40.sp)
        )


    }
}




