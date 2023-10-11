package com.example.mockitodemo.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplStubTest {

    @Test
    void test() {

        DataServiceStub dataServiceStub=new DataServiceStub();

        SomeBusinessImpl businessIml=new SomeBusinessImpl(dataServiceStub);
        int result=businessIml.findTheGreatestFromAllData();

        assertEquals(25,result);
    }
}