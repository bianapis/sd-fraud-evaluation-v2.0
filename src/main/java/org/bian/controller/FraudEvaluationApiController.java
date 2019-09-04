/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class FraudEvaluationApiController {

	@Autowired
	FraudEvaluationApiService service;
	
	@Assess.Activate
	public BianResponse<SDFraudEvaluationActivateOutputModel> activate(@RequestBody BianRequest<SDFraudEvaluationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Assess.Configure
	public BianResponse<SDFraudEvaluationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFraudEvaluationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Evaluate
	public BianResponse<CRFraudEvaluationAssessmentEvaluateOutputModel> evaluate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRFraudEvaluationAssessmentEvaluateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Exchange
	public BianResponse<CRFraudEvaluationAssessmentExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFraudEvaluationAssessmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Execute
	public BianResponse<CRFraudEvaluationAssessmentExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFraudEvaluationAssessmentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Feedback
	public BianResponse<SDFraudEvaluationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDFraudEvaluationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Assess.Grant
	public BianResponse<CRFraudEvaluationAssessmentGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFraudEvaluationAssessmentGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Request
	public BianResponse<CRFraudEvaluationAssessmentRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRFraudEvaluationAssessmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Retrieve
	public BianResponse<CRFraudEvaluationAssessmentRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@BQ("models")
	@Assess.Retrieve
	public BianResponse<BQModelsRetrieveOutputModel> retrieveModels(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveModels(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("rulesetsanddecisiontrees")
	@Assess.Retrieve
	public BianResponse<BQRuleSetsandDecisionTreesRetrieveOutputModel> retrieveRulesetsanddecisiontrees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRulesetsanddecisiontrees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Assess.RetrieveSD
	public BianResponse<SDFraudEvaluationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
}
