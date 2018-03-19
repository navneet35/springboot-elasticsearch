package com.springboot_es.controller;

import java.io.IOException;

import org.elasticsearch.action.get.GetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_es.service.DocumentService;


/**
 * @author navneet
 * @since 17-Mar-2018
 * @version
 */
@RestController
@RequestMapping("/document")
public class DocumentController {
	
	@Autowired
	private DocumentService documentService;
	
	@ResponseBody
	@RequestMapping(value = "/{index}/{type}/{id}", method = RequestMethod.GET)
	public GetResponse getDocument(@PathVariable("index") String index, @PathVariable("type") String type, @PathVariable("id") String id) throws IOException {
		return documentService.getDocument(index, type, id);
	}
}
