package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQModelsRetrieveInputModelModelsInstanceReport
 */
public class BQModelsRetrieveInputModelModelsInstanceReport   {
  private String modelsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return modelsInstanceReportReference
  **/

  public String getModelsInstanceReportReference() {
    return modelsInstanceReportReference;
  }

  public void setModelsInstanceReportReference(String modelsInstanceReportReference) {
    this.modelsInstanceReportReference = modelsInstanceReportReference;
  }


}

