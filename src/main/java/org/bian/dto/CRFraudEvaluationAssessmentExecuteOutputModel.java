package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentExecuteOutputModelFraudEvaluationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentExecuteOutputModel
 */
public class CRFraudEvaluationAssessmentExecuteOutputModel   {
  private CRFraudEvaluationAssessmentExecuteOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord = null;

  private String fraudEvaluationAssessmentExecuteActionTaskReference = null;

  private Object fraudEvaluationAssessmentExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get fraudEvaluationAssessmentInstanceRecord
   * @return fraudEvaluationAssessmentInstanceRecord
  **/

  public CRFraudEvaluationAssessmentExecuteOutputModelFraudEvaluationAssessmentInstanceRecord getFraudEvaluationAssessmentInstanceRecord() {
    return fraudEvaluationAssessmentInstanceRecord;
  }

  public void setFraudEvaluationAssessmentInstanceRecord(CRFraudEvaluationAssessmentExecuteOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord) {
    this.fraudEvaluationAssessmentInstanceRecord = fraudEvaluationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Evaluation Assessment instance execute service call 
   * @return fraudEvaluationAssessmentExecuteActionTaskReference
  **/

  public String getFraudEvaluationAssessmentExecuteActionTaskReference() {
    return fraudEvaluationAssessmentExecuteActionTaskReference;
  }

  public void setFraudEvaluationAssessmentExecuteActionTaskReference(String fraudEvaluationAssessmentExecuteActionTaskReference) {
    this.fraudEvaluationAssessmentExecuteActionTaskReference = fraudEvaluationAssessmentExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return fraudEvaluationAssessmentExecuteActionTaskRecord
  **/

  public Object getFraudEvaluationAssessmentExecuteActionTaskRecord() {
    return fraudEvaluationAssessmentExecuteActionTaskRecord;
  }

  public void setFraudEvaluationAssessmentExecuteActionTaskRecord(Object fraudEvaluationAssessmentExecuteActionTaskRecord) {
    this.fraudEvaluationAssessmentExecuteActionTaskRecord = fraudEvaluationAssessmentExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

