package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentGrantOutputModel
 */
public class CRFraudEvaluationAssessmentGrantOutputModel   {
  private String fraudEvaluationAssessmentGrantActionTaskReference = null;

  private Object fraudEvaluationAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRFraudEvaluationAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Evaluation Assessment instance grant service call 
   * @return fraudEvaluationAssessmentGrantActionTaskReference
  **/

  public String getFraudEvaluationAssessmentGrantActionTaskReference() {
    return fraudEvaluationAssessmentGrantActionTaskReference;
  }

  public void setFraudEvaluationAssessmentGrantActionTaskReference(String fraudEvaluationAssessmentGrantActionTaskReference) {
    this.fraudEvaluationAssessmentGrantActionTaskReference = fraudEvaluationAssessmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return fraudEvaluationAssessmentGrantActionTaskRecord
  **/

  public Object getFraudEvaluationAssessmentGrantActionTaskRecord() {
    return fraudEvaluationAssessmentGrantActionTaskRecord;
  }

  public void setFraudEvaluationAssessmentGrantActionTaskRecord(Object fraudEvaluationAssessmentGrantActionTaskRecord) {
    this.fraudEvaluationAssessmentGrantActionTaskRecord = fraudEvaluationAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRFraudEvaluationAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRFraudEvaluationAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

