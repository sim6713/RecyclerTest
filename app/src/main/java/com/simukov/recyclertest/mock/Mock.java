package com.simukov.recyclertest.mock;

public class Mock {
    private  String mName;
    private  int mValue;

    public Mock(String Name, int Value) {
        this.mName = Name;
        this.mValue = Value;
    }

    public String getmName() {
        return mName;
    }

    public void setName(String Name) {
        this.mName = Name;
    }

    public String getValue() {
        return String.valueOf(mValue);
    }

    public void setmValue(int Value) {
        this.mValue = Value;
    }
}
