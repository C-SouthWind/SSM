package com.chj.VersionControl;

public interface Version {
    String executor(String v);
}

class VersionBase implements Version{
    private Version obj;
    public VersionBase(){}

    public VersionBase(Version obj){
        this.obj = obj;
    }
    @Override
    public String executor(String v) {
        return obj.executor(v);
    }
}
