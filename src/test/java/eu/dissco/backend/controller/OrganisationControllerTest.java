package eu.dissco.backend.controller;

import static eu.dissco.backend.util.TestUtils.ORGANISATION_NAME;
import static eu.dissco.backend.util.TestUtils.ORGANISATION_ROR;
import static eu.dissco.backend.util.TestUtils.givenOrganisationTuple;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import eu.dissco.backend.service.OrganisationService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
@ContextConfiguration(classes = {OrganisationController.class,
    RestResponseEntityExceptionHandler.class})
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

//  @Test
//  void testCreateDocument() throws Exception {
//    // Given
//    given(service.createNewDocument(any(OrganisationDocument.class))).willReturn(
//        TestUtils.givenCordraOrganisationDocument());
//
//    // When
//    var result = this.mockMvc.perform(post("/api/v1/organisation/document").content("{\n"
//        + "    \"organisation_id\": \"ror-id\",\n"
//        + "    \"document_title\": \"form-title\",\n"
//        + "    \"document_id\": \"form_id\",\n"
//        + "    \"document_type\": \"google or surveyMonkey\",\n"
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
