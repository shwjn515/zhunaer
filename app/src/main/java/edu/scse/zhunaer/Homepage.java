package edu.scse.zhunaer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends Activity {
    private Button mbtn_room;
    private Button mbtn_tenants;
    private Button mbtn_indent;
    private Button mbtn_bill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        //设置导航栏主题颜色
        StatusBarUtils.setWindowStatusBarColor(this, R.color.black);

//        mbtn_room = findViewById(R.id.btn_room);
//        mbtn_room.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到菜单页面
//                Intent intent = new Intent(Homepage.this,edu.scse.zhunaer.Room.class);
//                startActivity(intent);
//                //动画切换效果，淡出淡入
//                overridePendingTransition(R.xml.actions,0);
//                 Homepage.this.finish();
//            }
//        });
//        mbtn_tenants = findViewById(R.id.btn_tenants);
//        mbtn_tenants.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到菜单页面
//                Intent intent = new Intent(Homepage.this,edu.scse.zhunaer.Room.class);
//                startActivity(intent);
//                //动画切换效果，淡出淡入
//                overridePendingTransition(R.xml.actions,0);
//                Homepage.this.finish();
//            }
//        });
//        mbtn_indent = findViewById(R.id.btn_indent);
//        mbtn_indent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到菜单页面
//                Intent intent = new Intent(Homepage.this,edu.scse.zhunaer.Room.class);
//                startActivity(intent);
//                //动画切换效果，淡出淡入
//                overridePendingTransition(R.xml.actions,0);
//                Homepage.this.finish();
//            }
//        });
//        mbtn_bill= findViewById(R.id.btn_bill);
//        mbtn_bill.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到菜单页面
//                Intent intent = new Intent(Homepage.this,edu.scse.zhunaer.Room.class);
//                startActivity(intent);
//                //动画切换效果，淡出淡入
//                overridePendingTransition(R.xml.actions,0);
//                Homepage.this.finish();
//            }
//        });
    }
}