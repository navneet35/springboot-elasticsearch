package com.springboot_es.client;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;

/**
 * @author navneet
 * @since 17-Mar-2018
 * @version A singleton class for ElasticSearch High Level Rest Client
 */
public class ElasticSearchRestClient {
	private ElasticSearchRestClient() {};

	private static class RestHighLevelClientHelper {
		private static final RestHighLevelClient CLIENT = new RestHighLevelClient(
				RestClient.builder(
						new HttpHost("localhost", 9200, "http"),
						new HttpHost("localhost", 9201, "http")));
	}

	public static RestHighLevelClient getElasticSearchClientInstance() {
		return RestHighLevelClientHelper.CLIENT;
	}
}
