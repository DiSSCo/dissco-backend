package eu.dissco.backend.controller;

import static eu.dissco.backend.util.TestUtils.COUNTRY_CODE;
import static eu.dissco.backend.util.TestUtils.COUNTRY_NAME;
import static eu.dissco.backend.util.TestUtils.ORGANISATION_NAME;
import static eu.dissco.backend.util.TestUtils.ORGANISATION_ROR;
import static eu.dissco.backend.util.TestUtils.givenCountry;
import static eu.dissco.backend.util.TestUtils.givenOrganisationTuple;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.c4_soft.springaddons.security.oauth2.test.mockmvc.AutoConfigureSecurityAddons;
import eu.dissco.backend.security.KeycloakConfig;
import eu.dissco.backend.security.MethodSecurityConfig;
import eu.dissco.backend.security.WebSecurityConfig;
import eu.dissco.backend.service.OrganisationService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
@ContextConfiguration(classes = {OrganisationController.class,
    RestResponseEntityExceptionHandler.class})
@ComponentScan(basePackageClasses = {KeycloakSpringBootConfigResolver.class})
@Import({WebSecurityConfig.class})
class OrganisationControllerTest {

  @Autowired
  private MockMvc mockMvc;
  @MockBean
  private OrganisationService service;

  @Test
  void testGetOrganisationNames() throws Exception {
    // Given
    given(service.getNames()).willReturn(
        List.of(ORGANISATION_NAME));

    // When
    var result = this.mockMvc.perform(get("/api/v1/organisation/names"));

    // Then
    result.andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(jsonPath("$.[0]").value(ORGANISATION_NAME));
  }

  @Test
  void testGetOrganisationTuples() throws Exception {
    // Given
    given(service.getTuples()).willReturn(
        List.of(givenOrganisationTuple()));

    // When
    var result = this.mockMvc.perform(get("/api/v1/organisation/tuples"));

    // Then
    result.andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(jsonPath("$.[0].name").value(ORGANISATION_NAME))
        .andExpect(jsonPath("$.[0].ror").value(ORGANISATION_ROR));
  }

  @Test
  void testGetOrganisationCountries() throws Exception {
    // Given
    given(service.getCountries()).willReturn(
        List.of(givenCountry()));

    // When
    var result = this.mockMvc.perform(get("/api/v1/organisation/countries"));

    // Then
    result.andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
        .andExpect(jsonPath("$.[0].country").value(COUNTRY_NAME))
        .andExpect(jsonPath("$.[0].countryCode").value(COUNTRY_CODE));
  }

//  @Test
//  void testCreateDocument() throws Exception {
//    // Given
//    given(service.createNewDocument(any(OrganisationDocument.class))).willReturn(
//        TestUtils.givenOrganisationDocument());
//
//    // When
//    var result = this.mockMvc.perform(post("/api/v1/organisation/document").content("{\n"
//        + "    \"organisation_id\": \"https://ror.org/01tv5y993\",\n"
//        + "    \"document_title\": \"form-title\",\n"
//        + "    \"document_id\": \"form_id\",\n"
//        + "    \"document_type\": \"Google form\",\n"
//        + "    \"document\": {\n"
//        + "        \"array\": [\n"
//        + "            {\n"
//        + "                \"field1\": \"Yes\"\n"
//        + "            }\n"
//        + "        ]\n"
//        + "    }\n"
//        + "}").contentType(MediaType.APPLICATION_JSON));
//
//    // Then
//    result.andExpect(status().isCreated())
//        .andExpect(content().string("test/123"));
//  }


}
