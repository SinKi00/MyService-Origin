package com.example.szp.myservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by SZP on 2016/1/6.
 */
public class BootBroadcastReceiver extends BroadcastReceiver {

    private final String TAG = "BootBroadcastReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Intent service = new Intent(context,PrintListService.class);
            context.startService(service);
            Log.d(TAG, "开机自动服务自动启动.....");
            Log.d(TAG, "开机自动服务自动启动.....");
        }
    }
}
