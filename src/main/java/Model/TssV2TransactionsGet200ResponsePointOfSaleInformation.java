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
import Model.Ptsv2paymentsidreversalsPointOfSaleInformationEmv;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TssV2TransactionsGet200ResponsePointOfSaleInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-21T19:52:27.193+05:30")
public class TssV2TransactionsGet200ResponsePointOfSaleInformation {
  @SerializedName("terminalId")
  private String terminalId = null;

  @SerializedName("entryMode")
  private String entryMode = null;

  @SerializedName("terminalCapability")
  private Integer terminalCapability = null;

  @SerializedName("emv")
  private Ptsv2paymentsidreversalsPointOfSaleInformationEmv emv = null;

  public TssV2TransactionsGet200ResponsePointOfSaleInformation terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Identifier for the terminal at your retail location. You can define this value yourself, but consult the processor for requirements.  #### CyberSource through VisaNet A list of all possible values is stored in your CyberSource account. If terminal ID validation is enabled for your CyberSource account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact CyberSource Customer Support.  When you do not include this field in a request, CyberSource uses the default value that is defined in your CyberSource account.  #### FDC Nashville Global To have your account configured to support this field, contact CyberSource Customer Support. This value must be a value that FDC Nashville Global issued to you.  #### For Payouts This field is applicable for CyberSource through VisaNet.  #### GPX Identifier for the terminal at your retail location. A list of all possible values is stored in your account. If terminal ID validation is enabled for your account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact customer support.  When you do not include this field in a request, the default value that is defined in your account is used.  Optional for authorizations.  #### Used by **Authorization** Optional for the following processors. When you do not include this field in a request, the default value that is defined in your account is used.   - American Express Direct   - Credit Mutuel-CIC   - FDC Nashville Global   - SIX - Chase Paymentech Solutions: Optional field. If you include this field in your request, you must also include &#x60;pointOfSaleInformation.catLevel&#x60;. - FDMS Nashville: The default value that is defined in your account is used. - GPX - OmniPay Direct: Optional field.  For the following processors, this field is not used. - GPN - JCN Gateway - RBS WorldPay Atlanta - TSYS Acquiring Solutions - Worldpay VAP  #### Card Present reply Terminal identifier assigned by the acquirer. This value must be printed on the receipt. 
   * @return terminalId
  **/
  @ApiModelProperty(value = "Identifier for the terminal at your retail location. You can define this value yourself, but consult the processor for requirements.  #### CyberSource through VisaNet A list of all possible values is stored in your CyberSource account. If terminal ID validation is enabled for your CyberSource account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact CyberSource Customer Support.  When you do not include this field in a request, CyberSource uses the default value that is defined in your CyberSource account.  #### FDC Nashville Global To have your account configured to support this field, contact CyberSource Customer Support. This value must be a value that FDC Nashville Global issued to you.  #### For Payouts This field is applicable for CyberSource through VisaNet.  #### GPX Identifier for the terminal at your retail location. A list of all possible values is stored in your account. If terminal ID validation is enabled for your account, the value you send for this field is validated against the list each time you include the field in a request. To enable or disable terminal ID validation, contact customer support.  When you do not include this field in a request, the default value that is defined in your account is used.  Optional for authorizations.  #### Used by **Authorization** Optional for the following processors. When you do not include this field in a request, the default value that is defined in your account is used.   - American Express Direct   - Credit Mutuel-CIC   - FDC Nashville Global   - SIX - Chase Paymentech Solutions: Optional field. If you include this field in your request, you must also include `pointOfSaleInformation.catLevel`. - FDMS Nashville: The default value that is defined in your account is used. - GPX - OmniPay Direct: Optional field.  For the following processors, this field is not used. - GPN - JCN Gateway - RBS WorldPay Atlanta - TSYS Acquiring Solutions - Worldpay VAP  #### Card Present reply Terminal identifier assigned by the acquirer. This value must be printed on the receipt. ")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public TssV2TransactionsGet200ResponsePointOfSaleInformation entryMode(String entryMode) {
    this.entryMode = entryMode;
    return this;
  }

   /**
   * Method of entering payment card information into the POS terminal. Possible values:   - &#x60;contact&#x60;: Read from direct contact with chip card.  - &#x60;contactless&#x60;: Read from a contactless interface using chip data.  - &#x60;keyed&#x60;: Manually keyed into POS terminal. This value is not supported on OmniPay Direct.  - &#x60;msd&#x60;: Read from a contactless interface using magnetic stripe data (MSD). This value is not supported on OmniPay Direct.  - &#x60;swiped&#x60;: Read from credit card magnetic stripe.  The &#x60;contact&#x60;, &#x60;contactless&#x60;, and &#x60;msd&#x60; values are supported only for EMV transactions.  #### Used by **Authorization** Required field.  #### Card Present Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing.  #### PIN debit Required for a PIN debit purchase and a PIN debit credit request. 
   * @return entryMode
  **/
  @ApiModelProperty(value = "Method of entering payment card information into the POS terminal. Possible values:   - `contact`: Read from direct contact with chip card.  - `contactless`: Read from a contactless interface using chip data.  - `keyed`: Manually keyed into POS terminal. This value is not supported on OmniPay Direct.  - `msd`: Read from a contactless interface using magnetic stripe data (MSD). This value is not supported on OmniPay Direct.  - `swiped`: Read from credit card magnetic stripe.  The `contact`, `contactless`, and `msd` values are supported only for EMV transactions.  #### Used by **Authorization** Required field.  #### Card Present Card present information about EMV applies only to credit card processing and PIN debit processing. All other card present information applies only to credit card processing.  #### PIN debit Required for a PIN debit purchase and a PIN debit credit request. ")
  public String getEntryMode() {
    return entryMode;
  }

