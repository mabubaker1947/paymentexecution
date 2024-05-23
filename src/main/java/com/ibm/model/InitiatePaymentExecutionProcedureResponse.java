package com.ibm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.model.InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure;

import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Output: InCR Initiate a payment execution procedure
 */

@Schema(name = "InitiatePaymentExecutionProcedureResponse", description = "Output: InCR Initiate a payment execution procedure")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-22T13:00:04.063178682Z[GMT]")
public class InitiatePaymentExecutionProcedureResponse {

  private InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure;

  public InitiatePaymentExecutionProcedureResponse paymentExecutionProcedure(InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
    return this;
  }

  /**
   * Get paymentExecutionProcedure
   * @return paymentExecutionProcedure
  */
  @Valid 
  @Schema(name = "PaymentExecutionProcedure", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PaymentExecutionProcedure")
  public InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure getPaymentExecutionProcedure() {
    return paymentExecutionProcedure;
  }

  public void setPaymentExecutionProcedure(InitiatePaymentExecutionProcedureResponsePaymentExecutionProcedure paymentExecutionProcedure) {
    this.paymentExecutionProcedure = paymentExecutionProcedure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiatePaymentExecutionProcedureResponse initiatePaymentExecutionProcedureResponse = (InitiatePaymentExecutionProcedureResponse) o;
    return Objects.equals(this.paymentExecutionProcedure, initiatePaymentExecutionProcedureResponse.paymentExecutionProcedure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentExecutionProcedure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiatePaymentExecutionProcedureResponse {\n");
    sb.append("    paymentExecutionProcedure: ").append(toIndentedString(paymentExecutionProcedure)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

