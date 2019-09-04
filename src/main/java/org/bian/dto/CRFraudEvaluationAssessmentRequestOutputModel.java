package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentRequestOutputModelFraudEvaluationAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentRequestOutputModel
 */
public class CRFraudEvaluationAssessmentRequestOutputModel   {
  private CRFraudEvaluationAssessmentRequestOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord = null;

  private String fraudEvaluationAssessmentRequestActionTaskReference = null;

  private Object fraudEvaluationAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get fraudEvaluationAssessmentInstanceRecord
   * @return fraudEvaluationAssessmentInstanceRecord
  **/

  public CRFraudEvaluationAssessmentRequestOutputModelFraudEvaluationAssessmentInstanceRecord getFraudEvaluationAssessmentInstanceRecord() {
    return fraudEvaluationAssessmentInstanceRecord;
  }

  public void setFraudEvaluationAssessmentInstanceRecord(CRFraudEvaluationAssessmentRequestOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord) {
    this.fraudEvaluationAssessmentInstanceRecord = fraudEvaluationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Evaluation Assessment instance request service call 
   * @return fraudEvaluationAssessmentRequestActionTaskReference
  **/

  public String getFraudEvaluationAssessmentRequestActionTaskReference() {
    return fraudEvaluationAssessmentRequestActionTaskReference;
  }

  public void setFraudEvaluationAssessmentRequestActionTaskReference(String fraudEvaluationAssessmentRequestActionTaskReference) {
    this.fraudEvaluationAssessmentRequestActionTaskReference = fraudEvaluationAssessmentRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

