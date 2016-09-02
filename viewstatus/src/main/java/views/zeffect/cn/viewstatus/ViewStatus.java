package views.zeffect.cn.viewstatus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import views.zeffect.cn.viewstatus.utils.ViewStatusUtils;

/**
 * 显示不同状态的布局
 * Created by zeffect on 2016/9/2.
 */
public class ViewStatus {
    private Context mContext;
    private ViewGroup mParentView;
    private View mChildView;
    private View noNetwrokView, loadingView, loadingWrongView, noDataView;

    /****
     * 传入当前布局，在当前布局的父布局加入王一层指示布局
     *
     * @param pChildView
     */
    public ViewStatus(Context pContext, View pChildView) {
        mContext = pContext;
        mChildView = pChildView;
        mParentView = (ViewGroup) pChildView.getParent();
    }

    public void showNoNetworkView() {
        showNoNetworkView(null, null);
    }

    public void showNoNetworkView(View pView) {
        showNoNetworkView(pView, null);
    }

    public void showNoNetworkView(View.OnClickListener pClick) {
        showNoNetworkView(null, pClick);
    }

    /***
     * 设置没有网络时显示的布局
     *
     * @param pView  自定义显示视图
     * @param pClick 点击回调
     */
    public void showNoNetworkView(View pView, View.OnClickListener pClick) {
        removeAllViews();
        if (noNetwrokView == null) {
            if (pView != null) {
                noNetwrokView = pView;
            } else {
                noNetwrokView = LayoutInflater.from(mContext).inflate(R.layout.viewstatus_no_netwrok, null);
            }
        }
        if (pClick != null) {
            noNetwrokView.findViewById(R.id.vs_nn_root).setOnClickListener(pClick);
        } else {
            noNetwrokView.findViewById(R.id.vs_nn_root).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ViewStatusUtils.openWifiSetting(mContext);
                }
            });
        }
        mParentView.addView(noNetwrokView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }

    /**
     * 设置加载中
     */
    public void showLoadingView() {
        showLoadingView(null);
    }

    public void showLoadingView(View pView) {
        removeAllViews();
        if (loadingView == null) {
            if (pView != null) {
                loadingView = pView;
            } else {
                loadingView = LayoutInflater.from(mContext).inflate(R.layout.viewstatus_loading, null);
            }
        }
        mParentView.addView(loadingView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }

    public void showLoadingWrongView() {
        showLoadingWrongView(null, null);
    }

    public void showLoadingWrongView(View pView) {
        showLoadingWrongView(pView, null);
    }

    public void showLoadingWrongView(View.OnClickListener pClick) {
        showLoadingWrongView(null, pClick);
    }

    /**
     * 显示加载失败的布局
     *
     * @param pView  自定义布局
     * @param pClick 点击事件
     */
    public void showLoadingWrongView(View pView, View.OnClickListener pClick) {
        removeAllViews();
        if (loadingWrongView == null) {
            if (pView != null) {
                loadingWrongView = pView;
            } else {
                loadingWrongView = LayoutInflater.from(mContext).inflate(R.layout.viewstatus_loading_faile, null);
            }
        }
        if (pClick != null) {
            loadingWrongView.findViewById(R.id.vs_lf_root).setOnClickListener(pClick);
        }
        mParentView.addView(loadingWrongView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

    }

    public void showNoDataView() {
        showNoDataView(null, null);
    }

    public void showNoDataView(View pView) {
        showNoDataView(pView, null);
    }

    public void showNoDataView(View.OnClickListener pClick) {
        showNoDataView(null, pClick);
    }

    /**
     * 显示没有数据的布局
     *
     * @param pClick
     */
    public void showNoDataView(View pView, View.OnClickListener pClick) {
        removeAllViews();
        if (noDataView == null) {
            if (pView != null) {
                noDataView = pView;
            } else {
                noDataView = LayoutInflater.from(mContext).inflate(R.layout.viewstatus_no_data, null);
            }
        }
        if (pClick != null) {
            noDataView.findViewById(R.id.vs_nd_root).setOnClickListener(pClick);
        }
        mParentView.addView(noDataView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
    }

    /**
     * 显示内容布局
     */
    public void showContentView() {
        removeAllViews();
        mChildView.setVisibility(View.VISIBLE);
    }


    /**
     * 移除布局下所有控件
     */
    private void removeAllViews() {
        if (noNetwrokView != null) {
            mParentView.removeView(noNetwrokView);
        }
        if (loadingView != null) {
            mParentView.removeView(loadingView);
        }
        if (loadingWrongView != null) {
            mParentView.removeView(loadingWrongView);
        }
        if (noDataView != null) {
            mParentView.removeView(noDataView);
        }
        if (mChildView != null) {
            mChildView.setVisibility(View.GONE);
        }
    }

}
