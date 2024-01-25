import androidx.compose.ui.window.ComposeUIViewController
import org.notifier.app.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
