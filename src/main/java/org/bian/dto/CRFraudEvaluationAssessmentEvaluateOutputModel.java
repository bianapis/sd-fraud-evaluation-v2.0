package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentEvaluateOutputModelFraudEvaluationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentEvaluateOutputModel
 */
public class CRFraudEvaluationAssessmentEvaluateOutputModel   {
  private String fraudEvaluationAssessmentInstanceReference = null;

  private String fraudEvaluationAssessmentEvaluateActionReference = null;

  private Object fraudEvaluationAssessmentEvaluateActionRecord = null;

  private String fraudEvaluationAssessmentInstanceStatus = null;

  private CRFraudEvaluationAssessmentEvaluateOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return fraudEvaluationAssessmentEvaluateActionReference
  **/

  public String getFraudEvaluationAssessmentEvaluateActionReference() {
    return fraudEvaluationAssessmentEvaluateActionReference;
  }

  public void setFraudEvaluationAssessmentEvaluateActionReference(String fraudEvaluationAssessmentEvaluateActionReference) {
    this.fraudEvaluationAssessmentEvaluateActionReference = fraudEvaluationAssessmentEvaluateActionReference;
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

  public CRFraudEvaluationAssessmentEvaluateOutputModelFraudEvaluationAssessmentInstanceRecord getFraudEvaluationAssessmentInstanceRecord() {
    return fraudEvaluationAssessmentInstanceRecord;
  }

  public void setFraudEvaluationAssessmentInstanceRecord(CRFraudEvaluationAssessmentEvaluateOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord) {
    this.fraudEvaluationAssessmentInstanceRecord = fraudEvaluationAssessmentInstanceRecord;
  }


}

