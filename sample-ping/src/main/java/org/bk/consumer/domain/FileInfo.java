package org.bk.consumer.domain;

import java.util.Date;
import java.util.Objects;

import org.bk.until.MathUtils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

//将该标记放在属性上，如果该属性为NULL则不参与序列化  
//如果放在类上边,那对这个类的全部属性起作用  
//Include.Include.ALWAYS 默认  
//Include.NON_DEFAULT 属性为默认值不序列化  
//Include.NON_EMPTY 属性为 空（“”）  或者为 NULL 都不序列化  
//Include.NON_NULL 属性为NULL 不序列化  
@JsonInclude(Include.NON_EMPTY)
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-30T10:41:37.660Z")
public class FileInfo {

	private Long id;

	private String fileName = null;
	private String oldFileName = null; // 文件上传前文件名
	// @Column(updatable=false)
	// private String filePath = null; //文件在服务器端存放路径
	private String fileType = null; // 文件类型
	/*
	 * @ColumnDefault(value = "0")
	 * 
	 * @Column(nullable=false)
	 */

	private String state = "0";
	private String createBy = null;
	private Date createDate = null;
	private String lastUpdateBy = null;
	private Date lastUpdateDate = null;
	private String fileDesc = null; // 文件描述信息
	// @Column(updatable=false)
	private Double fileSize = null;
	// @Transient
	// private String fileURL = null;
	private String contentType = null;
	private String md5 = null;

	public FileInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 文件id
	 **/
	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 文件在服务器端的文件名
	 **/
	@JsonProperty("fileName")

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * 文件在上传前的文件名
	 **/
	public String getOldFileName() {
		return oldFileName;
	}

	public void setOldFileName(String oldFileName) {
		this.oldFileName = oldFileName;
	}

	/**
	 * 文件在服务器端的目录
	 **/
	/*
	 * @ApiModelProperty(value = "文件在服务器端的目录") public String getFilePath() {
	 * return filePath; }
	 * 
	 * 
	 * public void setFilePath(String filePath) { this.filePath = filePath; }
	 */

	/**
	 * 文件类型
	 **/
	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	/**
	 * 文件描述信息
	 **/
	public String getFileDesc() {
		return fileDesc;
	}

	public void setFileDesc(String fileDesc) {
		this.fileDesc = fileDesc;
	}

	/**
	 * 产品状态，‘0’表示有效，‘1’表示作废
	 **/
	@JsonProperty("state")
	// @Column(nullable=false,columnDefinition="varchar(255) default '0'")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 文件上传人
	 **/
	@JsonProperty("createBy")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	/**
	 * 上传时间
	 **/
	@JsonProperty("createDate")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@JsonProperty("fileSize")
	// @Column(columnDefinition="varchar(20,2)")
	public Double getFileSize() {
		return fileSize;
	}

	// @Column(columnDefinition="varchar(20,2)")
	public void setFileSize(Double fileSize) {

		this.fileSize = Double.parseDouble(MathUtils.getTwoDeciFormat().format(fileSize));
	}

	/**
	 * 文件在服务器端的路径
	 **/
	// @ApiModelProperty(value = "文件在服务器端的路径")
	/*
	 * public String getFileURL() { return this.filePath +"/" +this.fileName; }
	 * 
	 * 
	 * public void setFileURL() { this.fileURL = this.filePath +"/"
	 * +this.fileName; }
	 */

	/**
	 * 文件的contentType
	 **/
	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * 文件的最后一次的修改人
	 **/
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	/**
	 * 文件的最后一次修改时间
	 **/
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * 文件的MD5值
	 **/
	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FileInfo fileInfo = (FileInfo) o;
		return Objects.equals(id, fileInfo.id) && Objects.equals(fileName, fileInfo.fileName)
				&& Objects.equals(oldFileName, fileInfo.oldFileName) && Objects.equals(fileType, fileInfo.fileType) &&
				// Objects.equals(filePath, fileInfo.filePath) &&
				Objects.equals(state, fileInfo.state) && Objects.equals(createBy, fileInfo.createBy)
				&& Objects.equals(createDate, fileInfo.createDate) && Objects.equals(fileDesc, fileInfo.fileDesc)
				&& Objects.equals(fileSize, fileInfo.fileSize) &&
				// Objects.equals(fileURL, fileInfo.fileURL)&&
				Objects.equals(contentType, fileInfo.contentType) && Objects.equals(lastUpdateBy, fileInfo.lastUpdateBy)
				&& Objects.equals(lastUpdateDate, fileInfo.lastUpdateDate) && Objects.equals(md5, fileInfo.md5);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, fileName, oldFileName, fileType, state, createBy, createDate, fileDesc, fileSize,
				contentType, lastUpdateBy, md5);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FileInfo {\n");
		sb.append("  id: ").append(id).append("\n");
		sb.append("  fileName: ").append(fileName).append("\n");
		sb.append("  oldFileName: ").append(oldFileName).append("\n");
		sb.append("  fileType: ").append(fileType).append("\n");
		// sb.append(" filePath: ").append(filePath).append("\n");
		sb.append("  state: ").append(state).append("\n");
		sb.append("  createBy: ").append(createBy).append("\n");
		sb.append("  createDate: ").append(createDate).append("\n");
		sb.append("  fileDesc: ").append(fileDesc).append("\n");
		sb.append("  fileSize: ").append(fileSize).append("\n");
		// sb.append(" fileURL: ").append(fileURL).append("\n");
		sb.append("  contentType: ").append(contentType).append("\n");
		sb.append("  lastUpdateBy: ").append(lastUpdateBy).append("\n");
		sb.append("  lastUpdateDate: ").append(lastUpdateDate).append("\n");
		sb.append("  md5: ").append(md5).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
