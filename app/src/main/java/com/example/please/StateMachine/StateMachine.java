package com.example.please.StateMachine;

import android.content.Context;

import com.example.please.Database.DatabaseHelper;
import com.example.please.MainActivity;
import com.example.please.Speaker;

public class StateMachine {

    private State state;

    private Speaker speaker;
    private MainActivity a;
    private DatabaseHelper db;

    public StateMachine(MainActivity a, DatabaseHelper db) {
        this.a = a;
        this.db = db;
        speaker = new Speaker(this.a);
        ONBACK = new onBackState(this);
        ONFRONT = new onFrontState(this);
        UPRIGHT = new uprightState(this);
    }

    private final State ONBACK;
    private final State ONFRONT;
    private final State UPRIGHT;

    public void toBack() { this.state = ONBACK; }
    public void toFront() { this.state = ONFRONT; }
    public void toUpright() { this.state = UPRIGHT; }

    public void x_mover() { this.state.x_mover(); }
    public void x_movel() {this.state.x_movel();}
    public void y_move() { this.state.y_move(); }
    public void z_mover() { this.state.z_mover(); }
    public void z_movel() {this.state.z_movel();}
    public void modified_y1xr() {this.state.modified_y1xr();}
    public void modified_y1xl() {this.state.modified_y1xl();}
    public void modified_y1zr() {this.state.modified_y1zr();}
    public void modified_y1zl() {this.state.modified_y1zl();}
    public void modified_y2xr() {this.state.modified_y2xr();}
    public void modified_y2xl() {this.state.modified_y2xl();}
    public void modified_y2zr() {this.state.modified_y2zr();}
    public void modified_y2zl() {this.state.modified_y2zl();}

    public boolean isPlaying() { return this.speaker.isPlaying(); }
    void say(String s) {
        String[] gestures = this.db.getGestures();
        String[] names = this.db.getNames();

        for(int i = 0; i < names.length; i++) {
            if (s.equals(gestures[i])) {
                speaker.saySomething(names[i]);
            }
        }
    }

    Context getContext() { return this.a.getApplicationContext(); }
}
