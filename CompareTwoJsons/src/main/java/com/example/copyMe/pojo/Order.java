
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
@JsonPropertyOrder({ "itemId", "item", "itemDetails" })
@Generated("jsonschema2pojo")
public class Order {

	@JsonProperty("itemId")
	private String itemId;
	@JsonProperty("item")
	private String item;
	@JsonProperty("itemDetails")
	private ItemDetails itemDetails;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("itemId")
	public String getItemId() {
		return itemId;
	}

	@JsonProperty("itemId")
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Order withItemId(String itemId) {
		this.itemId = itemId;
		return this;
	}

	@JsonProperty("item")
	public String getItem() {
		return item;
	}

	@JsonProperty("item")
	public void setItem(String item) {
		this.item = item;
	}

	public Order withItem(String item) {
		this.item = item;
		return this;
	}

	@JsonProperty("itemDetails")
	public ItemDetails getItemDetails() {
		return itemDetails;
	}

	@JsonProperty("itemDetails")
	public void setItemDetails(ItemDetails itemDetails) {
		this.itemDetails = itemDetails;
	}

	public Order withItemDetails(ItemDetails itemDetails) {
		this.itemDetails = itemDetails;
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

	public Order withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Order.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("itemId");
		sb.append('=');
		sb.append(((this.itemId == null) ? "<null>" : this.itemId));
		sb.append(',');
		sb.append("item");
		sb.append('=');
		sb.append(((this.item == null) ? "<null>" : this.item));
		sb.append(',');
		sb.append("itemDetails");
		sb.append('=');
		sb.append(((this.itemDetails == null) ? "<null>" : this.itemDetails));
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
		result = ((result * 31) + ((this.itemId == null) ? 0 : this.itemId.hashCode()));
		result = ((result * 31) + ((this.itemDetails == null) ? 0 : this.itemDetails.hashCode()));
		result = ((result * 31) + ((this.item == null) ? 0 : this.item.hashCode()));
		result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass())
			return false;

		Order rhs = ((Order) obj);
		return (((((this.itemId == rhs.itemId) || ((this.itemId != null) && this.itemId.equals(rhs.itemId)))
				&& ((this.itemDetails == rhs.itemDetails)
						|| ((this.itemDetails != null) && this.itemDetails.equals(rhs.itemDetails))))
				&& ((this.item == rhs.item) || ((this.item != null) && this.item.equals(rhs.item))))
				&& ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null)
						&& this.additionalProperties.equals(rhs.additionalProperties))));
	}

}