  public void setEntryMode(String entryMode) {
    this.entryMode = entryMode;
  }

  public TssV2TransactionsGet200ResponsePointOfSaleInformation terminalCapability(Integer terminalCapability) {
    this.terminalCapability = terminalCapability;
    return this;
  }

   /**
   * POS terminal’s capability. Possible values:   - &#x60;1&#x60;: Terminal has a magnetic stripe reader only.  - &#x60;2&#x60;: Terminal has a magnetic stripe reader and manual entry capability.  - &#x60;3&#x60;: Terminal has manual entry capability only.  - &#x60;4&#x60;: Terminal can read chip cards.  - &#x60;5&#x60;: Terminal can read contactless chip cards; cannot use contact to read chip cards.  For an EMV transaction, the value of this field must be &#x60;4&#x60; or &#x60;5&#x60;.  #### PIN debit Required for PIN debit purchase and PIN debit credit request.  #### Used by **Authorization** Required for the following processors: - American Express Direct - Chase Paymentech Solutions - Credit Mutuel-CIC - FDC Nashville Global - FDMS Nashville - OmniPay Direct - SIX - Worldpay VAP  Optional for the following processors: - CyberSource through VisaNet - GPN - GPX - JCN Gateway - RBS WorldPay Atlanta - TSYS Acquiring Solutions 
   * minimum: 1
   * maximum: 5
   * @return terminalCapability
  **/
  @ApiModelProperty(value = "POS terminal’s capability. Possible values:   - `1`: Terminal has a magnetic stripe reader only.  - `2`: Terminal has a magnetic stripe reader and manual entry capability.  - `3`: Terminal has manual entry capability only.  - `4`: Terminal can read chip cards.  - `5`: Terminal can read contactless chip cards; cannot use contact to read chip cards.  For an EMV transaction, the value of this field must be `4` or `5`.  #### PIN debit Required for PIN debit purchase and PIN debit credit request.  #### Used by **Authorization** Required for the following processors: - American Express Direct - Chase Paymentech Solutions - Credit Mutuel-CIC - FDC Nashville Global - FDMS Nashville - OmniPay Direct - SIX - Worldpay VAP  Optional for the following processors: - CyberSource through VisaNet - GPN - GPX - JCN Gateway - RBS WorldPay Atlanta - TSYS Acquiring Solutions ")
  public Integer getTerminalCapability() {
    return terminalCapability;
  }

  public void setTerminalCapability(Integer terminalCapability) {
    this.terminalCapability = terminalCapability;
  }

  public TssV2TransactionsGet200ResponsePointOfSaleInformation emv(Ptsv2paymentsidreversalsPointOfSaleInformationEmv emv) {
    this.emv = emv;
    return this;
  }

   /**
   * Get emv
   * @return emv
  **/
  @ApiModelProperty(value = "")
  public Ptsv2paymentsidreversalsPointOfSaleInformationEmv getEmv() {
    return emv;
  }

  public void setEmv(Ptsv2paymentsidreversalsPointOfSaleInformationEmv emv) {
    this.emv = emv;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TssV2TransactionsGet200ResponsePointOfSaleInformation tssV2TransactionsGet200ResponsePointOfSaleInformation = (TssV2TransactionsGet200ResponsePointOfSaleInformation) o;
    return Objects.equals(this.terminalId, tssV2TransactionsGet200ResponsePointOfSaleInformation.terminalId) &&
        Objects.equals(this.entryMode, tssV2TransactionsGet200ResponsePointOfSaleInformation.entryMode) &&
        Objects.equals(this.terminalCapability, tssV2TransactionsGet200ResponsePointOfSaleInformation.terminalCapability) &&
        Objects.equals(this.emv, tssV2TransactionsGet200ResponsePointOfSaleInformation.emv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terminalId, entryMode, terminalCapability, emv);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TssV2TransactionsGet200ResponsePointOfSaleInformation {\n");
    
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    entryMode: ").append(toIndentedString(entryMode)).append("\n");
    sb.append("    terminalCapability: ").append(toIndentedString(terminalCapability)).append("\n");
    sb.append("    emv: ").append(toIndentedString(emv)).append("\n");
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

