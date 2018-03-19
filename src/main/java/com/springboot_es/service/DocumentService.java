package com.springboot_es.service;

import java.io.IOException;

import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.stereotype.Service;

import com.springboot_es.client.ElasticSearchRestClient;


/**
 * @author navneet
 * @since 18-Mar-2018
 * @version
 */
@Service
public class DocumentService {
	private RestHighLevelClient client = ElasticSearchRestClient.getElasticSearchClientInstance();
	
	public GetResponse getDocument(String index, String type, String id) throws IOException {
		GetRequest request = new GetRequest(index, type, id);
		GetResponse response = client.get(request);
		return response;
	}
}
