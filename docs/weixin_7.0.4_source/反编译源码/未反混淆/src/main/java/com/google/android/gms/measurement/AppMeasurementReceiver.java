package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzge;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzge {
    private zzgb zzadd;

    public final PendingResult doGoAsync() {
        AppMethodBeat.i(77173);
        PendingResult goAsync = goAsync();
        AppMethodBeat.o(77173);
        return goAsync;
    }

    public final void doStartService(Context context, Intent intent) {
        AppMethodBeat.i(77172);
        WakefulBroadcastReceiver.startWakefulService(context, intent);
        AppMethodBeat.o(77172);
    }

    public final void onReceive(Context context, Intent intent) {
        AppMethodBeat.i(77171);
        if (this.zzadd == null) {
            this.zzadd = new zzgb(this);
        }
        this.zzadd.onReceive(context, intent);
        AppMethodBeat.o(77171);
    }
}
