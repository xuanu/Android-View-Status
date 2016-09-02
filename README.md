# Android-View-Status
显示一个控件不同状态的布局文件
类似ListView数据为空时显示的空布局，但是这个是要自己控件的，所有实用性不大，不如自己在代码里，我只是提供一个简单的样子，方便自己用。

![image](https://github.com/xuanu/Android-View-Status/raw/master/screenshots/screenshos_01.png)


1、使用方法：增加仓库 maven { url "https://jitpack.io" },增加依赖 compile 'com.github.xuanu:Android-View-Status:0.0.1'

2、已有方法
其中View为自定义view，OnClickListener自定义点击 回调
showNoNetworkView()//显示没网
showNoNetworkView(View)
showNoNetworkView(OnClickListener)
showNoNetworkView(View,OnClickListener)
showLoadingWrongView()//显示加载失败
showLoadingWrongView(View)
showLoadingWrongView(OnClickListener)
showLoadingWrongView(View,OnClickListener)
showLoadingView()//显示加载中
showLoadingView(View)
showNoDataView()//显示没有数据
showNoDataView(View)
showNoDataView(OnClickListener)
showNoDataView(View,OnClickListener)



