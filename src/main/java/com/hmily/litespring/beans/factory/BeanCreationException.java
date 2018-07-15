package com.hmily.litespring.beans.factory;

import com.hmily.litespring.beans.BeansException;

/**
 * Created by zyzhmily on 2018/7/14.
 */
public class BeanCreationException extends BeansException{

    private String beanName;

    public BeanCreationException(String msg) {
        super(msg);
    }

    public BeanCreationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public BeanCreationException(String beanName,String msg){
        super("Error create bean with name '"+beanName+"':"+msg);
        this.beanName=beanName;
    }
    public BeanCreationException(String beanName,String msg,Throwable cause){
        this(beanName,msg);
        initCause(cause);
    }

    public String getBeanName(){
        return this.beanName;
    }

}
