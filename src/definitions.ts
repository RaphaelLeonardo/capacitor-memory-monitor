export interface memorymonitorPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
