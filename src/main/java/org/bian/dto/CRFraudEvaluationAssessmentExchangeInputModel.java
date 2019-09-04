package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentExchangeInputModelFraudEvaluationAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentExchangeInputModel
 */
public class CRFraudEvaluationAssessmentExchangeInputModel   {
  private String fraudEvaluationServicingSessionReference = null;

  private String fraudEvaluationAssessmentInstanceReference = null;

  private Object fraudEvaluationAssessmentExchangeActionTaskRecord = null;

  private CRFraudEvaluationAssessmentExchangeInputModelFraudEvaluationAssessmentExchangeActionRequest fraudEvaluationAssessmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return fraudEvaluationServicingSessionReference
  **/

  public String getFraudEvaluationServicingSessionReference() {
    return fraudEvaluationServicingSessionReference;
  }

  public void setFraudEvaluationServicingSessionReference(String fraudEvaluationServicingSessionReference) {
    this.fraudEvaluationServicingSessionReference = fraudEvaluationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Fraud Evaluation Assessment instance 
   * @return fraudEvaluationAssessmentInstanceReference
  **/

  public String getFraudEvaluationAssessmentInstanceReference() {
    return fraudEvaluationAssessmentInstanceReference;
  }

  public void setFraudEvaluationAssessmentInstanceReference(String fraudEvaluationAssessmentInstanceReference) {
    this.fraudEvaluationAssessmentInstanceReference = fraudEvaluationAssessmentInstanceReference;
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
   * Get fraudEvaluationAssessmentExchangeActionRequest
   * @return fraudEvaluationAssessmentExchangeActionRequest
  **/

  public CRFraudEvaluationAssessmentExchangeInputModelFraudEvaluationAssessmentExchangeActionRequest getFraudEvaluationAssessmentExchangeActionRequest() {
    return fraudEvaluationAssessmentExchangeActionRequest;
  }

  public void setFraudEvaluationAssessmentExchangeActionRequest(CRFraudEvaluationAssessmentExchangeInputModelFraudEvaluationAssessmentExchangeActionRequest fraudEvaluationAssessmentExchangeActionRequest) {
    this.fraudEvaluationAssessmentExchangeActionRequest = fraudEvaluationAssessmentExchangeActionRequest;
  }


}

