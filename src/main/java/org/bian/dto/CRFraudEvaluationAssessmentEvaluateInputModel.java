package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentEvaluateInputModelFraudEvaluationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentEvaluateInputModel
 */
public class CRFraudEvaluationAssessmentEvaluateInputModel   {
  private String fraudEvaluationServicingSessionReference = null;

  private Object fraudEvaluationAssessmentEvaluateActionRecord = null;

  private String fraudEvaluationAssessmentInstanceStatus = null;

  private CRFraudEvaluationAssessmentEvaluateInputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return fraudEvaluationAssessmentEvaluateActionRecord
  **/

  public Object getFraudEvaluationAssessmentEvaluateActionRecord() {
    return fraudEvaluationAssessmentEvaluateActionRecord;
  }

  public void setFraudEvaluationAssessmentEvaluateActionRecord(Object fraudEvaluationAssessmentEvaluateActionRecord) {
    this.fraudEvaluationAssessmentEvaluateActionRecord = fraudEvaluationAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Fraud Evaluation Assessment instance (e.g. initialised, pending, active) 
   * @return fraudEvaluationAssessmentInstanceStatus
  **/

  public String getFraudEvaluationAssessmentInstanceStatus() {
    return fraudEvaluationAssessmentInstanceStatus;
  }

  public void setFraudEvaluationAssessmentInstanceStatus(String fraudEvaluationAssessmentInstanceStatus) {
    this.fraudEvaluationAssessmentInstanceStatus = fraudEvaluationAssessmentInstanceStatus;
  }


  /**
   * Get fraudEvaluationAssessmentInstanceRecord
   * @return fraudEvaluationAssessmentInstanceRecord
  **/

  public CRFraudEvaluationAssessmentEvaluateInputModelFraudEvaluationAssessmentInstanceRecord getFraudEvaluationAssessmentInstanceRecord() {
    return fraudEvaluationAssessmentInstanceRecord;
  }

  public void setFraudEvaluationAssessmentInstanceRecord(CRFraudEvaluationAssessmentEvaluateInputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord) {
    this.fraudEvaluationAssessmentInstanceRecord = fraudEvaluationAssessmentInstanceRecord;
  }


}

