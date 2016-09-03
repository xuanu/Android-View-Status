# Android-View-Status
显示一个控件不同状态的布局文件
类似ListView数据为空时显示的空布局，但是这个是要自己控件的，所有实用性不大，不如自己在代码里，我只是提供一个简单的样子，方便自己用。

**四种状态图片** 
![image](https://github.com/xuanu/Android-View-Status/raw/master/screenshots/screenshos_01.png)  
 
#1、使用方法：
              增加仓库 maven { url "https://jitpack.io" }
              增加依赖 compile 'com.github.xuanu:Android-View-Status:0.0.1'
 
#2、已有方法
`其中View为自定义view，OnClickListener自定义点击回调`  
`自定义View,只会显示第一次传入的View,第二次可以不传入，默认是第一次传入的值`  

```
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
```
    
 #可能存在的问题
   1、布局实现原理是将原来的子控件隐藏，添加一个显示布局。如果是linearlayout，并且子控件不止一个，布局可能会不好看。
