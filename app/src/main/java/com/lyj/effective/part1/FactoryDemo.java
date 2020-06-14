package com.lyj.effective.part1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.HashSet;
import java.util.Set;

import static com.lyj.effective.part6.EnumDemo.AGE;
import static com.lyj.effective.part6.EnumDemo.HIGH;

public class FactoryDemo {
    private final static int AAA[] = {10,2};


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private void setAaa() {
        AAA[1] = 1;
        AAA[2] = 3;
        Set<String> exaltation = new HashSet<>();
        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
            }
        };
        Handler handler1 = new Handler(){
            @Override
            public void dispatchMessage(Message msg) {
                super.dispatchMessage(msg);
            }
        };
//        Message message = new Message();
//        message.setAsynchronous(true);
//        message.getTarget();
//        handler.sendMessage(message);
//        LinearLayout linearLayout=new LinearLayout();
//        linearLayout.invalidate();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //    private FactoryDemo() {
//
//    }

}
