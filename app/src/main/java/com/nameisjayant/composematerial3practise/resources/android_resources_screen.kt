package com.nameisjayant.composematerial3practise.resources

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.booleanResource
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerArrayResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import com.nameisjayant.composematerial3practise.R


@Composable
fun ResourcesScreen() {
    val context = LocalContext.current

    val integerArrayData = integerArrayResource(id = R.array.integer_array)
    val integerData = integerResource(id = R.integer.my_integer)
    val stringArrayResources = stringArrayResource(id = R.array.string_array)
    val boolResourceValue = booleanResource(id = R.bool.bool_value)


    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = context.getString(R.string.hey_i_am_text))

        Text(
            text = stringResource(R.string.hey_i_am_text),
            modifier = Modifier.padding(dimensionResource(id = R.dimen.all_padding)),
            color = colorResource(id = R.color.purple_200)
        )

    }

}