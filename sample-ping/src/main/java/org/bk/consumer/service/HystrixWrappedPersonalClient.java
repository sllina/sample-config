package org.bk.consumer.service;

import org.bk.consumer.domain.ErrorInfo;
import org.bk.consumer.domain.PerPagableResult;
import org.bk.consumer.feign.PersonalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service("hystrixPersonalClient")
public class HystrixWrappedPersonalClient implements PersonalClient {

    @Autowired
    @Qualifier("personalClient")
    private PersonalClient feignPersonalClient;

    @Override
    @HystrixCommand(groupKey = "personalGroup", fallbackMethod = "fallBackCallPersonal")
    public PerPagableResult getPersonal(String page, String pageSize) {
    	return this.feignPersonalClient.getPersonal(page, pageSize);
    }

    public ErrorInfo fallBackCallPersonal(String page,String pageSize) {
    	ErrorInfo fallback = new ErrorInfo(page, pageSize, "FAILED SERVICE CALL! - FALLING BACK");
        return fallback;
    }

}
