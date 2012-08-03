package com.ku.learn.test.scope;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MyBean {

    String state = "";

    @PostConstruct
    public void test() {
       // System.out.println("pc called");
        state = "state set";
    }

    public String getState() {
        return state;
    }

    public String action() {
        return "";
    }
}
