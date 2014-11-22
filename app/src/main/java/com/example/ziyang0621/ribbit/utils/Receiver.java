package com.example.ziyang0621.ribbit.utils;

import android.content.Context;
import android.content.Intent;

import com.example.ziyang0621.ribbit.ui.MainActivity;
import com.parse.ParsePushBroadcastReceiver;

/**
 * Created by ziyang0621 on 11/22/14.
 */
public class Receiver extends ParsePushBroadcastReceiver {

    @Override
    public void onPushOpen(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);
        i.putExtras(intent.getExtras());
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
