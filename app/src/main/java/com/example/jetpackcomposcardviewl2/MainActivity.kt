package com.example.jetpackcomposcardviewl2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposcardviewl2.model.LocalData
import com.example.jetpackcomposcardviewl2.ui.compos.NewCardObject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LazyRow(
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(5.dp)
                    .alpha(0.9f)
            ) {
                itemsIndexed(
                    listOf(
                        LocalData(R.drawable.ic_pic_currency_back,"AnyName"),
                        LocalData(R.drawable.ic_pic_currency_back,"AnyName"),
                        LocalData(R.drawable.ic_pic_currency_back,"AnyName"),
                        LocalData(R.drawable.ic_pic_currency_back,"AnyName"),
                        LocalData(R.drawable.ic_pic_currency_back,"AnyName"),
                        LocalData(R.drawable.ic_pic_currency_back,"AnyName"),
                        LocalData(R.drawable.ic_pic_currency_back,"AnyName"),
                    )
                ) {_, item->
                    NewCardObject(item =item)
                }


            }

        }
    }
}

@Composable
fun testObject(name: String, name2: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp

    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {

                Column() {
                    Image(
                        painter = painterResource(id = R.drawable.ic_pic_currency_back),
                        contentDescription = "image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .padding(5.dp)
                    )
                }
                Column(modifier = Modifier.padding(10.dp)) {
                    Text(text = name)
                    Text(text = name2)
                }
            }
        }


    }

}






