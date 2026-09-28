package com.example.feedinstagram.model

import androidx.compose.ui.text.LinkAnnotation
import java.net.URL

data class Post (
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val imageUrl: String,
    val likes: Int,
    val caption: String,
    val isLiked: Boolean = false
)


data class  Story(
    val id: Int,
    val username: String,
    val profileImageUrl: String,
    val hasSeen: Boolean = false
)
