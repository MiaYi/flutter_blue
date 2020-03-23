package com.pauldemarco.flutter_blue_example;

import com.pauldemarco.flutter_blue.FlutterBluePlugin;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class MainActivity extends FlutterActivity {
    @Override
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        flutterEngine.getPlugins().add(new FlutterBluePlugin());
    }
}
