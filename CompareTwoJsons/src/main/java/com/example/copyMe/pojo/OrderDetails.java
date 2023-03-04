
package com.example.copyMe.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "orderId", "DeliveryAddress", "orders" })
@Generated("jsonschema2pojo")
public class OrderDetails {

	@JsonProperty("orderId")
	private String orderId;
	@JsonProperty("DeliveryAddress")
	private String deliveryAddress;
	@JsonProperty("orders")
	private List<Order> orders = new ArrayList<Order>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("orderId")
	public String getOrderId() {
		return orderId;
	}

	@JsonProperty("orderId")
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public OrderDetails withOrderId(String orderId) {
		this.orderId = orderId;
		return this;
	}

	@JsonProperty("DeliveryAddress")
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	@JsonProperty("DeliveryAddress")
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public OrderDetails withDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
		return this;
	}

	@JsonProperty("orders")
	public List<Order> getOrders() {
		return orders;
	}

	@JsonProperty("orders")
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public OrderDetails withOrders(List<Order> orders) {
		this.orders = orders;
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

	public OrderDetails withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(OrderDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("orderId");
		sb.append('=');
		sb.append(((this.orderId == null) ? "<null>" : this.orderId));
		sb.append(',');
		sb.append("deliveryAddress");
		sb.append('=');
		sb.append(((this.deliveryAddress == null) ? "<null>" : this.deliveryAddress));
		sb.append(',');
		sb.append("orders");
		sb.append('=');
		sb.append(((this.orders == null) ? "<null>" : this.orders));
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
		result = ((result * 31) + ((this.orders == null) ? 0 : this.orders.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		result = ((result * 31) + ((this.orderId == null) ? 0 : this.orderId.hashCode()));
		result = ((result * 31) + ((this.deliveryAddress == null) ? 0 : this.deliveryAddress.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass())
			return false;
		OrderDetails rhs = ((OrderDetails) obj);
		return (((((this.orders == rhs.orders) || ((this.orders != null) && this.orders.equals(rhs.orders)))
				&& ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
						&& this.additionalProperties.equals(rhs.additionalProperties))))
				&& ((this.orderId == rhs.orderId) || ((this.orderId != null) && this.orderId.equals(rhs.orderId))))
				&& ((this.deliveryAddress == rhs.deliveryAddress)
						|| ((this.deliveryAddress != null) && this.deliveryAddress.equals(rhs.deliveryAddress))));
	}

}
