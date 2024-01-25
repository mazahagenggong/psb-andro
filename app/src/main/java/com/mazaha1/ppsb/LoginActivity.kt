package com.mazaha1.ppsb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mazaha1.ppsb.interfaces.LoginForm
import com.mazaha1.ppsb.ui.theme.PPSBMAZAHATheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PPSBMAZAHATheme(darkTheme = true) {
                LoginForm()
            }
        }
    }
}
