# android-capacitor-memory-monitor

Um plugin que visa disponibilizar informações sobre o uso de memória de um dispositivo android

## Install

```bash
npm install android-capacitor-memory-monitor
npx cap sync
```

## API

<docgen-index>

* [`getMemoryInfo()`](#getmemoryinfo)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getMemoryInfo()

```typescript
getMemoryInfo() => Promise<MemoryInfo>
```

Obtém informações sobre a memória do dispositivo.

**Returns:** <code>Promise&lt;<a href="#memoryinfo">MemoryInfo</a>&gt;</code>

--------------------


### Interfaces


#### MemoryInfo

| Prop                  | Type                 |
| --------------------- | -------------------- |
| **`totalMemory`**     | <code>number</code>  |
| **`availableMemory`** | <code>number</code>  |
| **`lowMemory`**       | <code>boolean</code> |

</docgen-api>
