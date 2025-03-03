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
import Model.PtsV2PayoutsPost201ResponseOrderInformationAmountDetails;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PtsV2PayoutsPost201ResponseOrderInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class PtsV2PayoutsPost201ResponseOrderInformation {
  @SerializedName("amountDetails")
  private PtsV2PayoutsPost201ResponseOrderInformationAmountDetails amountDetails = null;

  public PtsV2PayoutsPost201ResponseOrderInformation amountDetails(PtsV2PayoutsPost201ResponseOrderInformationAmountDetails amountDetails) {
    this.amountDetails = amountDetails;
    return this;
  }

   /**
   * Get amountDetails
   * @return amountDetails
  **/
  @ApiModelProperty(value = "")
  public PtsV2PayoutsPost201ResponseOrderInformationAmountDetails getAmountDetails() {
    return amountDetails;
  }

  public void setAmountDetails(PtsV2PayoutsPost201ResponseOrderInformationAmountDetails amountDetails) {
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
    PtsV2PayoutsPost201ResponseOrderInformation ptsV2PayoutsPost201ResponseOrderInformation = (PtsV2PayoutsPost201ResponseOrderInformation) o;
    return Objects.equals(this.amountDetails, ptsV2PayoutsPost201ResponseOrderInformation.amountDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PtsV2PayoutsPost201ResponseOrderInformation {\n");
    
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

