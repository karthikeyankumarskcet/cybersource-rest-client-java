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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2paymentsTravelInformationAutoRentalTaxDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class Ptsv2paymentsTravelInformationAutoRentalTaxDetails {
  @SerializedName("amount")
  private String amount = null;

  @SerializedName("rate")
  private String rate = null;

  @SerializedName("applied")
  private Boolean applied = null;

  @SerializedName("exemptionCode")
  private String exemptionCode = null;

  @SerializedName("taxType")
  private String taxType = null;

  @SerializedName("taxSummary")
  private String taxSummary = null;

  public Ptsv2paymentsTravelInformationAutoRentalTaxDetails amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Indicates the amount of tax based on the &#x60;type&#x60; field as described in the table below: 
   * @return amount
  **/
  @ApiModelProperty(value = "Indicates the amount of tax based on the `type` field as described in the table below: ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Ptsv2paymentsTravelInformationAutoRentalTaxDetails rate(String rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Rate of VAT or other tax for the order.  Example 0.040 (&#x3D;4%)  Valid range: 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated) 
   * @return rate
  **/
  @ApiModelProperty(value = "Rate of VAT or other tax for the order.  Example 0.040 (=4%)  Valid range: 0.01 to 0.99 (1% to 99%, with only whole percentage values accepted; values with additional decimal places will be truncated) ")
  public String getRate() {
    return rate;
  }

  public void setRate(String rate) {
    this.rate = rate;
  }

  public Ptsv2paymentsTravelInformationAutoRentalTaxDetails applied(Boolean applied) {
    this.applied = applied;
    return this;
  }

   /**
   * Flag that indicates whether the tax amount (&#x60;travelInformation.autoRental.taxDetails.amount&#x60;) is included in the request.  Possible values: - &#x60;false&#x60;: tax amount is not included in the request. - &#x60;true&#x60;:  tax amount is included in the request. 
   * @return applied
  **/
  @ApiModelProperty(value = "Flag that indicates whether the tax amount (`travelInformation.autoRental.taxDetails.amount`) is included in the request.  Possible values: - `false`: tax amount is not included in the request. - `true`:  tax amount is included in the request. ")
  public Boolean getApplied() {
    return applied;
  }

  public void setApplied(Boolean applied) {
    this.applied = applied;
  }

  public Ptsv2paymentsTravelInformationAutoRentalTaxDetails exemptionCode(String exemptionCode) {
    this.exemptionCode = exemptionCode;
    return this;
  }

   /**
   * Status code for exemption from sales and use tax. This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. 
   * @return exemptionCode
  **/
  @ApiModelProperty(value = "Status code for exemption from sales and use tax. This field is a pass-through, which means that CyberSource does not verify the value or modify it in any way before sending it to the processor. ")
  public String getExemptionCode() {
    return exemptionCode;
  }

  public void setExemptionCode(String exemptionCode) {
    this.exemptionCode = exemptionCode;
  }

  public Ptsv2paymentsTravelInformationAutoRentalTaxDetails taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

   /**
   * Different taxes the rental agency applies to the rental agreement such as tourist tax, airport tax, or rental tax. 
   * @return taxType
  **/
  @ApiModelProperty(value = "Different taxes the rental agency applies to the rental agreement such as tourist tax, airport tax, or rental tax. ")
  public String getTaxType() {
    return taxType;
  }

  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  public Ptsv2paymentsTravelInformationAutoRentalTaxDetails taxSummary(String taxSummary) {
    this.taxSummary = taxSummary;
    return this;
  }

   /**
   * Summary of all tax types 
   * @return taxSummary
  **/
  @ApiModelProperty(value = "Summary of all tax types ")
  public String getTaxSummary() {
    return taxSummary;
  }

  public void setTaxSummary(String taxSummary) {
    this.taxSummary = taxSummary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsTravelInformationAutoRentalTaxDetails ptsv2paymentsTravelInformationAutoRentalTaxDetails = (Ptsv2paymentsTravelInformationAutoRentalTaxDetails) o;
    return Objects.equals(this.amount, ptsv2paymentsTravelInformationAutoRentalTaxDetails.amount) &&
        Objects.equals(this.rate, ptsv2paymentsTravelInformationAutoRentalTaxDetails.rate) &&
        Objects.equals(this.applied, ptsv2paymentsTravelInformationAutoRentalTaxDetails.applied) &&
        Objects.equals(this.exemptionCode, ptsv2paymentsTravelInformationAutoRentalTaxDetails.exemptionCode) &&
        Objects.equals(this.taxType, ptsv2paymentsTravelInformationAutoRentalTaxDetails.taxType) &&
        Objects.equals(this.taxSummary, ptsv2paymentsTravelInformationAutoRentalTaxDetails.taxSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, rate, applied, exemptionCode, taxType, taxSummary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsTravelInformationAutoRentalTaxDetails {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    applied: ").append(toIndentedString(applied)).append("\n");
    sb.append("    exemptionCode: ").append(toIndentedString(exemptionCode)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxSummary: ").append(toIndentedString(taxSummary)).append("\n");
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

