package com.lyj.git;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        TextView tvContent = findViewById(R.id.tv_content);
        tvContent.setText(mStrOne);
        tvContent.setText(mStrTwo);
    }

    private void staticFactory() {
        Test.valueOf("", 1);
        Test.intValue();
    }

    private void builderDemo() {
        BuilderDemo builderDemo = new BuilderDemo.Builder("", 11)
                .setAge(24)
                .setCareer("")
                .setDate(313131313)
                .build();
    }
}
