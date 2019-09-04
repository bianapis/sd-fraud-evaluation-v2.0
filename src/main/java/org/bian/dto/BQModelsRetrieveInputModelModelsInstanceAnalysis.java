package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQModelsRetrieveInputModelModelsInstanceAnalysis
 */
public class BQModelsRetrieveInputModelModelsInstanceAnalysis   {
  private String modelsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return modelsInstanceAnalysisReference
  **/

  public String getModelsInstanceAnalysisReference() {
    return modelsInstanceAnalysisReference;
  }

  public void setModelsInstanceAnalysisReference(String modelsInstanceAnalysisReference) {
    this.modelsInstanceAnalysisReference = modelsInstanceAnalysisReference;
  }


}

