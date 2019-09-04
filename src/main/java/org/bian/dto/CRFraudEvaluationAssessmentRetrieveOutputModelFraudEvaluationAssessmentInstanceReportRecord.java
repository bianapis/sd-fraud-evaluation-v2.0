package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceReportRecord
 */
public class CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceReportRecord   {
  private String fraudEvaluationAssessmentInstanceReportData = null;

  private String fraudEvaluationAssessmentInstanceReportType = null;

  private Object fraudEvaluationAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return fraudEvaluationAssessmentInstanceReportData
  **/

  public String getFraudEvaluationAssessmentInstanceReportData() {
    return fraudEvaluationAssessmentInstanceReportData;
  }

  public void setFraudEvaluationAssessmentInstanceReportData(String fraudEvaluationAssessmentInstanceReportData) {
    this.fraudEvaluationAssessmentInstanceReportData = fraudEvaluationAssessmentInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return fraudEvaluationAssessmentInstanceReportType
  **/

  public String getFraudEvaluationAssessmentInstanceReportType() {
    return fraudEvaluationAssessmentInstanceReportType;
  }

  public void setFraudEvaluationAssessmentInstanceReportType(String fraudEvaluationAssessmentInstanceReportType) {
    this.fraudEvaluationAssessmentInstanceReportType = fraudEvaluationAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return fraudEvaluationAssessmentInstanceReport
  **/

  public Object getFraudEvaluationAssessmentInstanceReport() {
    return fraudEvaluationAssessmentInstanceReport;
  }

  public void setFraudEvaluationAssessmentInstanceReport(Object fraudEvaluationAssessmentInstanceReport) {
    this.fraudEvaluationAssessmentInstanceReport = fraudEvaluationAssessmentInstanceReport;
  }


}

