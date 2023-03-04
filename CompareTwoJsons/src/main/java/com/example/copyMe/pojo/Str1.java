
package com.example.copyMe.pojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "employee", "orderDetails" })
@Generated("jsonschema2pojo")
public class Str1 {

	@JsonProperty("employee")
	private Employee employee;
	@JsonProperty("orderDetails")
	private OrderDetails orderDetails;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("employee")
	public Employee getEmployee() {
		return employee;
	}

	@JsonProperty("employee")
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Str1 withEmployee(Employee employee) {
		this.employee = employee;
		return this;
	}

	@JsonProperty("orderDetails")
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	@JsonProperty("orderDetails")
	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Str1 withOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Str1 withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Str1.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("employee");
		sb.append('=');
		sb.append(((this.employee == null) ? "<null>" : this.employee));
		sb.append(',');
		sb.append("orderDetails");
		sb.append('=');
		sb.append(((this.orderDetails == null) ? "<null>" : this.orderDetails));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = ((result * 31) + ((this.orderDetails == null) ? 0 : this.orderDetails.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.employee == null) ? 0 : this.employee.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass())
			return false;
		Str1 rhs = (Str1) obj;
		
		return ((((this.orderDetails == rhs.orderDetails)
				|| ((this.orderDetails != null) && this.orderDetails.equals(rhs.orderDetails)))
				&& ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
						&& this.additionalProperties.equals(rhs.additionalProperties))))
				&& ((this.employee == rhs.employee)
						|| ((this.employee != null) && this.employee.equals(rhs.employee))));
	}

}
