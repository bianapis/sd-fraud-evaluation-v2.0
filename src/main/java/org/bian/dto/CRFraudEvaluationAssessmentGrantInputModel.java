package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentGrantInputModel
 */
public class CRFraudEvaluationAssessmentGrantInputModel   {
  private String fraudEvaluationServicingSessionReference = null;

  private String fraudEvaluationAssessmentInstanceReference = null;

  private Object fraudEvaluationAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRFraudEvaluationAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRFraudEvaluationAssessmentGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRFraudEvaluationAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

