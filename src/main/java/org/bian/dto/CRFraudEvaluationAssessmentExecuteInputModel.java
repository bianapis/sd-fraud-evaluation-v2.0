package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentExecuteInputModelExecuteRecordType;
import org.bian.dto.CRFraudEvaluationAssessmentExecuteInputModelFraudEvaluationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentExecuteInputModel
 */
public class CRFraudEvaluationAssessmentExecuteInputModel   {
  private String fraudEvaluationServicingSessionReference = null;

  private String fraudEvaluationAssessmentInstanceReference = null;

  private CRFraudEvaluationAssessmentExecuteInputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord = null;

  private Object fraudEvaluationAssessmentExecuteActionTaskRecord = null;

  private CRFraudEvaluationAssessmentExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * Get fraudEvaluationAssessmentInstanceRecord
   * @return fraudEvaluationAssessmentInstanceRecord
  **/

  public CRFraudEvaluationAssessmentExecuteInputModelFraudEvaluationAssessmentInstanceRecord getFraudEvaluationAssessmentInstanceRecord() {
    return fraudEvaluationAssessmentInstanceRecord;
  }

  public void setFraudEvaluationAssessmentInstanceRecord(CRFraudEvaluationAssessmentExecuteInputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord) {
    this.fraudEvaluationAssessmentInstanceRecord = fraudEvaluationAssessmentInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRFraudEvaluationAssessmentExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRFraudEvaluationAssessmentExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

