package com.chj.VersionControl;

public class Version_1 extends VersionBase{
    @Override
    public String executor(String v) {
        System.out.println("调用版本1");
        return "当然版本"+v;
    }
}
