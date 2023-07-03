package com.nameisjayant.composematerial3practise.semantics

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.selection.toggleable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.semantics


@Composable
fun SemanticsExampleScreen() {

    var check by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.toggleable(
            value = check,
            onValueChange = {
                check = it
            },
            role = Role.Checkbox
        ).semantics {

        }
    )

}