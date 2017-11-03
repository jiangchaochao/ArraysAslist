package jiangc.cn.yview.arraysaslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

/*实践Arrays.aslist的使用方式
*
* 方法介绍：
* 1.该方法不太适用于基本数组类型（byte,short,int,long,float,double,boolean）
* 2.该方法将数组与列表连接起来，当更新其中之一时，另一个自动更新
* 3.不支持add和remove方法
*
* 下面看现象
* */
public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] s = {"aa", "bb", "cc"};
        /*该方法返回一个和数组相关联的list*/
        List<String> strlist = Arrays.asList(s);
        /*打印*/
        for (String s1 : strlist) {
            Log.i(TAG, "   " + s1);
        }
        Log.i(TAG, "￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥---分割线---￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥￥");
        /*修改其中一个*/
        s[0] = "111";
        /*打印*/
        for (String s1 : strlist) {
            Log.i(TAG, "   " + s1);
        }
    }
}
