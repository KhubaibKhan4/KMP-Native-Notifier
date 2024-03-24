import androidx.compose.runtime.Composable
import kotlinx.browser.window

@Composable
actual fun getNotification(message: String) {
window.alert(message)
}