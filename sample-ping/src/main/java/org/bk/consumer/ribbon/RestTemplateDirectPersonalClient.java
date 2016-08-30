package org.bk.consumer.ribbon;

import org.bk.consumer.domain.PerPagableResult;
import org.bk.consumer.feign.PersonalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

@Service("restTemplateDirectPersonalClient")
public class RestTemplateDirectPersonalClient implements PersonalClient {

    private final RestOperations restTemplate;

    @Autowired
    public RestTemplateDirectPersonalClient(@Qualifier("nonLoadbalancedRestTemplate") RestOperations restTemplate) {
        this.restTemplate = restTemplate;
    }

	@Override
	public PerPagableResult getPersonal(String page, String pageSize) {
		String personalServiceUrl = "http://localhost:8087/personals?page="+page+"&pageSize="+pageSize+"";
        return this.restTemplate.exchange(personalServiceUrl, HttpMethod.GET, null, PerPagableResult.class).getBody();
	}

}
