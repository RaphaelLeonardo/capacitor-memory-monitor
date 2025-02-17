package com.geodados.plugins.memorymonitor;

import android.content.Context;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "memorymonitor")
public class memorymonitorPlugin extends Plugin {

    @PluginMethod
    public void getMemoryInfo(PluginCall call) {
        Context context = getContext();
        memorymonitor.MemoryInfo memoryInfo = memorymonitor.getMemoryInfo(context);

        if (memoryInfo == null) {
            call.reject("Erro ao obter informações de memória.");
            return;
        }

        JSObject result = new JSObject();
        result.put("totalMemory", memoryInfo.totalMemory);
        result.put("availableMemory", memoryInfo.availableMemory);
        result.put("lowMemory", memoryInfo.lowMemory);

        call.resolve(result);
    }
}
