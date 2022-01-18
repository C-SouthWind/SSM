package com.chj.VersionControl;

public class TestVersion {
    public static void main(String[] args) {
        VersionBase v = new VersionBase(new Version_2());
        System.out.println(v.executor("as"));
    }
}
