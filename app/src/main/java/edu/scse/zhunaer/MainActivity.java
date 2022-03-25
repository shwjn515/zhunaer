package edu.scse.zhunaer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    private Button mBtn_zhuce;
    private Button mBtn_delete;
    private EditText eT_username;
    private EditText eT_password;
    private Button mBtn_yincang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        //设置导航栏主题颜色
        StatusBarUtils.setWindowStatusBarColor(this,R.color.black);

        //注册按钮监听
        mBtn_zhuce = findViewById(R.id.btn_zhuce);
        mBtn_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到菜单页面
                Intent intent = new Intent(edu.scse.zhunaer.MainActivity.this,edu.scse.zhunaer.Register.class);
                startActivity(intent);
                overridePendingTransition(R.xml.actions,0);
            }
        });
        //清除用户名输入框内容
        mBtn_delete =findViewById(R.id.btn_delete);
        eT_username =findViewById(R.id.usernameText);
        mBtn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eT_username.setText("");
            }
        });
        //设置密码显示模式
        mBtn_yincang = findViewById(R.id.btn_yincang);
        eT_password = findViewById(R.id.pwText);
        mBtn_yincang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eT_password.getInputType() == 128) {
                    //如果现在是显示密码模式
                    eT_password.setInputType(129);//设置为隐藏密码
                } else {
                    eT_password.setInputType(128);//设置为显示密码
                }
                eT_password.setSelection(eT_password.getText().length());//设置光标的位置到末尾
            }
        });
    }
}