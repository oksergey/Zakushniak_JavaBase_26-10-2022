package com.hillel.zakushniak.lessons.lesson13.HomeWork15;

public interface LinuxOS {

    String operationSystem = "Linux";

    default String getOperationSystem(){
        return operationSystem;
    }

}
