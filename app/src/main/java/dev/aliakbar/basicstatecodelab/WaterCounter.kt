import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.aliakbar.basicstatecodelab.WellnessTaskItem

@Composable
fun WaterCounter(modifier: Modifier = Modifier)
{
    Column(modifier = modifier.padding(16.dp))
    {
        var count by remember { mutableStateOf(0) }

        if (count > 0)
        {
            var showTask by remember { mutableStateOf(true) }
            if (showTask)
            {
                WellnessTaskItem(
                    taskName = "Have you taken your 15 minute walk today?",
                    onClose = { showTask = false }
                )
            }

            // This text is present if the button has been clicked
            // at least once; absent otherwise
            Text(text = "You`ve had $count glasses")
        }

        Row(modifier = Modifier.padding(top = 8.dp))
        {
            Button(
                onClick = { count++ },
                enabled = count < 10
            )
            {
                Text(text = "Add one")
            }
            Button(
                onClick = { count = 0 },
                modifier = Modifier.padding(start = 8.dp)
            )
            {
                Text(text = "Clear water count")    
            }
        }
    }
}