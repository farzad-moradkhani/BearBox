package git.farzad.bearbox.ui.theme.components

import android.content.res.Resources
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import git.farzad.bearbox.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SubUpperSection(){
    Column {
        Row (modifier = Modifier.fillMaxWidth()){
            Text("/home/farzad",
                modifier = Modifier.background(colorResource(R.color.bear_brown)).fillMaxWidth().padding(horizontal = 10.dp).basicMarquee(),
                maxLines = 1,
                fontSize = 20.sp
            )
        }
        Row (modifier = Modifier.fillMaxWidth()){
            Text("/home/farzad",
                modifier = Modifier.background(colorResource(R.color.bear_brown)).fillMaxWidth().padding(horizontal = 10.dp).basicMarquee(),
                maxLines = 1,
                fontSize = 20.sp
            )
        }
    }
}
