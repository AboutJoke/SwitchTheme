package com.fantasy.switchtheme;

import android.content.Context;


/**
 * Created by Fantasy on 2016/4/15.
 */
public class UiUtils {

    //获取主题
    public static int getAppTheme(Context ctx) {
        String value = Preferences.getString(ctx, "activity_theme", "1");
        switch (Integer.valueOf(value)) {
            case 1:
                return R.style.AppTheme;//白色主题
            case 2:
                return R.style.AppTheme_Black;
            default:
                return R.style.AppTheme;//默认白色
        }
    }


    //切换主题
    //当然也可以使用资源ID来进行标记
    public static void switchAppTheme( Context ctx){
        String value = Preferences.getString(ctx, "activity_theme", "1");
        switch (Integer.valueOf(value)){
            case 1:
                Preferences.setString(ctx, "activity_theme", "2");
                break;
            case 2:
                Preferences.setString(ctx, "activity_theme", "1");
                break;
            default:
                Preferences.setString(ctx, "activity_theme", "1");
                break;
        }
    }
}
