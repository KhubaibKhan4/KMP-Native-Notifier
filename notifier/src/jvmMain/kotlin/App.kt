import androidx.compose.runtime.Composable
import java.awt.SystemTray
import java.awt.TrayIcon
import javax.swing.JOptionPane

@Composable
internal actual fun getNotification() {
    if (SystemTray.isSupported()) {
        val tray = SystemTray.getSystemTray()
        val trayIcon = TrayIcon(null, "Demo Notification")
        tray.add(trayIcon)
        trayIcon.displayMessage(
            "Demo Notification Caption",
            "Demo Title",
            TrayIcon.MessageType.INFO
        )
    } else {
        JOptionPane.showMessageDialog(
            null,
            "This is the Message",
            "Desktop Notification",
            JOptionPane.INFORMATION_MESSAGE
        )
    }
}