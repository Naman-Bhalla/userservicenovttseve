package com.scaler.userservicenovttseve;


import com.scaler.userservicenovttseve.security.models.Client;
import com.scaler.userservicenovttseve.security.repositories.ClientRepository;
import com.scaler.userservicenovttseve.security.repositories.JpaRegisteredClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.settings.ClientSettings;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

import java.util.List;
import java.util.UUID;

@SpringBootTest
public class InsertRegisteredClientTest {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JpaRegisteredClientRepository jpaRegisteredClientRepository;

    @Test
//    @Commit
    public void insertNewClientToDb() {
//        RegisteredClient oidcClient = RegisteredClient.withId(UUID.randomUUID().toString())
//                .clientId("productservice")
//                .clientSecret(passwordEncoder.encode("productservicepassword"))
//                .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
//                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//                .authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
//                .redirectUri("https://oauth.pstmn.io/v1/callback")
//                .postLogoutRedirectUri("http://127.0.0.1:8080/")
//                .scope(OidcScopes.OPENID)
//                .scope(OidcScopes.PROFILE)
//                .clientSettings(ClientSettings.builder().requireAuthorizationConsent(true).build())
//                .build();
//
//        jpaRegisteredClientRepository.save(oidcClient);
    }
}
