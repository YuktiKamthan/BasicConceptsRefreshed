package com.example.BasicConceptsRefresh.service.impl;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MySingletonClass implements Serializable,Cloneable {

    private volatile static MySingletonClass instance;

    //prevent new object instantiation through reflection
    private MySingletonClass() throws RuntimeException {
        if(instance!=null)
            throw new RuntimeException("Reflevtion is not permitted for this instance!");
    }

    public static MySingletonClass getInstance(){
       //Double lock for thread safety
        if(instance==null){
           synchronized (MySingletonClass.class){
               if(instance==null){
                   //Lazy initialization
                   instance = new MySingletonClass();
               }
           }
       }

        return instance;
    }

    //For protection against cloning
    @Override
    public MySingletonClass clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this instance is not permitted");
    }

    //For resolving the issue of new object instantiation during deserialization
    public Object readResolve() throws ObjectStreamException {
            return instance;
    }
}
