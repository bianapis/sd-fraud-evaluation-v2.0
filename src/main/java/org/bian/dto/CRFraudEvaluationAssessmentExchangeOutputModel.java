package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentExchangeOutputModel
 */
public class CRFraudEvaluationAssessmentExchangeOutputModel   {
  private String fraudEvaluationAssessmentExchangeActionTaskReference = null;

  private Object fraudEvaluationAssessmentExchangeActionTaskRecord = null;

  private String fraudEvaluationAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Evaluation Assessment instance exchange service call 
   * @return fraudEvaluationAssessmentExchangeActionTaskReference
  **/

  public String getFraudEvaluationAssessmentExchangeActionTaskReference() {
    return fraudEvaluationAssessmentExchangeActionTaskReference;
  }

  public void setFraudEvaluationAssessmentExchangeActionTaskReference(String fraudEvaluationAssessmentExchangeActionTaskReference) {
    this.fraudEvaluationAssessmentExchangeActionTaskReference = fraudEvaluationAssessmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return fraudEvaluationAssessmentExchangeActionTaskRecord
  **/

  public Object getFraudEvaluationAssessmentExchangeActionTaskRecord() {
    return fraudEvaluationAssessmentExchangeActionTaskRecord;
  }

  public void setFraudEvaluationAssessmentExchangeActionTaskRecord(Object fraudEvaluationAssessmentExchangeActionTaskRecord) {
    this.fraudEvaluationAssessmentExchangeActionTaskRecord = fraudEvaluationAssessmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return fraudEvaluationAssessmentExchangeActionResponse
  **/

  public String getFraudEvaluationAssessmentExchangeActionResponse() {
    return fraudEvaluationAssessmentExchangeActionResponse;
  }

  public void setFraudEvaluationAssessmentExchangeActionResponse(String fraudEvaluationAssessmentExchangeActionResponse) {
    this.fraudEvaluationAssessmentExchangeActionResponse = fraudEvaluationAssessmentExchangeActionResponse;
  }


}

