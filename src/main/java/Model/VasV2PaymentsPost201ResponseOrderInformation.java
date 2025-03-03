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
import Model.Ptsv2paymentsidreversalsReversalInformationAmountDetails;
import Model.VasV2PaymentsPost201ResponseOrderInformationLineItems;
import Model.VasV2PaymentsPost201ResponseOrderInformationTaxDetails;
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
 * VasV2PaymentsPost201ResponseOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class VasV2PaymentsPost201ResponseOrderInformation {
  @SerializedName("exemptAmount")
  private String exemptAmount = null;

  @SerializedName("taxableAmount")
  private String taxableAmount = null;

  @SerializedName("taxAmount")
  private String taxAmount = null;

  @SerializedName("lineItems")
  private List<VasV2PaymentsPost201ResponseOrderInformationLineItems> lineItems = null;

  @SerializedName("taxDetails")
  private List<VasV2PaymentsPost201ResponseOrderInformationTaxDetails> taxDetails = null;

  @SerializedName("amountDetails")
  private Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails = null;

  public VasV2PaymentsPost201ResponseOrderInformation exemptAmount(String exemptAmount) {
    this.exemptAmount = exemptAmount;
    return this;
  }

   /**
   * Total amount of tax exempt amounts. This value is the sum of the values for all the &#x60;orderInformation.lineItems[].exemptAmount&#x60; fields in the tax calculation request. 
   * @return exemptAmount
  **/
  @ApiModelProperty(value = "Total amount of tax exempt amounts. This value is the sum of the values for all the `orderInformation.lineItems[].exemptAmount` fields in the tax calculation request. ")
  public String getExemptAmount() {
    return exemptAmount;
  }

  public void setExemptAmount(String exemptAmount) {
    this.exemptAmount = exemptAmount;
  }

  public VasV2PaymentsPost201ResponseOrderInformation taxableAmount(String taxableAmount) {
    this.taxableAmount = taxableAmount;
    return this;
  }

   /**
   * Total amount of all taxable amounts. This value is the sum of the values for all the &#x60;orderInformation.lineItems[].taxAmount&#x60; fields in the tax calculation request. 
   * @return taxableAmount
  **/
  @ApiModelProperty(value = "Total amount of all taxable amounts. This value is the sum of the values for all the `orderInformation.lineItems[].taxAmount` fields in the tax calculation request. ")
  public String getTaxableAmount() {
    return taxableAmount;
  }

  public void setTaxableAmount(String taxableAmount) {
    this.taxableAmount = taxableAmount;
  }

  public VasV2PaymentsPost201ResponseOrderInformation taxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Total amount of tax for all lineItems in the tax calculation request. 
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Total amount of tax for all lineItems in the tax calculation request. ")
  public String getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(String taxAmount) {
    this.taxAmount = taxAmount;
  }

  public VasV2PaymentsPost201ResponseOrderInformation lineItems(List<VasV2PaymentsPost201ResponseOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public VasV2PaymentsPost201ResponseOrderInformation addLineItemsItem(VasV2PaymentsPost201ResponseOrderInformationLineItems lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<VasV2PaymentsPost201ResponseOrderInformationLineItems>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<VasV2PaymentsPost201ResponseOrderInformationLineItems> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<VasV2PaymentsPost201ResponseOrderInformationLineItems> lineItems) {
    this.lineItems = lineItems;
  }

  public VasV2PaymentsPost201ResponseOrderInformation taxDetails(List<VasV2PaymentsPost201ResponseOrderInformationTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
    return this;
  }

  public VasV2PaymentsPost201ResponseOrderInformation addTaxDetailsItem(VasV2PaymentsPost201ResponseOrderInformationTaxDetails taxDetailsItem) {
    if (this.taxDetails == null) {
      this.taxDetails = new ArrayList<VasV2PaymentsPost201ResponseOrderInformationTaxDetails>();
    }
    this.taxDetails.add(taxDetailsItem);
    return this;
  }

   /**
   * Get taxDetails
   * @return taxDetails
  **/
  @ApiModelProperty(value = "")
  public List<VasV2PaymentsPost201ResponseOrderInformationTaxDetails> getTaxDetails() {
    return taxDetails;
  }

  public void setTaxDetails(List<VasV2PaymentsPost201ResponseOrderInformationTaxDetails> taxDetails) {
    this.taxDetails = taxDetails;
  }

  public VasV2PaymentsPost201ResponseOrderInformation amountDetails(Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsReversalInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VasV2PaymentsPost201ResponseOrderInformation vasV2PaymentsPost201ResponseOrderInformation = (VasV2PaymentsPost201ResponseOrderInformation) o;
    return Objects.equals(this.exemptAmount, vasV2PaymentsPost201ResponseOrderInformation.exemptAmount) &&
        Objects.equals(this.taxableAmount, vasV2PaymentsPost201ResponseOrderInformation.taxableAmount) &&
        Objects.equals(this.taxAmount, vasV2PaymentsPost201ResponseOrderInformation.taxAmount) &&
        Objects.equals(this.lineItems, vasV2PaymentsPost201ResponseOrderInformation.lineItems) &&
        Objects.equals(this.taxDetails, vasV2PaymentsPost201ResponseOrderInformation.taxDetails) &&
        Objects.equals(this.amountDetails, vasV2PaymentsPost201ResponseOrderInformation.amountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exemptAmount, taxableAmount, taxAmount, lineItems, taxDetails, amountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VasV2PaymentsPost201ResponseOrderInformation {\n");
    
    sb.append("    exemptAmount: ").append(toIndentedString(exemptAmount)).append("\n");
    sb.append("    taxableAmount: ").append(toIndentedString(taxableAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    taxDetails: ").append(toIndentedString(taxDetails)).append("\n");
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
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

