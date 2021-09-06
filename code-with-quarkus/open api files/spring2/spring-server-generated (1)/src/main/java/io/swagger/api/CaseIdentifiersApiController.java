package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T10:17:24.699Z[GMT]")
@Controller
public class CaseIdentifiersApiController implements CaseIdentifiersApi {

    private static final Logger log = LoggerFactory.getLogger(CaseIdentifiersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CaseIdentifiersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> sEQCaseCheckCaseidAvailablityCheckcaseIdavailability(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "caseId", required = true) String caseId
,@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
