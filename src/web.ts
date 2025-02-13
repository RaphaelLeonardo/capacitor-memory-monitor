import { WebPlugin } from '@capacitor/core';

import type { memorymonitorPlugin } from './definitions';

export class memorymonitorWeb extends WebPlugin implements memorymonitorPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
