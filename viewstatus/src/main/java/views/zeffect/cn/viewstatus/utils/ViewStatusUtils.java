package views.zeffect.cn.viewstatus.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;

/**
 * Created by zeffect on 2016/9/2.
 */
public class ViewStatusUtils {
    /**
     * 打开网络设置界面
     *
     * @param pContext 上下文
     */
    public static void openWifiSetting(Context pContext) {
        Intent intent = new Intent(Settings.ACTION_WIRELESS_SETTINGS);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (pContext != null) {
            pContext.startActivity(intent);
        }
    }
}
