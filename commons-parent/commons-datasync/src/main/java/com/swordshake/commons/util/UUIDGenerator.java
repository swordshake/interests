/**
 * 版权所有(C)，那一缕尘心，所有权利保留。
 * 项目名：commons
 * 文件名：UUIDGenerator
 * 模块说明：
 * 修改历史：
 * 2017/8/9 - huangjunxian - 创建
 */
package com.swordshake.commons.util;

import java.util.UUID;

/**
 * UUIDGenerator
 *
 * @author huangjunxian
 */
public class UUIDGenerator {
	/**
	 * 获得一个UUID
	 *
	 * @return String UUID
	 */
	public static String getUUID() {
		String s = UUID.randomUUID().toString();
		return s.replaceAll("-", "");
	}
}
