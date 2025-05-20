# BTSSM Arduino Logging Concept

This repository contains a minimal proof of concept for logging vehicle data
from an Arduino to an Android application.  It is **not** a full replacement
for BTSSM, but a starting point for experimentation.

## Arduino Sketch

The `Arduino/logger.ino` sketch outputs a simple CSV line containing a
millisecond timestamp and a sample analog value.  The intent is to replace the
sensor read with real CAN bus or other ECU data.

## Android App Skeleton

The `android/` directory provides a very small Android project.  The main
activity keeps the screen on and is intended to read serial data from an
attached Arduino via a USB‐OTG cable.  Parsing of RomRaider definition files
and display customisation are left as TODOs.

### Features

* Keeps the screen awake during logging.
* Placeholder for USB serial connection.
* Support for dark/light theme via `DayNight` theme.

### Building

This project is a skeleton only.  Open the `android` folder in Android Studio
and allow it to download missing dependencies.  Because this environment has no
internet access, the dependencies (e.g. UsbSerial library) cannot be resolved
here.
