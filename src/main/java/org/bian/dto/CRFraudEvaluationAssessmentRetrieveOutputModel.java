package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceAnalysis;
import org.bian.dto.CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord;
import org.bian.dto.CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentRetrieveOutputModel
 */
public class CRFraudEvaluationAssessmentRetrieveOutputModel   {
  private CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord = null;

  private String fraudEvaluationAssessmentRetrieveActionTaskReference = null;

  private Object fraudEvaluationAssessmentRetrieveActionTaskRecord = null;

  private String fraudEvaluationAssessmentRetrieveActionResponse = null;

  private CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceReportRecord fraudEvaluationAssessmentInstanceReportRecord = null;

  private CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceAnalysis fraudEvaluationAssessmentInstanceAnalysis = null;


  /**
   * Get fraudEvaluationAssessmentInstanceRecord
   * @return fraudEvaluationAssessmentInstanceRecord
  **/

  public CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord getFraudEvaluationAssessmentInstanceRecord() {
    return fraudEvaluationAssessmentInstanceRecord;
  }

  public void setFraudEvaluationAssessmentInstanceRecord(CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceRecord fraudEvaluationAssessmentInstanceRecord) {
    this.fraudEvaluationAssessmentInstanceRecord = fraudEvaluationAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Fraud Evaluation Assessment instance retrieve service call 
   * @return fraudEvaluationAssessmentRetrieveActionTaskReference
  **/

  public String getFraudEvaluationAssessmentRetrieveActionTaskReference() {
    return fraudEvaluationAssessmentRetrieveActionTaskReference;
  }

  public void setFraudEvaluationAssessmentRetrieveActionTaskReference(String fraudEvaluationAssessmentRetrieveActionTaskReference) {
    this.fraudEvaluationAssessmentRetrieveActionTaskReference = fraudEvaluationAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return fraudEvaluationAssessmentRetrieveActionTaskRecord
  **/

  public Object getFraudEvaluationAssessmentRetrieveActionTaskRecord() {
    return fraudEvaluationAssessmentRetrieveActionTaskRecord;
  }

  public void setFraudEvaluationAssessmentRetrieveActionTaskRecord(Object fraudEvaluationAssessmentRetrieveActionTaskRecord) {
    this.fraudEvaluationAssessmentRetrieveActionTaskRecord = fraudEvaluationAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return fraudEvaluationAssessmentRetrieveActionResponse
  **/

  public String getFraudEvaluationAssessmentRetrieveActionResponse() {
    return fraudEvaluationAssessmentRetrieveActionResponse;
  }

  public void setFraudEvaluationAssessmentRetrieveActionResponse(String fraudEvaluationAssessmentRetrieveActionResponse) {
    this.fraudEvaluationAssessmentRetrieveActionResponse = fraudEvaluationAssessmentRetrieveActionResponse;
  }


  /**
   * Get fraudEvaluationAssessmentInstanceReportRecord
   * @return fraudEvaluationAssessmentInstanceReportRecord
  **/

  public CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceReportRecord getFraudEvaluationAssessmentInstanceReportRecord() {
    return fraudEvaluationAssessmentInstanceReportRecord;
  }

  public void setFraudEvaluationAssessmentInstanceReportRecord(CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceReportRecord fraudEvaluationAssessmentInstanceReportRecord) {
    this.fraudEvaluationAssessmentInstanceReportRecord = fraudEvaluationAssessmentInstanceReportRecord;
  }


  /**
   * Get fraudEvaluationAssessmentInstanceAnalysis
   * @return fraudEvaluationAssessmentInstanceAnalysis
  **/

  public CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceAnalysis getFraudEvaluationAssessmentInstanceAnalysis() {
    return fraudEvaluationAssessmentInstanceAnalysis;
  }

  public void setFraudEvaluationAssessmentInstanceAnalysis(CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceAnalysis fraudEvaluationAssessmentInstanceAnalysis) {
    this.fraudEvaluationAssessmentInstanceAnalysis = fraudEvaluationAssessmentInstanceAnalysis;
  }


}

