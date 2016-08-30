package org.bk.consumer.ribbon;

import org.bk.consumer.domain.PerPagableResult;
import org.bk.consumer.feign.PersonalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("ribbonDirectPersonalClient")
public class RibbonDirectPersonalClient implements PersonalClient {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

	@Override
	public PerPagableResult getPersonal(String page, String pageSize) {
		String personalServiceUrl = "http://personaldirect/personals?page="+page+"&pageSize="+pageSize+"";
        return this.restTemplate.exchange(personalServiceUrl, HttpMethod.GET, null, PerPagableResult.class).getBody();
	}

}
