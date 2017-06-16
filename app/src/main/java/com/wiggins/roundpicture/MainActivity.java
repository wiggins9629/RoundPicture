package com.wiggins.roundpicture;

import android.os.Bundle;
import android.view.View;

import com.wiggins.roundpicture.base.BaseActivity;
import com.wiggins.roundpicture.utils.UIUtils;
import com.wiggins.roundpicture.widget.TitleView;

/**
 * @Description 自定义圆形、圆角矩形View
 * @Author 一花一世界
 */
public class MainActivity extends BaseActivity {

    private TitleView titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        titleView = (TitleView) findViewById(R.id.titleView);
        titleView.setAppTitle(UIUtils.getString(R.string.title));
        titleView.setLeftImageVisibility(View.GONE);
    }
}
