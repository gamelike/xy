package com.xinyuan.train.common;

import java.util.LinkedHashMap;
import java.util.Map;

public class Constants_train {
    //性别：0.男 1.女
    public final static int GG_RY_XB_M = 0;
    public final static int GG_RY_XB_F = 1;

    public static Map<Integer, String> GG_RY_XB_MAP = new LinkedHashMap<Integer, String>();

    static {
        GG_RY_XB_MAP.put(GG_RY_XB_M, "男");
        GG_RY_XB_MAP.put(GG_RY_XB_F, "女");
    }

}
