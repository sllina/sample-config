package org.bk.consumer.domain;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 表示修改个人信息请求
 **/
public class Personal {

	private String perID = null;
	private String userID = null;
	private String perName = null;
	private String perSex = null;
	private String phone = null;
	private String email = null;
	private String perbirthDay = null;
	private String perIdeNum = null;
	private String specialPlane = null;
	private String qqNum = null;
	private String weChatNum = null;
	private String professional = null;
	private String education = null;
	private String perHobbies = null;
	private String workExperience = null;
	private String entID = null;
	private String fullFacePhoto = null;
	private String revSidePhoto = null;
	private String createBy = null;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createdAt = null;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifiedAt = null;
	private Integer state = null;
	private Cert certifiedStatus = null;

	/**
	 * 个人信息ID，由后端自动生成，创建个人信息时不需要
	 **/
	@JsonProperty("perID")
	public String getPerID() {
		return perID;
	}

	public void setPerID(String perID) {
		this.perID = perID;
	}

	/**
	 * 姓名
	 **/
	@JsonProperty("perName")
	public String getPerName() {
		return perName;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	/**
	 * 性别
	 **/
	@JsonProperty("perSex")
	public String getPerSex() {
		return perSex;
	}

	public void setPerSex(String perSex) {
		this.perSex = perSex;
	}

	/**
	 * 出生年月
	 **/
	@JsonProperty("perbirthDay")
	public String getPerbirthDay() {
		return perbirthDay;
	}

	public void setPerbirthDay(String perbirthDay) {
		this.perbirthDay = perbirthDay;
	}

	/**
	 * 身份证号
	 **/
	@JsonProperty("perIdeNum")
	public String getPerIdeNum() {
		return perIdeNum;
	}

	public void setPerIdeNum(String perIdeNum) {
		this.perIdeNum = perIdeNum;
	}

	/**
	 * 座机
	 **/
	@JsonProperty("specialPlane")
	public String getSpecialPlane() {
		return specialPlane;
	}

	public void setSpecialPlane(String specialPlane) {
		this.specialPlane = specialPlane;
	}

	/**
	 * 用户编号
	 **/
	@JsonProperty("userID")

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * QQ
	 **/
	@JsonProperty("qqNum")
	public String getQqNum() {
		return qqNum;
	}

	public void setQqNum(String qqNum) {
		this.qqNum = qqNum;
	}

	/**
	 * 微信号
	 **/
	@JsonProperty("weChatNum")
	public String getWeChatNum() {
		return weChatNum;
	}

	public void setWeChatNum(String weChatNum) {
		this.weChatNum = weChatNum;
	}

	/**
	 * 专业
	 **/
	@JsonProperty("professional")
	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	/**
	 * 学历
	 **/
	@JsonProperty("education")
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * 个人爱好
	 **/
	@JsonProperty("perHobbies")
	public String getPerHobbies() {
		return perHobbies;
	}

	public void setPerHobbies(String perHobbies) {
		this.perHobbies = perHobbies;
	}

	/**
	 * 工作经历
	 **/
	@JsonProperty("workExperience")
	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	/**
	 * 公司ID
	 **/
	@JsonProperty("entID")
	public String getEntID() {
		return entID;
	}

	public void setEntID(String entID) {
		this.entID = entID;
	}

	/**
	 * 手持身份证正面照片
	 **/
	@JsonProperty("fullFacePhoto")
	public String getFullFacePhoto() {
		return fullFacePhoto;
	}

	public void setFullFacePhoto(String fullFacePhoto) {
		this.fullFacePhoto = fullFacePhoto;
	}

	/**
	 * 手持身份证反面照片
	 **/
	@JsonProperty("revSidePhoto")
	public String getRevSidePhoto() {
		return revSidePhoto;
	}

	public void setRevSidePhoto(String revSidePhoto) {
		this.revSidePhoto = revSidePhoto;
	}

	/**
	 * 创建者
	 **/
	@JsonProperty("createBy")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	/**
	 * 创建时间
	 **/
	@JsonProperty("createdAt")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 修改时间
	 **/
	@JsonProperty("modifiedAt")
	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	/**
	 * 状态
	 **/
	@JsonProperty("state")
	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 企业认证状态
	 **/
	@JsonProperty("certifiedStatus")
	public Cert getCertifiedStatus() {
		return certifiedStatus;
	}

	public void setCertifiedStatus(Cert certifiedStatus) {
		this.certifiedStatus = certifiedStatus;
	}

	/**
	 * 联系电话
	 **/
	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * 邮箱
	 **/
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Personal createUpdatePersonalRequest = (Personal) o;
		return Objects.equals(perID, createUpdatePersonalRequest.perID)
				&& Objects.equals(perName, createUpdatePersonalRequest.perName)
				&& Objects.equals(perSex, createUpdatePersonalRequest.perSex)
				&& Objects.equals(perbirthDay, createUpdatePersonalRequest.perbirthDay)
				&& Objects.equals(perIdeNum, createUpdatePersonalRequest.perIdeNum)
				&& Objects.equals(specialPlane, createUpdatePersonalRequest.specialPlane)
				&& Objects.equals(userID, createUpdatePersonalRequest.userID)
				&& Objects.equals(phone, createUpdatePersonalRequest.phone)
				&& Objects.equals(email, createUpdatePersonalRequest.email)
				&& Objects.equals(qqNum, createUpdatePersonalRequest.qqNum)
				&& Objects.equals(weChatNum, createUpdatePersonalRequest.weChatNum)
				&& Objects.equals(professional, createUpdatePersonalRequest.professional)
				&& Objects.equals(education, createUpdatePersonalRequest.education)
				&& Objects.equals(perHobbies, createUpdatePersonalRequest.perHobbies)
				&& Objects.equals(workExperience, createUpdatePersonalRequest.workExperience)
				&& Objects.equals(entID, createUpdatePersonalRequest.entID)
				&& Objects.equals(fullFacePhoto, createUpdatePersonalRequest.fullFacePhoto)
				&& Objects.equals(revSidePhoto, createUpdatePersonalRequest.revSidePhoto)
				&& Objects.equals(createBy, createUpdatePersonalRequest.createBy)
				&& Objects.equals(createdAt, createUpdatePersonalRequest.createdAt)
				&& Objects.equals(modifiedAt, createUpdatePersonalRequest.modifiedAt)
				&& Objects.equals(state, createUpdatePersonalRequest.state)
				&& Objects.equals(certifiedStatus, createUpdatePersonalRequest.certifiedStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(perName, perSex, perbirthDay, perIdeNum, specialPlane, perID, qqNum, userID, weChatNum,
				professional, education, perHobbies, workExperience, entID, fullFacePhoto, revSidePhoto, createBy,
				createdAt, modifiedAt, state, certifiedStatus, phone, email);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Personal {\n");

		sb.append("  perID: ").append(perID).append("\n");
		sb.append("  perName: ").append(perName).append("\n");
		sb.append("  perSex: ").append(perSex).append("\n");
		sb.append("  perbirthDay: ").append(perbirthDay).append("\n");
		sb.append("  perIdeNum: ").append(perIdeNum).append("\n");
		sb.append("  specialPlane: ").append(specialPlane).append("\n");
		sb.append("  userID: ").append(userID).append("\n");
		sb.append("  phone: ").append(phone).append("\n");
		sb.append("  email: ").append(email).append("\n");
		sb.append("  qqNum: ").append(qqNum).append("\n");
		sb.append("  weChatNum: ").append(weChatNum).append("\n");
		sb.append("  professional: ").append(professional).append("\n");
		sb.append("  education: ").append(education).append("\n");
		sb.append("  perHobbies: ").append(perHobbies).append("\n");
		sb.append("  workExperience: ").append(workExperience).append("\n");
		sb.append("  entID: ").append(entID).append("\n");
		sb.append("  fullFacePhoto: ").append(fullFacePhoto).append("\n");
		sb.append("  revSidePhoto: ").append(revSidePhoto).append("\n");
		sb.append(" createBy: ").append(createBy).append("\n");
		sb.append("  createdAt: ").append(createdAt).append("\n");
		sb.append("  modifiedAt: ").append(modifiedAt).append("\n");
		sb.append("  state: ").append(state).append("\n");
		sb.append(" certifiedStatus: ").append(certifiedStatus).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
