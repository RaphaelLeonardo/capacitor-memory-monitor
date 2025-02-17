import { WebPlugin } from '@capacitor/core';

import type { memorymonitorPlugin } from './definitions';

export class memorymonitorWeb extends WebPlugin implements memorymonitorPlugin {
  async getMemoryInfo(): Promise<{ totalMemory: number; availableMemory: number; lowMemory: boolean }> {
    console.warn('getMemoryInfo() não está implementado na Web. Retornando valores fictícios.');
    
    return {
      totalMemory: 8 * 1024 * 1024 * 1024, // Simulação de 8GB de RAM
      availableMemory: 4 * 1024 * 1024 * 1024, // Simulação de 4GB disponíveis
      lowMemory: false, // Simulação de que a memória não está baixa
    };
  }
}
