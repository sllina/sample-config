package org.bk.consumer.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-07-19T11:58:20.218Z")
public class PerPagableResult {

	private Long totalPages = null;
	private Long totalElements = null;
	private List<Personal> personal = new ArrayList<Personal>();

	@JsonProperty("totalPages")
	public Long getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}

	@JsonProperty("totalElements")
	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	@JsonProperty("personal")
	public List<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Personal> personal) {
		this.personal = personal;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PerPagableResult perPagableResult = (PerPagableResult) o;
		return Objects.equals(totalPages, perPagableResult.totalPages)
				&& Objects.equals(totalElements, perPagableResult.totalElements)
				&& Objects.equals(personal, perPagableResult.personal);
	}

	@Override
	public int hashCode() {
		return Objects.hash(totalPages, totalElements, personal);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PerPagableResult {\n");

		sb.append("  totalPages: ").append(totalPages).append("\n");
		sb.append("  totalElements: ").append(totalElements).append("\n");
		sb.append("  personal: ").append(personal).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}
