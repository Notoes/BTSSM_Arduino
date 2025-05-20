// Example Arduino sketch that transmits CAN data via Serial

#include <Arduino.h>

void setup() {
  Serial.begin(115200);
  while (!Serial) {
    ; // wait for serial port to connect
  }
}

void loop() {
  // Placeholder for reading sensor data or CAN bus
  int sensorValue = analogRead(A0);

  // Simple CSV output: timestamp,value
  unsigned long timestamp = millis();
  Serial.print(timestamp);
  Serial.print(',');
  Serial.println(sensorValue);

  delay(100); // Adjust to match logging rate
}
