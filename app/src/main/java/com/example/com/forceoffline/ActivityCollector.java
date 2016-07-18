package com.example.com.forceoffline;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/18.
 */
public class ActivityCollector extends Activity {
    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity)
    {
        activities.add(activity);
    }
    public static void remove(Activity activity)
    {
        activities.remove(activity);
    }
    public static void finishAll()
    {
        for(Activity activityinfo:activities)
        {
            if(!activityinfo.isFinishing())
            {
                activityinfo.finish();
            }
        }
    }
}
