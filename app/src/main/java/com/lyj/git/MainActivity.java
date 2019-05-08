package com.lyj.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 测试git类
 */
public class MainActivity extends AppCompatActivity {
    private final String mStrOne = "master-5.8";
    private final String mStrTwo ="master-5.8.1";

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
}
