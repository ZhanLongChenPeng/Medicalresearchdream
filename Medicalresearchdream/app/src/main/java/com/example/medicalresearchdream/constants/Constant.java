package com.example.medicalresearchdream.constants;


import com.example.medicalresearchdream.apps.MyApp;

import java.io.File;

public class Constant {

    public static final String Base_Url = "https://cdwan.cn/api/";

    public static final String Base_apk_url = "http://yun918.cn/study/public/";

    public static final String Base_Wan_url = "https://www.wanandroid.com/";



    //网络缓存的地址
    public static final String PATH_DATA = MyApp.myApp.getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/ShiXun";


    public static final String KEY_API = "52b7ec3471ac3bec6846577e79f20e4c"; //需要APIKEY请去 http://www.tianapi.com/#wxnew 申请,复用会减少访问可用次数
    public static final int CLICK_TIME = 2000;


    public static int uid;

    public static final String ZHIHU_DETAIL_ID = "zhihu_detail_id"; //知乎数据id

    public static final String ZHIHU_COMMENT_ID = "zhihu_comment_id";

    public static final String ZHIHU_COMMENT_ALL_NUM = "zhihu_comment_all_num";

    public static final String ZHIHU_COMMENT_SHORT_NUM = "zhihu_comment_short_num";

    public static final String ZHIHU_COMMENT_LONG_NUM = "zhihu_comment_long_num";


    public static final String GANK_TECH_ANDROID = "Android";
    public static final String GANK_TECH_IOS = "IOS";
    public static final String GANK_TECH_WEB = "前端";
    public static final String GANK_TECH_GIRL = "福利";

    public static final String IT_VTEX_TYPE = "vtex_type";
    public static final String IT_VTEX_TOPIC_ID = "vtex_id";
    public static final String IT_VTEX_NODE_NAME = "vtex_node_name";

}
