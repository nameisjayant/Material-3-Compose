package com.nameisjayant.composematerial3practise.components.navigatio_drawer

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nameisjayant.composematerial3practise.R
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ModalNavigationDrawerScreen() {

    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(drawerContent = {
        AppDrawer()
    }, drawerState = drawerState) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {},
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    }
                )
            }
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Text(text = "Contents")
            }
        }
    }
}

@Composable
fun AppDrawer() {

    var currentValue by remember { mutableStateOf("Home") }

    ModalDrawerSheet(
        modifier = Modifier.padding(end = 30.dp),
    ) {
        DrawerHeader(modifier = Modifier)
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn {
            items(drawerItemsList, key = { it.id }) {
                DrawerItems(
                    title = it.title,
                    selected = currentValue == it.title,
                    icon = it.icon,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
                ) {
                    currentValue = it
                }
            }
        }
    }
}

@Composable
fun DrawerItems(
    modifier: Modifier = Modifier,
    title: String,
    selected: Boolean,
    icon: ImageVector,
    onValueUpdate: (String) -> Unit
) {

    NavigationDrawerItem(
        badge = {
            if (selected)
                Icon(imageVector = Icons.Default.Check, contentDescription = null)
        },
        modifier = modifier,
        label = { Text(text = title) },
        selected = selected,
        onClick = { onValueUpdate(title) },
        icon = { Icon(imageVector = icon, contentDescription = null) })

}

@Composable
fun DrawerHeader(modifier: Modifier) {
    Column(
        modifier = modifier
            .background(MaterialTheme.colorScheme.secondary)
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Icon(
            painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = modifier
                .clip(CircleShape)
                .size(100.dp),
            tint = Color.Unspecified
        )
    }
}

data class DrawerItemModal(
    val id: Int,
    val title: String,
    val icon: ImageVector
)

val drawerItemsList = listOf(
    DrawerItemModal(
        1, "Home", icon = Icons.Default.Home
    ),
    DrawerItemModal(
        2, "Favourite", icon = Icons.Default.Favorite
    ),
    DrawerItemModal(
        3, "Profile", icon = Icons.Default.Person
    )
)