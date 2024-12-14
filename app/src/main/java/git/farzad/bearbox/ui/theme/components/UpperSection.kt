package git.farzad.bearbox.ui.theme.components
import android.content.Context
import android.widget.Button
import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun UpperSection(){
    Box(modifier = modifier.padding(horizontal = 10.dp)) {
        Button(
            onClick = { /* ... */ },
            shape = CircleShape,
            modifier = modifier.size(40.dp),
            contentPadding = PaddingValues(1.dp)
        ) {
            // Inner content including an icon and a text label
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Favorite",
                modifier = Modifier.size(20.dp)
            )
        }

    }
}
