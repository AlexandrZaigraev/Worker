package org.example;

import java.security.spec.ECField;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }


    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is error. WARNING!");
                i++;
            }
            else {
                callback.onDone("Task " + i + " is done");
            }

        }
    }

    Consumer<Integer> println = System.out::println;

}
