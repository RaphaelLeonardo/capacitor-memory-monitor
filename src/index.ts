import { registerPlugin } from '@capacitor/core';

import type { memorymonitorPlugin } from './definitions';

const memorymonitor = registerPlugin<memorymonitorPlugin>('memorymonitor', {
  web: () => import('./web').then((m) => new m.memorymonitorWeb()),
});

export * from './definitions';
export { memorymonitor };
