/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.Riskv1addressverificationsOrderInformationBillTo;
import Model.Riskv1addressverificationsOrderInformationLineItems;
import Model.Riskv1addressverificationsOrderInformationShipTo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Riskv1addressverificationsOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class Riskv1addressverificationsOrderInformation {
  @SerializedName("billTo")
  private Riskv1addressverificationsOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private Riskv1addressverificationsOrderInformationShipTo shipTo = null;

  @SerializedName("lineItems")
  private List<Riskv1addressverificationsOrderInformationLineItems> lineItems = null;

  public Riskv1addressverificationsOrderInformation billTo(Riskv1addressverificationsOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1addressverificationsOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Riskv1addressverificationsOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public Riskv1addressverificationsOrderInformation shipTo(Riskv1addressverificationsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public Riskv1addressverificationsOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(Riskv1addressverificationsOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public Riskv1addressverificationsOrderInformation lineItems(List<Riskv1addressverificationsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Riskv1addressverificationsOrderInformation addLineItemsItem(Riskv1addressverificationsOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<Riskv1addressverificationsOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<Riskv1addressverificationsOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<Riskv1addressverificationsOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Riskv1addressverificationsOrderInformation riskv1addressverificationsOrderInformation = (Riskv1addressverificationsOrderInformation) o;
    return Objects.equals(this.billTo, riskv1addressverificationsOrderInformation.billTo) &&
        Objects.equals(this.shipTo, riskv1addressverificationsOrderInformation.shipTo) &&
        Objects.equals(this.lineItems, riskv1addressverificationsOrderInformation.lineItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billTo, shipTo, lineItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Riskv1addressverificationsOrderInformation {\n");
    
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

