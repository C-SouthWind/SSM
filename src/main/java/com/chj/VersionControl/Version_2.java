package com.chj.VersionControl;

public class Version_2 extends VersionBase{

    @Override
    public String executor(String v) {
        System.out.println("调用版本2");
        return "当然版本"+v;
    }
}
