package com.ravi.java.dailyPractice;

import java.util.Objects;

public class MySingleton {

    private static volatile MySingleton mySingleton = null;

    private MySingleton(){

    }

    public static MySingleton getMySingletonObject() {
        if(mySingleton == null){
            synchronized (MySingleton.class){
                if(mySingleton == null){
                    mySingleton = new MySingleton();
                }
            }
        }
        return mySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException("Clone of this class not supported");
    }
    protected Object readResolve(){
        return getMySingletonObject();
    }
}
