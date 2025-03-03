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
import Model.TssV2TransactionsPost201ResponseEmbeddedOrderInformationBillTo;
import Model.TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsPost201ResponseEmbeddedOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class TssV2TransactionsPost201ResponseEmbeddedOrderInformation {
  @SerializedName("billTo")
  private TssV2TransactionsPost201ResponseEmbeddedOrderInformationBillTo billTo = null;

  @SerializedName("shipTo")
  private TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo shipTo = null;

  @SerializedName("amountDetails")
  private Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails = null;

  public TssV2TransactionsPost201ResponseEmbeddedOrderInformation billTo(TssV2TransactionsPost201ResponseEmbeddedOrderInformationBillTo billTo) {
    this.billTo = billTo;
    return this;
  }

   /**
   * Get billTo
   * @return billTo
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedOrderInformationBillTo getBillTo() {
    return billTo;
  }

  public void setBillTo(TssV2TransactionsPost201ResponseEmbeddedOrderInformationBillTo billTo) {
    this.billTo = billTo;
  }

  public TssV2TransactionsPost201ResponseEmbeddedOrderInformation shipTo(TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @ApiModelProperty(value = "")
  public TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo getShipTo() {
    return shipTo;
  }

  public void setShipTo(TssV2TransactionsPost201ResponseEmbeddedOrderInformationShipTo shipTo) {
    this.shipTo = shipTo;
  }

  public TssV2TransactionsPost201ResponseEmbeddedOrderInformation amountDetails(Ptsv2paymentsidreversalsReversalInformationAmountDetails amountDetails) {
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
    TssV2TransactionsPost201ResponseEmbeddedOrderInformation tssV2TransactionsPost201ResponseEmbeddedOrderInformation = (TssV2TransactionsPost201ResponseEmbeddedOrderInformation) o;
    return Objects.equals(this.billTo, tssV2TransactionsPost201ResponseEmbeddedOrderInformation.billTo) &&
        Objects.equals(this.shipTo, tssV2TransactionsPost201ResponseEmbeddedOrderInformation.shipTo) &&
        Objects.equals(this.amountDetails, tssV2TransactionsPost201ResponseEmbeddedOrderInformation.amountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billTo, shipTo, amountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsPost201ResponseEmbeddedOrderInformation {\n");
    
    sb.append("    billTo: ").append(toIndentedString(billTo)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
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

