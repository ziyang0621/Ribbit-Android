package com.example.ziyang0621.ribbit;

import android.app.Application;

import com.example.ziyang0621.ribbit.ui.MainActivity;
import com.example.ziyang0621.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

/**
 * Created by ziyang0621 on 11/12/14.
 */
public class RibbitApplication extends Application {

    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "iqh692x7NwGaINMXFFluiqxlmYFLYJTmXORmjCm6", "E2znbE6bvQEAJnNGzRzsnWkgiWRSjGRYhCJ7ToEi");
        // Also in this method, specify a default Activity to handle push notifications
        PushService.setDefaultPushCallback(this, MainActivity.class, R.drawable.ic_stat_ic_launcher);
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USR_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
