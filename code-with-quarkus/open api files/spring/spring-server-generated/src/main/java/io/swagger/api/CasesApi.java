/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.19).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
@Api(value = "cases", description = "the cases API")
public interface CasesApi {

    @ApiOperation(value = "SEQ-case-archive: Archive a case", nickname = "sEQCaseArchiveArchiveacase", notes = "Once a customer/supplier is onboarded, their case can be archived", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/archive",
        method = RequestMethod.PUT)
    ResponseEntity<Void> sEQCaseArchiveArchiveacase(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-assign: Assign a case to a user", nickname = "sEQCaseAssignAssignacasetoauser", notes = "Cases can be assigned to any user in the client's account. Note that a user will gain access to a case which is not in that user's accessible groups if the case is assigned to that user.", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/assignee",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> sEQCaseAssignAssignacasetoauser(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Content-Length", required=true) String contentLength
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-audit: Retrieve the audit log for a case", nickname = "sEQCaseAuditRetrievetheauditlogforacase", notes = "Query for audit events against a Case", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/auditEvents",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> sEQCaseAuditRetrievetheauditlogforacase(@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Content-Length", required=true) String contentLength
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-create-simple: Save a very simple case", nickname = "sEQCaseCreateSimpleSaveaverysimplecase", notes = "Save a case with a minimum amount of data", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> sEQCaseCreateSimpleSaveaverysimplecase(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Content-Length", required=true) String contentLength
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
);


    @ApiOperation(value = "SEQ-case-delete: Delete a case", nickname = "sEQCaseDeleteDeleteacase", notes = "Deletes an archived case from World-Check One.", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> sEQCaseDeleteDeleteacase(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-investigate-case-details: Fetch full case details", nickname = "sEQCaseInvestigateCaseDetailsFetchfullcasedetails", notes = "This can be used to find out what data is currently stored against a specific case within World-Check One.", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}",
        method = RequestMethod.GET)
    ResponseEntity<Void> sEQCaseInvestigateCaseDetailsFetchfullcasedetails(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-investigate-resolve-results: Resolve results", nickname = "sEQCaseInvestigateResolveResultsResolveresults", notes = "Resolve the specified results for the specified case", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/results/resolution",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> sEQCaseInvestigateResolveResultsResolveresults(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Content-Length", required=true) String contentLength
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-investigate-results: Get screening results", nickname = "sEQCaseInvestigateResultsGetscreeningresults", notes = "Retrieve all available screening results for a case", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/results",
        method = RequestMethod.GET)
    ResponseEntity<Void> sEQCaseInvestigateResultsGetscreeningresults(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-investigate-review-results: Review results", nickname = "sEQCaseInvestigateReviewResultsReviewresults", notes = "Review the specified results for the specified case", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/results/review",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> sEQCaseInvestigateReviewResultsReviewresults(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Content-Length", required=true) String contentLength
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-monitor-ogs: Monitor ongoing screening updates on cases", nickname = "sEQCaseMonitorOgsMonitorongoingscreeningupdatesoncases", notes = "Query for notifications against Cases", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/ongoingScreeningUpdates",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> sEQCaseMonitorOgsMonitorongoingscreeningupdatesoncases(@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Content-Length", required=true) String contentLength
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
);


    @ApiOperation(value = "SEQ-case-ogs-disable: Disable ongoing screening for a case", nickname = "sEQCaseOgsDisableDisableongoingscreeningforacase", notes = "If business with a customer/supplier ceases, its case record can be removed from ongoing monitoring to prevent future alerts being raised.", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/ongoingScreening",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> sEQCaseOgsDisableDisableongoingscreeningforacase(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-ogs-enable: Enable ongoing screening for a case", nickname = "sEQCaseOgsEnableEnableongoingscreeningforacase", notes = "Once a customer/supplier is onboarded, their case can be flagged for ongoing monitoring", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/ongoingScreening",
        method = RequestMethod.PUT)
    ResponseEntity<Void> sEQCaseOgsEnableEnableongoingscreeningforacase(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-unarchive: Unarchive a case", nickname = "sEQCaseUnarchiveUnarchiveacase", notes = "If an archived case is required to be made active again it can be unarchived.", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/archive",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> sEQCaseUnarchiveUnarchiveacase(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-unassign: Remove its current assignee from a case", nickname = "sEQCaseUnassignRemoveitscurrentassigneefromacase", notes = "Remove its current assignee from a case. If the case is not assigned to any user, this operation has no effect.", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/assignee",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> sEQCaseUnassignRemoveitscurrentassigneefromacase(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-case-update: Update a case", nickname = "sEQCaseUpdateUpdateacase", notes = "Case data can be updated at any time.  Screenings are performed against case data as it exists at the time of screening, and all results from that screening request will correspond to that case data.", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> sEQCaseUpdateUpdateacase(@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Content-Length", required=true) String contentLength
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-screen-async: Screen a case", nickname = "sEQScreenAsyncScreenacase", notes = "Request for a case to be screened", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/{case-system-id}/screeningRequest",
        method = RequestMethod.POST)
    ResponseEntity<Void> sEQScreenAsyncScreenacase(@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("case-system-id") String caseSystemId
);


    @ApiOperation(value = "SEQ-screen-sync-simple: Perform Synchronous Screening: Simple", nickname = "sEQScreenSyncSimplePerformSynchronousScreeningSimple", notes = "Perform a synchronous screening of a new case with minimal data", tags={ "Misc", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "") })
    @RequestMapping(value = "/cases/screeningRequest",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> sEQScreenSyncSimplePerformSynchronousScreeningSimple(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Content-Length", required=true) String contentLength
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
);

}