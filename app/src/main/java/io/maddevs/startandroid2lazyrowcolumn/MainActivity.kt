package io.maddevs.startandroid2lazyrowcolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.maddevs.startandroid2lazyrowcolumn.ui.theme.StartAndroid2LazyRowColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
               /*items(count = 100){
                   Text(text = "$it Walter ", fontSize = 30.sp, modifier = Modifier.padding(vertical = 10.dp))
               }*/
                itemsIndexed(
                    listOf("Walter", "Sultan", " Baysh")
                ){ index, item->
                    Text(text = "$item ", fontSize = 30.sp, modifier = Modifier.padding(vertical = 10.dp))
                }

            }
        }
    }
}
