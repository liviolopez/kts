#!/usr/bin/env kotlin
/// bin/true <<EOC 2>/dev/null || true
/*
EOC
kotlinc -script \
-Xplugin="$(dirname $(realpath $(which kotlinc)))/../libexec/lib/kotlin-multiplatform-plugin.jar" \
-Xplugin="$(dirname $(realpath $(which kotlinc)))/../libexec/lib/sam-with-receiver.jar" \
-Xplugin="$(dirname $(realpath $(which kotlinc)))/../libexec/lib/all-open.jar" \
-Xplugin="$(dirname $(realpath $(which kotlinc)))/../libexec/lib/kotlin-scripting-compiler.jar" \
-Xplugin="$(dirname $(realpath $(which kotlinc)))/../libexec/lib/kotlinx-serialization-compiler-plugin.jar" \
"$0" "$@"
exit $?
*/

@file:DependsOn("org.jetbrains.kotlin:kotlin-stdlib:2.0.0")
@file:DependsOn("org.jetbrains.kotlin:kotlin-stdlib-common:2.0.0")
@file:DependsOn("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
@file:DependsOn("org.jetbrains.kotlin:kotlin-allopen:2.0.0")

// This script acts as a container for essential Kotlin compiler plugins and other utilities,
// making it easy to include these capabilities in other scripts. It sets up the environment
// with plugins for multiplatform support, functional interfaces, open classes, scripting,
// and serialization.

// The following plugins are configured:

// Multiplatform Plugin:
// Enables writing code that can be shared across different platforms such as JVM, JS, and Native.
// Useful for creating libraries or applications that target multiple platforms.

// SAM with Receiver Plugin:
// Simplifies the use of functional interfaces with receivers, making it easier to write
// concise functional-style code.

// AllOpen Plugin:
// Allows classes to be open for inheritance by default, which is particularly useful
// when using frameworks that require open classes, like Spring.

// Scripting Plugin:
// Provides scripting capabilities for Kotlin, allowing scripts to be compiled and executed
// in a more dynamic way.

// Serialization Plugin:
// Enables serialization and deserialization of Kotlin objects into different formats such as JSON.
// This is essential for data interchange and persistence.
