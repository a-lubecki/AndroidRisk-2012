
package fr.istic.androidrisk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent startServiceIntent = new Intent(context, BackgroundService.class);
        context.startService(startServiceIntent);
    }
    
}
