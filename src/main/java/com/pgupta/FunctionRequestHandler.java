package com.pgupta;

import io.micronaut.function.aws.MicronautRequestHandler;
import jakarta.inject.Inject;

public class FunctionRequestHandler extends MicronautRequestHandler<String, String> {

    @Inject
    private MyService myService;

    public FunctionRequestHandler() {
    }


    @Override
    public String execute(String input) {
        myService.serviceInvoked();
        return "Status" + input;
    }
}
