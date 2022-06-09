package com.example.jetpackcomposcardviewl2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                NewCardView("Name", "Actor")
                NewCardView("Name", "Actor")
                NewCardView("Name", "Actor")
                NewCardView("Name", "Actor")
                NewCardView("Name", "Actor")
                NewCardView("Name", "Actor")
                NewCardView("Name", "Actor")
                NewCardView("Name", "Actor")
                NewCardView("Name", "Actor")
                NewCardView("Name", "Actor")
            }

        }
    }
}

@Composable
fun NewCardView(name: String, prof: String) {

    Card(
        modifier = Modifier

            .fillMaxWidth()
            .padding(10.dp)
            .offset(30.dp)
            .clickable {
                Log.d("VVV", "Clickable test")

            }
            .pointerInput(Unit) {
                detectDragGesturesAfterLongPress { change, dragAmount ->
                    Log.d("VVV", "$dragAmount")
                }
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.ic_pic_currency_back),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .padding(5.dp)
                )
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }
    }


}