package org.bk.consumer.controller;

import javax.servlet.http.HttpServletRequest;

import org.bk.consumer.domain.FileInfo;
import org.bk.consumer.domain.Message;
import org.bk.consumer.domain.MessageAcknowledgement;
import org.bk.consumer.domain.PerPagableResult;
import org.bk.consumer.feign.FileClient;
import org.bk.consumer.feign.PersonalClient;
import org.bk.consumer.feign.PongClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class PingController {

    @Autowired
    @Qualifier("ribbonPongClient")
    private PongClient pongClient;
    
    
    @Autowired
    @Qualifier("ribbonPersonalClient")
    private PersonalClient personalClient;
    
    @Autowired
    private FileClient fileClient;

    @RequestMapping("/dispatch")
    public MessageAcknowledgement sendMessage(@RequestBody Message message) {
        return this.pongClient.sendMessage(message);
    }
    
    @RequestMapping("/personals")
    public PerPagableResult getPersonal(HttpServletRequest request, @RequestParam("page")String page,@RequestParam("pageSize") String pageSize) {
    	page = request.getParameter("page");
    	pageSize = request.getParameter("pageSize");
    	
    	PerPagableResult per = personalClient.getPersonal(page, pageSize);
    	
    	return per;
    }
    
    
    @RequestMapping("/file")
    public FileInfo uploadFile(HttpServletRequest request, @RequestPart("createBy")String createBy,@RequestPart("fileType") String fileType,
    		@RequestPart("fileDesc") String fileDesc,@RequestPart("file") MultipartFile file) {
    	
    	FileInfo per = fileClient.getFile(createBy, fileType, fileDesc, file);
    	
    	return per;
    }
    
    
    
    
}
