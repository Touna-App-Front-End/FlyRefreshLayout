package com.fly.refresh.contract;

/**
 * Description: <下拉刷新的协议><br>
 * Author:      gxl<br>
 * Date:        2019/2/25<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public interface HeadContract {
    /**
     * 手指上滑下滑的回调
     * @param enable
     */
    void onPullEnable(boolean enable);

    /**
     * 手指松开的回调
     */
    void onRefresh();

  }
