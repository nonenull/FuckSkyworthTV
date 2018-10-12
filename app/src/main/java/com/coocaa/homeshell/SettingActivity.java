/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.coocaa.homeshell;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;

/*
 * CoocaaHomeShellActivity class that loads {@link MainFragment}.
 */
public class SettingActivity extends Activity {
    private String packageName = "com.tianci.setting";
    private String activity = ".activity.MainActivity";

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        new AmWorker(packageName, activity).Start();
    }

    @Override
    public void onResume() {
        super.onResume();
        new AmWorker(packageName, activity).Start();
    }
}
