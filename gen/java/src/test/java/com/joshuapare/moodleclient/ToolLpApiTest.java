/*
 * Moodle Webservice API
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.joshuapare.moodleclient;

import com.joshuapare.ApiException;
import org.openapitools.client.model.CoreCompetencyCompetencyViewedRequest;
import org.openapitools.client.model.CoreCompetencyCompletePlanRequest;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ToolLpDataForCompetenciesManagePage200Response;
import org.openapitools.client.model.ToolLpDataForCompetenciesManagePageRequest;
import org.openapitools.client.model.ToolLpDataForCompetencyFrameworksManagePage200Response;
import org.openapitools.client.model.ToolLpDataForCompetencyFrameworksManagePageRequest;
import org.openapitools.client.model.ToolLpDataForCompetencySummary200Response;
import org.openapitools.client.model.ToolLpDataForCompetencySummaryRequest;
import org.openapitools.client.model.ToolLpDataForCourseCompetenciesPage200Response;
import org.openapitools.client.model.ToolLpDataForCourseCompetenciesPageRequest;
import org.openapitools.client.model.ToolLpDataForPlanPage200Response;
import org.openapitools.client.model.ToolLpDataForPlansPage200Response;
import org.openapitools.client.model.ToolLpDataForPlansPageRequest;
import org.openapitools.client.model.ToolLpDataForRelatedCompetenciesSection200Response;
import org.openapitools.client.model.ToolLpDataForRelatedCompetenciesSectionRequest;
import org.openapitools.client.model.ToolLpDataForTemplateCompetenciesPage200Response;
import org.openapitools.client.model.ToolLpDataForTemplateCompetenciesPageRequest;
import org.openapitools.client.model.ToolLpDataForTemplatesManagePage200Response;
import org.openapitools.client.model.ToolLpDataForUserCompetencySummary200Response;
import org.openapitools.client.model.ToolLpDataForUserCompetencySummaryInCourse200Response;
import org.openapitools.client.model.ToolLpDataForUserCompetencySummaryInCourseRequest;
import org.openapitools.client.model.ToolLpDataForUserCompetencySummaryInPlan200Response;
import org.openapitools.client.model.ToolLpDataForUserCompetencySummaryInPlanRequest;
import org.openapitools.client.model.ToolLpDataForUserCompetencySummaryRequest;
import org.openapitools.client.model.ToolLpDataForUserEvidenceListPage200Response;
import org.openapitools.client.model.ToolLpDataForUserEvidenceListPageRequest;
import org.openapitools.client.model.ToolLpDataForUserEvidencePage200Response;
import org.openapitools.client.model.ToolLpDataForUserEvidencePageRequest;
import org.openapitools.client.model.ToolLpSearchCohorts200Response;
import org.openapitools.client.model.ToolLpSearchCohortsRequest;
import org.openapitools.client.model.ToolLpSearchUsers200Response;
import org.openapitools.client.model.ToolLpSearchUsersRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ToolLpApi
 */
@Disabled
public class ToolLpApiTest {

    private final ToolLpApi api = new ToolLpApi();

