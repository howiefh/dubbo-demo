package io.github.howiefh.provider.impl;

import io.github.howiefh.provider.RegistryService;

public class RegistryServiceImpl implements RegistryService{

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

}
