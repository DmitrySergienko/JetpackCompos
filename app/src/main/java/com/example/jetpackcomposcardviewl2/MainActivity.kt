package com.example.jetpackcomposcardviewl2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
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
import com.example.jetpackcomposcardviewl2.ui.theme.CustomBlack200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val textTest =
                remember { mutableListOf("Great things happen when developers work together—from teaching and sharing knowledge to building better software. Teletype for Atom makes collaborating on code just as easy as it is to code alone, right from your editor.") }
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(CustomBlack200)
                    .padding(3.dp)
                    .alpha(0.9f)
            ) {
                itemsIndexed(
                    listOf(
                        LocalData(R.drawable.ic_pic_currency_back, "AnyName", "$textTest"),
                        LocalData(R.drawable.ic_pic_currency_back, "AnyName", "$textTest"),
                        LocalData(R.drawable.ic_pic_currency_back, "AnyName", "$textTest"),
                        LocalData(R.drawable.ic_pic_currency_back, "AnyName", "$textTest"),
                        LocalData(R.drawable.ic_pic_currency_back, "AnyName", "$textTest"),
                        LocalData(R.drawable.ic_pic_currency_back, "AnyName", "$textTest"),
                        LocalData(R.drawable.ic_pic_currency_back, "AnyName", "$textTest"),
                        LocalData(R.drawable.ic_pic_currency_back, "AnyName", "$textTest"),

                        )
                ) { _, item ->
                    NewCardObject(item = item)
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





