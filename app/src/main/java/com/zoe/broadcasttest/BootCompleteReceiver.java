package com.zoe.broadcasttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootCompleteReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context,Intent intent){
        Toast.makeText(context,"Bopt Complete",Toast.LENGTH_SHORT).show();
    }
}