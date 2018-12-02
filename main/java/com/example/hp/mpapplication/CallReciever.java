package com.example.hp.mpapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;

public class CallReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        Bundle bundle = intent.getExtras();

        if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
            // Phone is ringing
           // MainActivity.musicSrv.pausePlayer();
        } else if (state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
            // Call received
        } else if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
            // Call Dropped or rejected
       //    MainActivity.musicSrv.playSong();
        }
    }
}
