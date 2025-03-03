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
import Model.Ptsv2payoutsOrderInformationAmountDetails;
import Model.Ptsv2payoutsOrderInformationBillTo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ptsv2payoutsOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class Ptsv2payoutsOrderInformation {
  @SerializedName("amountDetails")
  private Ptsv2payoutsOrderInformationAmountDetails amountDetails = null;

  @SerializedName("billTo")
  private Ptsv2payoutsOrderInformationBillTo billTo = null;

  public Ptsv2payoutsOrderInformation amountDetails(Ptsv2payoutsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(Ptsv2payoutsOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
  }

  public Ptsv2payoutsOrderInformation billTo(Ptsv2payoutsOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public Ptsv2payoutsOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(Ptsv2payoutsOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2payoutsOrderInformation ptsv2payoutsOrderInformation = (Ptsv2payoutsOrderInformation) o;
    return Objects.equals(this.amountDetails, ptsv2payoutsOrderInformation.amountDetails) &&
        Objects.equals(this.billTo, ptsv2payoutsOrderInformation.billTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails, billTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2payoutsOrderInformation {\n");
    
    sb.append("    amountDetails: ").append(toIndentedString(amountDetails)).append("\n");
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
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

