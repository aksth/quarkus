package io.swagger.api;

import io.swagger.model.ListGroup;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-03T08:23:41.414Z[GMT]")
@Controller
public class GroupsApiController implements GroupsApi {

    private static final Logger log = LoggerFactory.getLogger(GroupsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GroupsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> sEQPreGroupCaseTemplateGetthecasetemplateforagroup(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("group-id") String groupId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> sEQPreGroupGetaspecificgroupbyID(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("group-id") String groupId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> sEQPreGroupResolutionToolkitGettheresolutiontoolkitforagroup(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("group-id") String groupId
,@ApiParam(value = "",required=true) @PathVariable("provider-type") String providerType
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> sEQPreGroupResolutionToolkitsGetallresolutiontoolkitsforagroup(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
,@ApiParam(value = "",required=true) @PathVariable("group-id") String groupId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListGroup> sEQPreGroupsGetmytopLevelgroups(@ApiParam(value = "" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "" ,required=true) @RequestHeader(value="org.akash.Authorization", required=true) String authorization
,@ApiParam(value = "",required=true) @PathVariable("gateway-host") String gatewayHost
,@ApiParam(value = "",required=true) @PathVariable("gateway-url") String gatewayUrl
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListGroup>(objectMapper.readValue("[ {\n  \"id\" : \"id\"\n}, {\n  \"id\" : \"id\"\n} ]", ListGroup.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListGroup>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListGroup>(HttpStatus.NOT_IMPLEMENTED);
    }

}
