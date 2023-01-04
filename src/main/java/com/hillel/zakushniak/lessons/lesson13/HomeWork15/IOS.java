package com.hillel.zakushniak.lessons.lesson13.HomeWork15;

public interface IOS {

    String operationSystem = "iOS 16";

    default String getOperationSystem() {
        return operationSystem;
    }
}
