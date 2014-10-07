package com.example.myapplication;

import java.util.Arrays;

public class TestMyApplication extends MyApplication {
  @Override
  public Object[] getModules() {
    Object[] modules = super.getModules();
    Object[] updatedModules = Arrays.copyOf(modules, modules.length + 1);
    updatedModules[modules.length] = new TestModule();
    return updatedModules;
  }
}
