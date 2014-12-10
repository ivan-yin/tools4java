package com.ifzer.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/**
 *
 * ClassName: HttpClientUtils <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * date: Dec 10, 2014 2:32:53 PM <br/>
 *
 * @author ybs
 * @Email 020lilin@gmail.com
 * @since JDK 1.6
 */
public class HttpClientUtils {

	/**
	 * logger
	 */
	private static final Logger LOGGER = LoggerFactory
			.getLogger(HttpClientUtils.class);

	public static String post(String url) {
		Preconditions.checkArgument(!Strings.isNullOrEmpty(url),
				"url can't be null");
		CloseableHttpClient client = HttpClientBuilder.create().build();
		LOGGER.info(" url = {}", url);

		HttpPost request = new HttpPost(url);
		// HttpGet request = new HttpGet(url);

		StringBuffer result = new StringBuffer();
		try {
			HttpResponse response = client.execute(request);

			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}

		} catch (IOException e) {
			LOGGER.error("exception", e);
		} finally {
			try {
				client.close();
			} catch (IOException e) {
				LOGGER.error("close exception", e);
			}
		}
		return result.toString();
	}

}
