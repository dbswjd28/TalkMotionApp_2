package com.example.please.StateMachine;

public class onBackState implements State {

    onBackState(final StateMachine sm) { this.sm = sm; }

    private final StateMachine sm;

    @Override
    public void x_mover() {
        sm.say("onback_xr");
    }
    @Override
    public void x_movel() {
        sm.say("onback_xl");
    }
    @Override
    public void y_move() {
        sm.say("onback_y");
    }

    @Override
    public void z_mover() {
        sm.say("onback_zr");
    }
    @Override
    public void z_movel() {
        sm.say("onback_zl");
    }
    @Override
    public void modified_y1xr() {
        sm.say("modified_y1xr");
    }
    @Override
    public void modified_y1xl() {
        sm.say("modified_y1xl");
    }
    @Override
    public void modified_y1zr() {
        sm.say("modified_y1zr");
    }
    @Override
    public void modified_y1zl() {
        sm.say("modified_y1zl");
    }
    @Override
    public void modified_y2xr() {
        sm.say("modified_y2xr");
    }
    @Override
    public void modified_y2xl() {
        sm.say("modified_y2xl");
    }
    @Override
    public void modified_y2zr() {
        sm.say("modified_y2zr");
    }
    @Override
    public void modified_y2zl() {
        sm.say("modified_y2zl");
    }
}
