package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceAnalysis
 */
public class CRFraudEvaluationAssessmentRetrieveOutputModelFraudEvaluationAssessmentInstanceAnalysis   {
  private String fraudEvaluationAssessmentInstanceAnalysisData = null;

  private String fraudEvaluationAssessmentInstanceAnalysisReportType = null;

  private Object fraudEvaluationAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return fraudEvaluationAssessmentInstanceAnalysisData
  **/

  public String getFraudEvaluationAssessmentInstanceAnalysisData() {
    return fraudEvaluationAssessmentInstanceAnalysisData;
  }

  public void setFraudEvaluationAssessmentInstanceAnalysisData(String fraudEvaluationAssessmentInstanceAnalysisData) {
    this.fraudEvaluationAssessmentInstanceAnalysisData = fraudEvaluationAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return fraudEvaluationAssessmentInstanceAnalysisReportType
  **/

  public String getFraudEvaluationAssessmentInstanceAnalysisReportType() {
    return fraudEvaluationAssessmentInstanceAnalysisReportType;
  }

  public void setFraudEvaluationAssessmentInstanceAnalysisReportType(String fraudEvaluationAssessmentInstanceAnalysisReportType) {
    this.fraudEvaluationAssessmentInstanceAnalysisReportType = fraudEvaluationAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return fraudEvaluationAssessmentInstanceAnalysisReport
  **/

  public Object getFraudEvaluationAssessmentInstanceAnalysisReport() {
    return fraudEvaluationAssessmentInstanceAnalysisReport;
  }

  public void setFraudEvaluationAssessmentInstanceAnalysisReport(Object fraudEvaluationAssessmentInstanceAnalysisReport) {
    this.fraudEvaluationAssessmentInstanceAnalysisReport = fraudEvaluationAssessmentInstanceAnalysisReport;
  }


}

