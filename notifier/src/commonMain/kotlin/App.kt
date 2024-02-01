import androidx.compose.runtime.Composable

@Composable
fun ShowNotification(
    message: String
) {
    getNotification(message = message)
}

@Composable
internal expect fun getNotification(message: String)