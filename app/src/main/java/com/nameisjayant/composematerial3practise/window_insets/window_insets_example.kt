package com.nameisjayant.composematerial3practise.window_insets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.captionBar
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imeNestedScroll
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nameisjayant.composematerial3practise.ui.theme.Purple40
import com.nameisjayant.composematerial3practise.ui.theme.Purple80


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun WindowInsetExample() {

    // safeDrawing == gives padding from statusBars and navigationBars
    // safeContent == never draws into the occupied system spaces

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Purple80)
            .windowInsetsPadding(WindowInsets.safeDrawing)
    ) {
        Column {
           // Spacer(modifier = Modifier.windowInsetsTopHeight(WindowInsets.systemBars))
            LazyColumn(
                modifier = Modifier.imePadding()
                    .imeNestedScroll()
            ) {
                items(20) {
                    TextField(
                        value = "", onValueChange = {},
                        placeholder = {
                            Text(text = "$it")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp, vertical = 10.dp),

                        )
                }
            }
        }
        FloatingActionButton(onClick = {}, modifier = Modifier.align(Alignment.BottomEnd)
            .padding(16.dp)
            .navigationBarsPadding()
            .imePadding()
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "")
        }
    }

}