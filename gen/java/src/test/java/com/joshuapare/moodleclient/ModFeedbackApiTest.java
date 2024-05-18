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
import org.openapitools.client.model.CoreCalendarDeleteSubscription200Response;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest;
import org.openapitools.client.model.ModFeedbackGetAnalysis200Response;
import org.openapitools.client.model.ModFeedbackGetAnalysisRequest;
import org.openapitools.client.model.ModFeedbackGetCurrentCompletedTmp200Response;
import org.openapitools.client.model.ModFeedbackGetCurrentCompletedTmpRequest;
import org.openapitools.client.model.ModFeedbackGetFeedbackAccessInformation200Response;
import org.openapitools.client.model.ModFeedbackGetFeedbackAccessInformationRequest;
import org.openapitools.client.model.ModFeedbackGetFeedbacksByCourses200Response;
import org.openapitools.client.model.ModFeedbackGetFinishedResponses200Response;
import org.openapitools.client.model.ModFeedbackGetFinishedResponsesRequest;
import org.openapitools.client.model.ModFeedbackGetItems200Response;
import org.openapitools.client.model.ModFeedbackGetLastCompleted200Response;
import org.openapitools.client.model.ModFeedbackGetNonRespondents200Response;
import org.openapitools.client.model.ModFeedbackGetNonRespondentsRequest;
import org.openapitools.client.model.ModFeedbackGetPageItems200Response;
import org.openapitools.client.model.ModFeedbackGetPageItemsRequest;
import org.openapitools.client.model.ModFeedbackGetResponsesAnalysis200Response;
import org.openapitools.client.model.ModFeedbackGetResponsesAnalysisRequest;
import org.openapitools.client.model.ModFeedbackGetUnfinishedResponses200Response;
import org.openapitools.client.model.ModFeedbackLaunchFeedback200Response;
import org.openapitools.client.model.ModFeedbackProcessPage200Response;
import org.openapitools.client.model.ModFeedbackProcessPageRequest;
import org.openapitools.client.model.ModFeedbackViewFeedbackRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModFeedbackApi
 */
@Disabled
public class ModFeedbackApiTest {

    private final ModFeedbackApi api = new ModFeedbackApi();