    /**
     * Load the data for the competencies manage page template
     *
     * Load the data for the competencies manage page template
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForCompetenciesManagePageTest() throws ApiException {
        ToolLpDataForCompetenciesManagePageRequest toolLpDataForCompetenciesManagePageRequest = null;
        ToolLpDataForCompetenciesManagePage200Response response = api.toolLpDataForCompetenciesManagePage(toolLpDataForCompetenciesManagePageRequest);
        // TODO: test validations
    }

    /**
     * Load the data for the competency frameworks manage page template
     *
     * Load the data for the competency frameworks manage page template
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForCompetencyFrameworksManagePageTest() throws ApiException {
        ToolLpDataForCompetencyFrameworksManagePageRequest toolLpDataForCompetencyFrameworksManagePageRequest = null;
        ToolLpDataForCompetencyFrameworksManagePage200Response response = api.toolLpDataForCompetencyFrameworksManagePage(toolLpDataForCompetencyFrameworksManagePageRequest);
        // TODO: test validations
    }

    /**
     * Load competency data for summary template.
     *
     * Load competency data for summary template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForCompetencySummaryTest() throws ApiException {
        ToolLpDataForCompetencySummaryRequest toolLpDataForCompetencySummaryRequest = null;
        ToolLpDataForCompetencySummary200Response response = api.toolLpDataForCompetencySummary(toolLpDataForCompetencySummaryRequest);
        // TODO: test validations
    }

    /**
     * Load the data for the course competencies page template.
     *
     * Load the data for the course competencies page template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForCourseCompetenciesPageTest() throws ApiException {
        ToolLpDataForCourseCompetenciesPageRequest toolLpDataForCourseCompetenciesPageRequest = null;
        ToolLpDataForCourseCompetenciesPage200Response response = api.toolLpDataForCourseCompetenciesPage(toolLpDataForCourseCompetenciesPageRequest);
        // TODO: test validations
    }

    /**
     * Load the data for the plan page template.
     *
     * Load the data for the plan page template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForPlanPageTest() throws ApiException {
        CoreCompetencyCompletePlanRequest coreCompetencyCompletePlanRequest = null;
        ToolLpDataForPlanPage200Response response = api.toolLpDataForPlanPage(coreCompetencyCompletePlanRequest);
        // TODO: test validations
    }

    /**
     * Load the data for the plans page template
     *
     * Load the data for the plans page template
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForPlansPageTest() throws ApiException {
        ToolLpDataForPlansPageRequest toolLpDataForPlansPageRequest = null;
        ToolLpDataForPlansPage200Response response = api.toolLpDataForPlansPage(toolLpDataForPlansPageRequest);
        // TODO: test validations
    }

    /**
     * Load the data for the related competencies template.
     *
     * Load the data for the related competencies template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForRelatedCompetenciesSectionTest() throws ApiException {
        ToolLpDataForRelatedCompetenciesSectionRequest toolLpDataForRelatedCompetenciesSectionRequest = null;
        ToolLpDataForRelatedCompetenciesSection200Response response = api.toolLpDataForRelatedCompetenciesSection(toolLpDataForRelatedCompetenciesSectionRequest);
        // TODO: test validations
    }

    /**
     * Load the data for the template competencies page template.
     *
     * Load the data for the template competencies page template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForTemplateCompetenciesPageTest() throws ApiException {
        ToolLpDataForTemplateCompetenciesPageRequest toolLpDataForTemplateCompetenciesPageRequest = null;
        ToolLpDataForTemplateCompetenciesPage200Response response = api.toolLpDataForTemplateCompetenciesPage(toolLpDataForTemplateCompetenciesPageRequest);
        // TODO: test validations
    }

    /**
     * Load the data for the learning plan templates manage page template
     *
     * Load the data for the learning plan templates manage page template
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForTemplatesManagePageTest() throws ApiException {
        ToolLpDataForCompetencyFrameworksManagePageRequest toolLpDataForCompetencyFrameworksManagePageRequest = null;
        ToolLpDataForTemplatesManagePage200Response response = api.toolLpDataForTemplatesManagePage(toolLpDataForCompetencyFrameworksManagePageRequest);
        // TODO: test validations
    }

    /**
     * Load a summary of a user competency.
     *
     * Load a summary of a user competency.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForUserCompetencySummaryTest() throws ApiException {
        ToolLpDataForUserCompetencySummaryRequest toolLpDataForUserCompetencySummaryRequest = null;
        ToolLpDataForUserCompetencySummary200Response response = api.toolLpDataForUserCompetencySummary(toolLpDataForUserCompetencySummaryRequest);
        // TODO: test validations
    }

    /**
     * Load a summary of a user competency.
     *
     * Load a summary of a user competency.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForUserCompetencySummaryInCourseTest() throws ApiException {
        ToolLpDataForUserCompetencySummaryInCourseRequest toolLpDataForUserCompetencySummaryInCourseRequest = null;
        ToolLpDataForUserCompetencySummaryInCourse200Response response = api.toolLpDataForUserCompetencySummaryInCourse(toolLpDataForUserCompetencySummaryInCourseRequest);
        // TODO: test validations
    }

    /**
     * Load a summary of a user competency.
     *
     * Load a summary of a user competency.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForUserCompetencySummaryInPlanTest() throws ApiException {
        ToolLpDataForUserCompetencySummaryInPlanRequest toolLpDataForUserCompetencySummaryInPlanRequest = null;
        ToolLpDataForUserCompetencySummaryInPlan200Response response = api.toolLpDataForUserCompetencySummaryInPlan(toolLpDataForUserCompetencySummaryInPlanRequest);
        // TODO: test validations
    }

    /**
     * Load the data for the user evidence list page template
     *
     * Load the data for the user evidence list page template
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForUserEvidenceListPageTest() throws ApiException {
        ToolLpDataForUserEvidenceListPageRequest toolLpDataForUserEvidenceListPageRequest = null;
        ToolLpDataForUserEvidenceListPage200Response response = api.toolLpDataForUserEvidenceListPage(toolLpDataForUserEvidenceListPageRequest);
        // TODO: test validations
    }

    /**
     * Load the data for the user evidence page template
     *
     * Load the data for the user evidence page template
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpDataForUserEvidencePageTest() throws ApiException {
        ToolLpDataForUserEvidencePageRequest toolLpDataForUserEvidencePageRequest = null;
        ToolLpDataForUserEvidencePage200Response response = api.toolLpDataForUserEvidencePage(toolLpDataForUserEvidencePageRequest);
        // TODO: test validations
    }

    /**
     * List the courses using a competency
     *
     * List the courses using a competency
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpListCoursesUsingCompetencyTest() throws ApiException {
        CoreCompetencyCompetencyViewedRequest coreCompetencyCompetencyViewedRequest = null;
        Object response = api.toolLpListCoursesUsingCompetency(coreCompetencyCompetencyViewedRequest);
        // TODO: test validations
    }

    /**
     * Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead
     *
     * Search for cohorts. This method is deprecated, please call &#39;core_cohort_search_cohorts&#39; instead
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpSearchCohortsTest() throws ApiException {
        ToolLpSearchCohortsRequest toolLpSearchCohortsRequest = null;
        ToolLpSearchCohorts200Response response = api.toolLpSearchCohorts(toolLpSearchCohortsRequest);
        // TODO: test validations
    }

    /**
     * Search for users.
     *
     * Search for users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toolLpSearchUsersTest() throws ApiException {
        ToolLpSearchUsersRequest toolLpSearchUsersRequest = null;
        ToolLpSearchUsers200Response response = api.toolLpSearchUsers(toolLpSearchUsersRequest);
        // TODO: test validations
    }

}
