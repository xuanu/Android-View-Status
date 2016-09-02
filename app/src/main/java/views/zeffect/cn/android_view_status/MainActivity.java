package views.zeffect.cn.android_view_status;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

import views.zeffect.cn.viewstatus.ViewStatus;
import views.zeffect.cn.viewstatus.utils.ViewStatusUtils;

public class MainActivity extends AppCompatActivity {
    ViewStatus mViewStatus;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mViewStatus = new ViewStatus(this, findViewById(R.id.text));
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show((int) (Math.random() * 5));
            }
        });
    }

    private void show(int i) {
        switch (i) {
            case 0:
                mViewStatus.showContentView();
                break;
            case 1:
                mViewStatus.showLoadingView();
                break;
            case 2:
                mViewStatus.showLoadingWrongView(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        System.out.println("点击了");
                        Toast.makeText(mContext, "点击了", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 3:
                mViewStatus.showNoDataView(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        System.out.println("点击了");
                        Toast.makeText(mContext, "点击了", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 4:
                mViewStatus.showNoNetworkView();
                break;
        }
    }

}
