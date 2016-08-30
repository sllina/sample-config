package org.bk.consumer.feign;

import org.bk.consumer.domain.PerPagableResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("personalte")
public interface PersonalClient {
	
	@RequestMapping(method = RequestMethod.GET, value = "/personals",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	PerPagableResult getPersonal(@RequestParam(value="page", required=true) String page,
			@RequestParam(value="pageSize", required=true) String pageSize);
	
}
