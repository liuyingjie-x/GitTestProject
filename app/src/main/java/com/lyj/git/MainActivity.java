package com.lyj.git;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lyj.effective.part1.Test;
import com.lyj.effective.part2.BuilderDemo;

import java.util.EnumSet;

/**
 * 测试git类
 */
public class MainActivity extends AppCompatActivity {
    private final String mStrOne = "master-5.8";
    private final String mStrTwo = "master-5.8.1";
    private HandlerThread handlerThread;
    TextView tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvContent = findViewById(R.id.tv_content);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Looper.prepare();//子线程中创建handler Looper得先prepare
                    Handler handler = new Handler(){
                        @Override
                        public void handleMessage(Message msg) {
                            super.handleMessage(msg);
                            tvContent.setText(msg.obj.toString());
                        }
                    };
                    Message message = Message.obtain();
                    message.obj = "test";
                    message.what = 1;
                    handler.sendMessage(message);
                    Looper.loop();//接收消息
                }
            }).start();
//        initView();
        handlerThread = new HandlerThread();
//        handlerThread.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Looper.prepare();
//
//                Handler handler = new Handler();
//                handler.post(new Runnable() {
//                    @Override
//                    public void run() {
//                tvContent.setText("onResume");
//                    }
//                });
//            }
//        }).start();
    }

    private void initView() {
        tvContent = findViewById(R.id.tv_content);
        tvContent.setText(mStrOne);
        tvContent.setText(mStrTwo);

    }

    private void staticFactory() {
        Test.valueOf("", 1);
        Test.intValue();
    }

    class HandlerThread extends Thread {
        private Handler handler;
        @Override
        public void run() {
            Looper.prepare();
            handler = new Handler() {
                @Override
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);
                    tvContent.setText("13232");
                }
            };
            Looper.loop();
        }
    }

    private void builderDemo() {
        BuilderDemo builderDemo = new BuilderDemo.Builder("", 11)
                .setAge(24)
                .setCareer("")
                .setDate(313131313)
                .build();
    }
    private void test(){

    }
}
