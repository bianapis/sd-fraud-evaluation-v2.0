package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceAnalysis;
import org.bian.dto.CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentRetrieveInputModel
 */
public class CRFraudEvaluationAssessmentRetrieveInputModel   {
  private Object fraudEvaluationAssessmentRetrieveActionTaskRecord = null;

  private String fraudEvaluationAssessmentRetrieveActionRequest = null;

  private CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceReportRecord fraudEvaluationAssessmentInstanceReportRecord = null;

  private CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceAnalysis fraudEvaluationAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return fraudEvaluationAssessmentRetrieveActionRequest
  **/

  public String getFraudEvaluationAssessmentRetrieveActionRequest() {
    return fraudEvaluationAssessmentRetrieveActionRequest;
  }

  public void setFraudEvaluationAssessmentRetrieveActionRequest(String fraudEvaluationAssessmentRetrieveActionRequest) {
    this.fraudEvaluationAssessmentRetrieveActionRequest = fraudEvaluationAssessmentRetrieveActionRequest;
  }


  /**
   * Get fraudEvaluationAssessmentInstanceReportRecord
   * @return fraudEvaluationAssessmentInstanceReportRecord
  **/

  public CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceReportRecord getFraudEvaluationAssessmentInstanceReportRecord() {
    return fraudEvaluationAssessmentInstanceReportRecord;
  }

  public void setFraudEvaluationAssessmentInstanceReportRecord(CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceReportRecord fraudEvaluationAssessmentInstanceReportRecord) {
    this.fraudEvaluationAssessmentInstanceReportRecord = fraudEvaluationAssessmentInstanceReportRecord;
  }


  /**
   * Get fraudEvaluationAssessmentInstanceAnalysis
   * @return fraudEvaluationAssessmentInstanceAnalysis
  **/

  public CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceAnalysis getFraudEvaluationAssessmentInstanceAnalysis() {
    return fraudEvaluationAssessmentInstanceAnalysis;
  }

  public void setFraudEvaluationAssessmentInstanceAnalysis(CRFraudEvaluationAssessmentRetrieveInputModelFraudEvaluationAssessmentInstanceAnalysis fraudEvaluationAssessmentInstanceAnalysis) {
    this.fraudEvaluationAssessmentInstanceAnalysis = fraudEvaluationAssessmentInstanceAnalysis;
  }


}

