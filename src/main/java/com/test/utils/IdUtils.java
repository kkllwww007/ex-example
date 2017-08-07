package com.test.utils;

import java.util.UUID;

/**
 * 项目名称：ex-example
 * 包名：com.test.utils
 * 类名称：IdUtils.java
 * 类描述：
 * 创建人：wangxiukun
 * 创建时间：2017/8/4 21:06
 * 修改人：wangxiukun
 * 修改时间：2017/8/4 21:06
 * 修改备注：
 */
public final class IdUtils {

    private IdUtils(){};

    /**
     * UUID主键生成器
     *
     * @return UUID的主键值
     */
    public static String genernalId() {
        return UUID.randomUUID().toString(); // .replaceAll("-", "")
    }
}
