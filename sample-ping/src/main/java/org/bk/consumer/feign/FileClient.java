package org.bk.consumer.feign;

import org.bk.consumer.domain.FileInfo;
import org.bk.consumer.domain.PerPagableResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@FeignClient("filepath")
public interface FileClient {
	
	@RequestMapping(method = RequestMethod.POST, value = "/files",
            produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	FileInfo getFile(@RequestParam(value = "createBy", required = true) String createBy,
			@RequestParam(value = "fileType", required = false) String fileType,
			@RequestParam(value = "fileDesc", required = false) String fileDesc,
			@RequestParam(value = "file", required = false) MultipartFile file);
	
	
}
