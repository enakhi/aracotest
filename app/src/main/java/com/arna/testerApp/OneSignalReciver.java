package com.arna.testerApp;
import com.arna.Advertise;
import com.onesignal.OSNotificationPayload;
import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationReceivedResult;

import org.json.JSONException;

public class OneSignalReciver extends NotificationExtenderService {
    @Override
    protected boolean onNotificationProcessing(OSNotificationReceivedResult receivedResult) {
        // Read properties from result.
        try {
            String result=receivedResult.payload.additionalData.getString("ng");
            Advertise.AdvertiseReceived(result,getApplicationContext());
        } catch (Throwable tr) {
//                return false;
        }
        // Return true to stop the notification from displaying.
        return false;
    }
}