/**
 * Project Name:tools4java
 * File Name:HttpClientUtilsTest.java <p>function description: </p>
 * Package Name:com.ifzer.utils
 * Date:Dec 10, 20142:51:00 PM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * ClassName:HttpClientUtilsTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: Dec 10, 2014 2:51:00 PM <br/>
 *
 * @author ybs Email 020lilin@gmail.com
 * @version 1.0
 * @since JDK 1.6
 * @see
 */
public class HttpClientUtilsTest {

	@Test
	public void testGet() {
		Assert.assertNotNull(HttpClientUtils.post("http://www.baidu.com"));
	}

}