    /**
     * Retrieves the feedback analysis.
     *
     * Retrieves the feedback analysis.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetAnalysisTest() throws ApiException {
        ModFeedbackGetAnalysisRequest modFeedbackGetAnalysisRequest = null;
        ModFeedbackGetAnalysis200Response response = api.modFeedbackGetAnalysis(modFeedbackGetAnalysisRequest);
        // TODO: test validations
    }

    /**
     * Returns the temporary completion record for the current user.
     *
     * Returns the temporary completion record for the current user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetCurrentCompletedTmpTest() throws ApiException {
        ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = null;
        ModFeedbackGetCurrentCompletedTmp200Response response = api.modFeedbackGetCurrentCompletedTmp(modFeedbackGetCurrentCompletedTmpRequest);
        // TODO: test validations
    }

    /**
     * Return access information for a given feedback.
     *
     * Return access information for a given feedback.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetFeedbackAccessInformationTest() throws ApiException {
        ModFeedbackGetFeedbackAccessInformationRequest modFeedbackGetFeedbackAccessInformationRequest = null;
        ModFeedbackGetFeedbackAccessInformation200Response response = api.modFeedbackGetFeedbackAccessInformation(modFeedbackGetFeedbackAccessInformationRequest);
        // TODO: test validations
    }

    /**
     * Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
     *
     * Returns a list of feedbacks in a provided list of courses, if no list is provided all feedbacks that                             the user can view will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetFeedbacksByCoursesTest() throws ApiException {
        ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest = null;
        ModFeedbackGetFeedbacksByCourses200Response response = api.modFeedbackGetFeedbacksByCourses(modBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest);
        // TODO: test validations
    }

    /**
     * Retrieves responses from the last finished attempt.
     *
     * Retrieves responses from the last finished attempt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetFinishedResponsesTest() throws ApiException {
        ModFeedbackGetFinishedResponsesRequest modFeedbackGetFinishedResponsesRequest = null;
        ModFeedbackGetFinishedResponses200Response response = api.modFeedbackGetFinishedResponses(modFeedbackGetFinishedResponsesRequest);
        // TODO: test validations
    }

    /**
     * Returns the items (questions) in the given feedback.
     *
     * Returns the items (questions) in the given feedback.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetItemsTest() throws ApiException {
        ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = null;
        ModFeedbackGetItems200Response response = api.modFeedbackGetItems(modFeedbackGetCurrentCompletedTmpRequest);
        // TODO: test validations
    }

    /**
     * Retrieves the last completion record for the current user.
     *
     * Retrieves the last completion record for the current user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetLastCompletedTest() throws ApiException {
        ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = null;
        ModFeedbackGetLastCompleted200Response response = api.modFeedbackGetLastCompleted(modFeedbackGetCurrentCompletedTmpRequest);
        // TODO: test validations
    }

    /**
     * Retrieves a list of students who didn&#39;t submit the feedback.
     *
     * Retrieves a list of students who didn&#39;t submit the feedback.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetNonRespondentsTest() throws ApiException {
        ModFeedbackGetNonRespondentsRequest modFeedbackGetNonRespondentsRequest = null;
        ModFeedbackGetNonRespondents200Response response = api.modFeedbackGetNonRespondents(modFeedbackGetNonRespondentsRequest);
        // TODO: test validations
    }

    /**
     * Get a single feedback page items.
     *
     * Get a single feedback page items.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetPageItemsTest() throws ApiException {
        ModFeedbackGetPageItemsRequest modFeedbackGetPageItemsRequest = null;
        ModFeedbackGetPageItems200Response response = api.modFeedbackGetPageItems(modFeedbackGetPageItemsRequest);
        // TODO: test validations
    }

    /**
     * Return the feedback user responses analysis.
     *
     * Return the feedback user responses analysis.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetResponsesAnalysisTest() throws ApiException {
        ModFeedbackGetResponsesAnalysisRequest modFeedbackGetResponsesAnalysisRequest = null;
        ModFeedbackGetResponsesAnalysis200Response response = api.modFeedbackGetResponsesAnalysis(modFeedbackGetResponsesAnalysisRequest);
        // TODO: test validations
    }

    /**
     * Retrieves responses from the current unfinished attempt.
     *
     * Retrieves responses from the current unfinished attempt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackGetUnfinishedResponsesTest() throws ApiException {
        ModFeedbackGetFinishedResponsesRequest modFeedbackGetFinishedResponsesRequest = null;
        ModFeedbackGetUnfinishedResponses200Response response = api.modFeedbackGetUnfinishedResponses(modFeedbackGetFinishedResponsesRequest);
        // TODO: test validations
    }

    /**
     * Starts or continues a feedback submission.
     *
     * Starts or continues a feedback submission.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackLaunchFeedbackTest() throws ApiException {
        ModFeedbackGetCurrentCompletedTmpRequest modFeedbackGetCurrentCompletedTmpRequest = null;
        ModFeedbackLaunchFeedback200Response response = api.modFeedbackLaunchFeedback(modFeedbackGetCurrentCompletedTmpRequest);
        // TODO: test validations
    }

    /**
     * Process a jump between pages.
     *
     * Process a jump between pages.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackProcessPageTest() throws ApiException {
        ModFeedbackProcessPageRequest modFeedbackProcessPageRequest = null;
        ModFeedbackProcessPage200Response response = api.modFeedbackProcessPage(modFeedbackProcessPageRequest);
        // TODO: test validations
    }

    /**
     * Trigger the course module viewed event and update the module completion status.
     *
     * Trigger the course module viewed event and update the module completion status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modFeedbackViewFeedbackTest() throws ApiException {
        ModFeedbackViewFeedbackRequest modFeedbackViewFeedbackRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modFeedbackViewFeedback(modFeedbackViewFeedbackRequest);
        // TODO: test validations
    }

}
