package com.lazorjack.entity;

/**
 * Created by jacklazorchak on 11/6/16.
 */
public enum Position {
    QB("Quarterback"),
    RB("Running Back"),
    FB("Fullback"),
    WR("Wide Receiver"),
    TE("Tight End"),
    OL("Offensive Lineman"),
    C("Center"),
    G("Guard"),
    LG("Left Guard"),
    RG("Right Guard"),
    T("Tackle"),
    LT("Left Tackle"),
    RT("Right Tackle"),
    K("Kicker"),
    KR("Kick Returner"),
    DL("Defensive Lineman"),
    DE("Defensive End"),
    DT("Defensive Tackle"),
    NT("Nose Tackle"),
    LB("Linebacker"),
    ILB("Inside Linebacker"),
    OLB("Outside Linebacker"),
    MLB("Middle Linebacker"),
    DB("Defensive Back"),
    CB("Cornerback"),
    FS("Free Safety"),
    SS("Strong Safety"),
    S("Safety"),
    P("Punter"),
    PR("Punt Returner");

    private String fullName;

    Position(String fullName){
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
