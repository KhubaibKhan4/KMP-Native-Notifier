import androidx.compose.runtime.Composable

@Composable
internal actual fun getNotification(message: String) {
    val alertController = UIAlertController.alertControllerWithTitle(
        title = UIDevice.currentDevice.systemName,
        message = message,
        preferredStyle = UIAlertControllerStyleUIAlertControllerStyleAlert
    )
    alertController.addAction(
        UIAlertAction.actionWithTitle(
            "OK",
            style = UIAlertActionStyleUIAlertActionStyleDefault,
            handler = null
        )
    )
    viewController.presentViewController(alertController, animated = true, completion = null)
}