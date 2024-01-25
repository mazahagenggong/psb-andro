package com.mazaha1.ppsb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mazaha1.ppsb.ui.theme.PPSBMAZAHATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PPSBMAZAHATheme(darkTheme = true) {
                // A surface container using the 'background' color from the theme {
                    CreateComponent()
            }
        }
    }
}
@Composable
fun CreateComponent(){
    Surface {
        Column(
            verticalArrangement =  Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Testing")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateComponentPreview() {
    PPSBMAZAHATheme(darkTheme = true) {
        CreateComponent()
    }

}

