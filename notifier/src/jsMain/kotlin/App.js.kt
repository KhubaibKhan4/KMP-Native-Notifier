import androidx.compose.runtime.Composable
import kotlinx.browser.window

@Composable
internal actual fun getNotification(message: String) {
window.alert(message)
}