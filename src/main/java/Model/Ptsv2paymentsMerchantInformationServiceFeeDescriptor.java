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
 * Ptsv2paymentsMerchantInformationServiceFeeDescriptor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class Ptsv2paymentsMerchantInformationServiceFeeDescriptor {
  @SerializedName("name")
  private String name = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("state")
  private String state = null;

  public Ptsv2paymentsMerchantInformationServiceFeeDescriptor name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the service provider that is collecting the service fee. The service provider name must consist of 3, 7, or 12 characters followed by an asterisk (*). This value must also include the words “Service Fee.”  When you include more than one consecutive space, extra spaces are removed. Use one of the following formats for this value: - &lt;3-character name&gt;*Service Fee - &lt;7-character name&gt;*Service Fee - &lt;12-character name&gt;*Service Fee  When payments are made in installments, this value must also include installment information such as “1 of 5” or “3 of 7.” For installment payments, use one of the following formats for this value: - &lt;3-character name&gt;*Service Fee*&lt;N&gt; of &lt;M&gt; - &lt;7-character name&gt;*Service Fee*&lt;N&gt; of &lt;M&gt; - &lt;12-character name&gt;*Service Fee*&lt;N&gt; of &lt;M&gt;  where &lt;N&gt; is the payment number and &lt;M&gt; is the total number of payments.  When you do not include this value in your request, CyberSource uses the value that is in your CyberSource account.  This value might be displayed on the cardholder’s statement. 
   * @return name
  **/
  @ApiModelProperty(value = "Name of the service provider that is collecting the service fee. The service provider name must consist of 3, 7, or 12 characters followed by an asterisk (*). This value must also include the words “Service Fee.”  When you include more than one consecutive space, extra spaces are removed. Use one of the following formats for this value: - <3-character name>*Service Fee - <7-character name>*Service Fee - <12-character name>*Service Fee  When payments are made in installments, this value must also include installment information such as “1 of 5” or “3 of 7.” For installment payments, use one of the following formats for this value: - <3-character name>*Service Fee*<N> of <M> - <7-character name>*Service Fee*<N> of <M> - <12-character name>*Service Fee*<N> of <M>  where <N> is the payment number and <M> is the total number of payments.  When you do not include this value in your request, CyberSource uses the value that is in your CyberSource account.  This value might be displayed on the cardholder’s statement. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ptsv2paymentsMerchantInformationServiceFeeDescriptor contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact information for the service provider that is collecting the service fee. when you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your request, CyberSource uses the value that is in your CyberSource account.  This value might be displayed on the cardholder’s statement. 
   * @return contact
  **/
  @ApiModelProperty(value = "Contact information for the service provider that is collecting the service fee. when you include more than one consecutive space, extra spaces are removed.  When you do not include this value in your request, CyberSource uses the value that is in your CyberSource account.  This value might be displayed on the cardholder’s statement. ")
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Ptsv2paymentsMerchantInformationServiceFeeDescriptor state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State or territory in which the service provider is located.  When you do not include this value in your request, CyberSource uses the value that is in your CyberSource account.  This value might be displayed on the cardholder’s statement. 
   * @return state
  **/
  @ApiModelProperty(value = "State or territory in which the service provider is located.  When you do not include this value in your request, CyberSource uses the value that is in your CyberSource account.  This value might be displayed on the cardholder’s statement. ")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ptsv2paymentsMerchantInformationServiceFeeDescriptor ptsv2paymentsMerchantInformationServiceFeeDescriptor = (Ptsv2paymentsMerchantInformationServiceFeeDescriptor) o;
    return Objects.equals(this.name, ptsv2paymentsMerchantInformationServiceFeeDescriptor.name) &&
        Objects.equals(this.contact, ptsv2paymentsMerchantInformationServiceFeeDescriptor.contact) &&
        Objects.equals(this.state, ptsv2paymentsMerchantInformationServiceFeeDescriptor.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contact, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ptsv2paymentsMerchantInformationServiceFeeDescriptor {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

