package com.example.jetpackcomposcardviewl2.ui.compos

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposcardviewl2.model.LocalData

@Composable
fun NewCardObject(item: LocalData) {

    //text drop expansion
    var isExpanded by remember {
        mutableStateOf(false)
    }

    Row(
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .fillMaxWidth()
            .padding(3.dp)
            .background(Color.White)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(5.dp)
                .background(Color.White)

        ) {
            Image(
                painter = painterResource(id = item.imageId),
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(3.dp)
                    .size(64.dp)
                    .clip(CircleShape)
            )
            Text(text = item.title)

        }
        Column(

            modifier = Modifier

                .padding(start = 5.dp, top = 22.dp)
                .background(Color.White)

        ) {

            Text(text = item.title)
            Text(modifier = Modifier.clickable {
                isExpanded = !isExpanded
            }, maxLines = if (isExpanded) Int.MAX_VALUE else 1, text = item.description)

        }
    }

}