package org.acme;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.representations.AccessTokenResponse;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.UserRepresentation;

import javax.net.ssl.SSLSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Path("/api/test")
public class TestResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/getToken")
    public Response getToken(){
        Keycloak kc2 = KeycloakBuilder.builder()
                .serverUrl("http://localhost:8180/auth")
                .realm("quarkus")
                .clientId("backend-service")
                .clientSecret("secret").username("alice").password("alice").build();

        AccessTokenResponse accessToken = kc2.tokenManager().getAccessToken();

        URI uri = null;
        try{
            uri = new URI("sdkfj/asdlfkjsdaf");
        }catch(Exception e){

        }
        return Response.status(201, "token created").entity(accessToken.getToken()).build();
        //return Response.created(uri).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/createUser")
    public Response adminCreateUser() {

        Keycloak kc = KeycloakBuilder.builder()
                .serverUrl("http://localhost:8180/auth")
                .realm("master")
                .clientId("admin-cli")
                .clientSecret("").username("admin").password("admin").build();

        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setUsername("test55");
        userRepresentation.setEnabled(true);

        CredentialRepresentation credentialRepresentation = new CredentialRepresentation();
        credentialRepresentation.setTemporary(false);
        credentialRepresentation.setType(CredentialRepresentation.PASSWORD);
        credentialRepresentation.setValue(userRepresentation.getUsername());
        userRepresentation.setCredentials(Collections.singletonList(credentialRepresentation));

        Response response = kc.realm("quarkus").users().create(userRepresentation);


        UserRegistrationResponse userRegistrationResponse = new UserRegistrationResponse();
        userRegistrationResponse.setAccessToken("access token wqerwqer");
        userRegistrationResponse.setExpiresIn(2383);
        userRegistrationResponse.setRefreshToken("refresh token asdfsadf");
        userRegistrationResponse.setRefreshExpiresIn(1000);
        userRegistrationResponse.setTokenType("bearer");

        return Response
                .status(201, "token created")
                .entity(userRegistrationResponse)
                .header(response.gethe)
                .build();

        //return response;
    }

    /*@GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/createUser")
    public Response adminCreateUser() {


        Keycloak kc = KeycloakBuilder.builder()
                .serverUrl("http://localhost:8180/auth")
                .realm("master")
                .clientId("admin-cli")
                .clientSecret("").username("admin").password("admin").build();

        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setUsername("shrestha.akash01@gmail.com");
        userRepresentation.setEmail("shrestha.akash01@gmail.com");
        userRepresentation.setEnabled(true);
        userRepresentation.setRequiredActions(Collections.singletonList("VERIFY_EMAIL"));

        CredentialRepresentation credentialRepresentation = new CredentialRepresentation();
        credentialRepresentation.setTemporary(true);
        credentialRepresentation.setType(CredentialRepresentation.PASSWORD);
        credentialRepresentation.setValue(userRepresentation.getUsername());
        userRepresentation.setCredentials(Collections.singletonList(credentialRepresentation));

        try {
            Response response = kc.realm("quarkus").users().create(userRepresentation);

            List<UserRepresentation> retrieveCreatedUserList = kc.realm("quarkus").users().search(userRepresentation.getUsername());

            if(response.getStatus() == 201) {
                kc.realm("quarkus").users().get(retrieveCreatedUserList.get(0).getId()).sendVerifyEmail();
            }
            return response;
        }catch(Exception e){
            e.printStackTrace();
            return Response.serverError().entity(e.toString()).build();
        }
    }*/

}
