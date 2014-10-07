package com.example.myapplication;

import dagger.Module;

@Module(
    injects = MyApplication.class,
    library = true
)
public class MyModule {
}
