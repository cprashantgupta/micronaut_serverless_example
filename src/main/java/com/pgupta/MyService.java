package com.pgupta;

import jakarta.inject.Singleton;

@Singleton
public class MyService {

    void serviceInvoked(){
        System.out.println("My Service has been invoked");
    }
}
