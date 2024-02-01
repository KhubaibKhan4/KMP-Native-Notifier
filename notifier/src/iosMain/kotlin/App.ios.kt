import androidx.compose.runtime.Composable
import platform.UIKit.UIDevice
import platform.UIKit.UIViewController
import platform.UIKit.UIAlertController
import platform.UIKit.UIAlertAction
import platform.UIKit.UIAlertControllerStyle
import platform.UIKit.UIAlertActionStyle


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