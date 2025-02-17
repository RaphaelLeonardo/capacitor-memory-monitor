export interface memorymonitorPlugin {
  /**
   * Obtém informações sobre a memória do dispositivo.
   */
  getMemoryInfo(): Promise<MemoryInfo>;
}

export interface MemoryInfo {
  totalMemory: number; // Memória total do dispositivo em bytes
  availableMemory: number; // Memória disponível em bytes
  lowMemory: boolean; // Indica se o dispositivo está com pouca memória
}
