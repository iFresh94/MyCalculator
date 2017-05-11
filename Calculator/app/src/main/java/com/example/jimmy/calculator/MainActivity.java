package com.example.jimmy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener{
    //声明控件
    TextView rsText = null;
    Button btn_1 = null;
    Button btn_2 = null;
    Button btn_3 = null;
    Button btn_4 = null;
    Button btn_5 = null;
    Button btn_6 = null;
    Button btn_7 = null;
    Button btn_8 = null;
    Button btn_9 = null;
    Button btn_0 = null;
    Button btn_p = null;
    Button btn_del = null;
    Button btn_plus = null;
    Button btn_minus = null;
    Button btn_multiply = null;
    Button btn_divide = null;
    Button btn_equals = null;
    Button btn_clear = null;

    double num1 = 0,num2 = 0;
    double Result = 0;
    int operand = 0;
    boolean isClickEquals = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //从布局文件中获取控件
        rsText = (TextView) findViewById(R.id.rs_Text);
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_7 = (Button)findViewById(R.id.btn_7);
        btn_8 = (Button)findViewById(R.id.btn_8);
        btn_9 = (Button)findViewById(R.id.btn_9);
        btn_0 = (Button)findViewById(R.id.btn_0);
        btn_p = (Button)findViewById(R.id.btn_p);
        btn_del = (Button)findViewById(R.id.btn_del);
        btn_plus = (Button)findViewById(R.id.btn_plus);
        btn_minus = (Button)findViewById(R.id.btn_minus);
        btn_multiply = (Button)findViewById(R.id.btn_multiply);
        btn_divide = (Button)findViewById(R.id.btn_divide);
        btn_equals = (Button)findViewById(R.id.btn_equals);
        btn_clear = (Button)findViewById(R.id.btn_clear);

        //添加监听
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_p.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_equals.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String str_num;
        String str1;
        String str2;
        switch (v.getId()){
            //点击0~9
            case R.id.btn_0:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();//获取编辑框里的字符串，下同
                str_num += "0";//向字符串str_num中追加字符“0”，下同
                rsText.setText(str_num);//将字符串str_num显示在编辑框中，下同
                break;

            case R.id.btn_1:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                str_num += "1";
                rsText.setText(str_num);
                break;

            case R.id.btn_2:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                str_num += "2";
                rsText.setText(str_num);
                break;

            case R.id.btn_3:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                str_num += "3";
                rsText.setText(str_num);
                break;

            case R.id.btn_4:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                str_num += "4";
                rsText.setText(str_num);
                break;

            case R.id.btn_5:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                str_num += "5";
                rsText.setText(str_num);
                break;

            case R.id.btn_6:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                str_num += "6";
                rsText.setText(str_num);
                break;

            case R.id.btn_7:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                str_num += "7";
                rsText.setText(str_num);
                break;

            case R.id.btn_8:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                str_num += "8";
                rsText.setText(str_num);
                break;

            case R.id.btn_9:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                str_num += "9";
                rsText.setText(str_num);
                break;

            case R.id.btn_p:
                if (isClickEquals){
                    rsText.setText(null);
                    isClickEquals = false;
                }
                str_num = rsText.getText().toString();
                if(str_num.contains(".")){ //判断字符串中是否已经包含小数点
                    break;
                }
                else {
                    str_num += ".";
                    rsText.setText(str_num);
                    break;
                }


            //点击+,-,*,/
            case R.id.btn_plus:
                str1 = rsText.getText().toString();//点击“+”后将编辑框中的字符串取出
                //Log.i("test",str1);
                if (str1.equals("") || str1.equals(".")){
                    break;
                }//判断str1的内容是否等于""或".",即判断点击“+”之前是否有输入有效数字
                else{
                    num1 = Double.valueOf(str1);//将字符串str1转化为double类型的对象
                    rsText.setText(null);//清空编辑框以获取第二个数
                    //rsText.append("+");
                    operand = 1; //设置操作数，不同的运算符号有不同的操作数
                                // “1”为“+”，“2”为“-”，“3”为“*”，“4”为“/”
                    isClickEquals = false;
                    break;
                }

            case R.id.btn_minus:
                str1 = rsText.getText().toString();
                if (str1.equals("") || str1.equals(".")){
                    break;
                }
                else {
                    num1 = Double.valueOf(str1);
                    rsText.setText(null);
                    //rsText.append("-");
                    operand = 2;
                    isClickEquals = false;
                    break;
                }

            case R.id.btn_multiply:
                str1 = rsText.getText().toString();
                if (str1.equals("") || str1.equals(".")){
                    break;
                }
                else {
                    num1 = Double.valueOf(str1);
                    rsText.setText(null);
                    //rsText.append("*");
                    operand = 3;
                    isClickEquals = false;
                    break;
                }

            case R.id.btn_divide:
                str1 = rsText.getText().toString();
                if (str1.equals("") || str1.equals(".")){
                    break;
                }
                else {
                    num1 = Double.valueOf(str1);
                    rsText.setText(null);
                    //rsText.append("/");
                    operand = 4;
                    isClickEquals = false;
                    break;
                }

            case R.id.btn_equals:
                str2 = rsText.getText().toString();
                //Log.i("test",str2);
                //str2 = str2.substring(str1.length()+1,str2.length());
                //Log.i("test",str2);
                if (str2.equals("") || str2.equals(".")){
                    break;
                }//判断str2的内容是否等于"",即判断点击“=”之前是否有输入有效数字
                else {
                    num2 = Double.valueOf(str2);//将字符串str2转化为double类型的对象
                    rsText.setText(null);
                    //根据操作数来执行不同的运算
                    switch (operand) {
                        case 0:
                            Result = num2;
                            rsText.setText(String.valueOf(Result));
                            break;
                        case 1:
                            Result = num1 + num2;//加法
                            rsText.setText(String.valueOf(Result));
                            break;
                        case 2:
                            Result = num1 - num2;//减法
                            rsText.setText(String.valueOf(Result));
                            break;
                        case 3:
                            Result = num1 * num2;//乘法
                            rsText.setText(String.valueOf(Result));
                            break;
                        case 4:
                            if (num2 == 0) {
                                rsText.setText("除数为0，请清零重新输入");//除数为零时提示
                            } else {
                                Result = num1 / num2;//除法
                                rsText.setText(String.valueOf(Result));
                            }
                            break;
                    }
                    isClickEquals = true;
                    operand = 0;//点击“=”计算完后操作数设为0，再次点击“=”结果不变
                    break;
                }

            //点击删除
            case R.id.btn_del:
                String myStr = rsText.getText().toString();
                try{
                    rsText.setText(myStr.substring(0,myStr.length()-1));//截取字符串myStr的第一位到倒数第二位
                                                                        // 即删除最后一位
                }catch (Exception e){
                    rsText.setText("");//字符串myStr长度为零时的异常处理
                }
                break;

            //点击清零
            case R.id.btn_clear:
                rsText.setText("");//文本框清空
                break;

            default:
                break;
        }
    }
}
