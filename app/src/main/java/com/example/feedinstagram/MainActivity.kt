package com.example.feedinstagram



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.feedinstagram.ui.components.FeedScreen
import com.example.feedinstagram.ui.theme.FeedInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeedInstagramTheme {
                FeedScreen()
            }
        }
    }
}