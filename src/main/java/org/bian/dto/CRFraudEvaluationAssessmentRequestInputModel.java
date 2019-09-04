package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentRequestInputModelFraudEvaluationAssessmentInstanceRecord;
import org.bian.dto.CRFraudEvaluationAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentRequestInputModel
 */
public class CRFraudEvaluationAssessmentRequestInputModel   {
  private String fraudEvaluationServicingSessionReference = null;

  private String fraudEvaluationAssessmentInstanceReference = null;

  private CRFraudEvaluationAssessmentRequestInputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord = null;

  private Object fraudEvaluationAssessmentRequestActionTaskRecord = null;

  private CRFraudEvaluationAssessmentRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRFraudEvaluationAssessmentRequestInputModelFraudEvaluationAssessmentInstanceRecord getFraudEvaluationAssessmentInstanceRecord() {
    return fraudEvaluationAssessmentInstanceRecord;
  }

  public void setFraudEvaluationAssessmentInstanceRecord(CRFraudEvaluationAssessmentRequestInputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord) {
    this.fraudEvaluationAssessmentInstanceRecord = fraudEvaluationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return fraudEvaluationAssessmentRequestActionTaskRecord
  **/

  public Object getFraudEvaluationAssessmentRequestActionTaskRecord() {
    return fraudEvaluationAssessmentRequestActionTaskRecord;
  }

  public void setFraudEvaluationAssessmentRequestActionTaskRecord(Object fraudEvaluationAssessmentRequestActionTaskRecord) {
    this.fraudEvaluationAssessmentRequestActionTaskRecord = fraudEvaluationAssessmentRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRFraudEvaluationAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRFraudEvaluationAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

