package soutrik.whatevervalue.com.timerapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import soutrik.whatevervalue.com.timerapp.util.NotificationUtil
import soutrik.whatevervalue.com.timerapp.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}