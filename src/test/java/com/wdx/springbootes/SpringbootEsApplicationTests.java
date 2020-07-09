package com.wdx.springbootes;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootEsApplicationTests {

	@Autowired
	private ElasticsearchRestTemplate elasticsearchTemplate;

	@Autowired
	private ElasticsearchRepository repository;
	@Test
	void contextLoads() {
		elasticsearchTemplate.createIndex(Item.class);
		elasticsearchTemplate.putMapping(Item.class);
	}

	@Test
	 void aa() {
		Iterable<Item> all = repository.findAll();
    	all.forEach(i -> System.out.println(i));
	}


}
