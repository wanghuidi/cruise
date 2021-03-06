package com.huidi.cruise.utils;

import java.util.Random;

/**
 * Created by 廖师兄
 * 2017-06-11 19:12
 */
public class KeyUtils {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     *
     * @return key
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
