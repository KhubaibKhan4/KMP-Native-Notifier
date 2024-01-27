import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
internal actual fun getNotification() {
    val context = LocalContext.current
    Toast.makeText(context,"Demo Toast", Toast.LENGTH_LONG).show()
}