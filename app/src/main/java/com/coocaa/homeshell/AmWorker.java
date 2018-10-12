package com.coocaa.homeshell;

import android.util.Log;

public class AmWorker {
    private String mPackageName;
    private String mActivityName;

    public AmWorker(String packageName, String activityName){
        mPackageName = packageName;
        mActivityName = activityName;
    }

    public void Start() {
        try {
            String amCmdStr = String.format("am start %s/%s", mPackageName, mActivityName);
            ExeCommandResult result = new ExeCommand(true, true).run(amCmdStr, 10000).getResult();
            Log.d("homeshell.AmWorker", String.format("start %s/%s... success:\n  %s\n error:\n  %s", mPackageName, mActivityName, result.success, result.error));
        } catch (Exception e) {
            Log.d("homeshell.AmWorker", String.format("start %s/%s... error:\n  %s", mPackageName, mActivityName, e.toString()));
        }
    }
}
