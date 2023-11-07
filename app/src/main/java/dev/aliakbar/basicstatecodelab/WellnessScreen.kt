import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.aliakbar.basicstatecodelab.WellnessTasksList

@Composable
fun WellnessScreen(modifier: Modifier = Modifier)
{
    Column(modifier = modifier) {
        StatefulCounter()
        WellnessTasksList()
    }
}