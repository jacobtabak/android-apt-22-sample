package com.example.myapplication;

import android.app.Application;

import dagger.ObjectGraph;

public class MyApplication extends Application {
  private ObjectGraph mObjectGraph;

  @Override
  public void onCreate() {
    super.onCreate();
    createAndInjectObjectGraph();
  }

  public void createAndInjectObjectGraph() {
    mObjectGraph = ObjectGraph.create(getModules());
    mObjectGraph.inject(this);
  }

  protected Object[] getModules() {
    return new Object[] { MyModule.class };
  }

  public <T> T inject(T object) {
    return mObjectGraph.inject(object);
  }
}
