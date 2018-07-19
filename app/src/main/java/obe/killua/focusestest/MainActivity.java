package obe.killua.focusestest;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import obe.killua.focusestest.databinding.MainBinding;

/**
 * Created by Administrator on 2018/4/8.
 */

public class MainActivity extends Activity implements View.OnFocusChangeListener{

    MainBinding viewDataBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.main_layout);
        viewDataBinding.text1.setOnFocusChangeListener(this);
        viewDataBinding.text2.setOnFocusChangeListener(this);
        viewDataBinding.text3.setOnFocusChangeListener(this);
        viewDataBinding.text4.setOnFocusChangeListener(this);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        if(hasFocus){
            FocusUtils.focusView(viewDataBinding.focusBox,v,13);
        }
    }
}
