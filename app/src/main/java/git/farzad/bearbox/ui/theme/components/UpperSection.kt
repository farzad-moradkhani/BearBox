package git.farzad.bearbox.ui.theme.components
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text2.input.TextFieldLineLimits
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import git.farzad.bearbox.R

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Preview(showSystemUi = true)
@Composable
fun UpperSection(){

    //UpperSection includes Navigation Drawer, Title, SearchBar, SearchButton
    //Main Row
    Row (
        modifier = Modifier.fillMaxWidth().height(60.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        //Navigation Drawer and Title
        Row (
            modifier = Modifier.weight(0.45f),
            verticalAlignment = Alignment.CenterVertically
        ){
            IconButton (onClick = {

            }) {
                Image( painterResource(R.drawable.slider_icon),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.width(22.dp))
            }
            val title = "Home"
            Text(title
                , fontSize = 20.sp
                , modifier = Modifier.basicMarquee()
                , maxLines = 1
            )
        }
        //Search and Input Box
        Row (
            modifier = Modifier.weight(0.55f).fillMaxHeight().padding(5.dp),

        ){
            var searchInput by remember { mutableStateOf("") }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .border(2.dp,Color.Black, shape = RoundedCornerShape(11.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                BasicTextField(
                    value = searchInput,
                    onValueChange = {searchInput=it},
                    textStyle = TextStyle(fontSize = 20.sp),
                    modifier = Modifier.fillMaxWidth(0.8f).padding(start = 10.dp),
                    singleLine = true
                )
                IconButton(
                    onClick = {},
                ) {
                    Icon(painterResource(R.drawable.search_icon)
                        , modifier = Modifier.size(30.dp)
                        ,contentDescription = "search")
                }
            }

        }
    }

}
