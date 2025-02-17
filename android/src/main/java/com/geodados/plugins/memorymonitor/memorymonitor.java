package com.geodados.plugins.memorymonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

public class memorymonitor {

    public static MemoryInfo getMemoryInfo(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        if (activityManager == null) {
            Log.e("MemoryMonitor", "Erro ao acessar ActivityManager");
            return null;
        }

        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);

        return new MemoryInfo(memoryInfo.totalMem, memoryInfo.availMem, memoryInfo.lowMemory);
    }

    // Classe interna para representar as informações de memória
    public static class MemoryInfo {
        public long totalMemory;
        public long availableMemory;
        public boolean lowMemory;

        public MemoryInfo(long totalMemory, long availableMemory, boolean lowMemory) {
            this.totalMemory = totalMemory;
            this.availableMemory = availableMemory;
            this.lowMemory = lowMemory;
        }
    }
}
