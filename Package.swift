// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "AndroidCapacitorMemoryMonitor",
    platforms: [.iOS(.v13)],
    products: [
        .library(
            name: "AndroidCapacitorMemoryMonitor",
            targets: ["memorymonitorPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", branch: "main")
    ],
    targets: [
        .target(
            name: "memorymonitorPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/memorymonitorPlugin"),
        .testTarget(
            name: "memorymonitorPluginTests",
            dependencies: ["memorymonitorPlugin"],
            path: "ios/Tests/memorymonitorPluginTests")
    ]
)