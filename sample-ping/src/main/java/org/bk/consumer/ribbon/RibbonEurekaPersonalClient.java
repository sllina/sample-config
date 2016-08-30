package org.bk.consumer.ribbon;

import org.bk.consumer.domain.PerPagableResult;
import org.bk.consumer.feign.PersonalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("ribbonPersonalClient")
public class RibbonEurekaPersonalClient implements PersonalClient {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

	@Override
	public PerPagableResult getPersonal(String page, String pageSize) {
        return this.restTemplate.exchange("http://personalte/personals?page="+page+"&pageSize="+pageSize+"", HttpMethod.GET,null,PerPagableResult.class).getBody();
	}

}
