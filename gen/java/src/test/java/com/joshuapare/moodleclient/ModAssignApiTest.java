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
import org.openapitools.client.model.ModAssignCopyPreviousAttemptRequest;
import org.openapitools.client.model.ModAssignGetAssignments200Response;
import org.openapitools.client.model.ModAssignGetAssignmentsRequest;
import org.openapitools.client.model.ModAssignGetGrades200Response;
import org.openapitools.client.model.ModAssignGetGradesRequest;
import org.openapitools.client.model.ModAssignGetParticipant200Response;
import org.openapitools.client.model.ModAssignGetParticipantRequest;
import org.openapitools.client.model.ModAssignGetSubmissionStatus200Response;
import org.openapitools.client.model.ModAssignGetSubmissionStatusRequest;
import org.openapitools.client.model.ModAssignGetSubmissions200Response;
import org.openapitools.client.model.ModAssignGetSubmissionsRequest;
import org.openapitools.client.model.ModAssignGetUserFlags200Response;
import org.openapitools.client.model.ModAssignGetUserFlagsRequest;
import org.openapitools.client.model.ModAssignGetUserMappings200Response;
import org.openapitools.client.model.ModAssignListParticipantsRequest;
import org.openapitools.client.model.ModAssignLockSubmissionsRequest;
import org.openapitools.client.model.ModAssignRevealIdentitiesRequest;
import org.openapitools.client.model.ModAssignRevertSubmissionsToDraftRequest;
import org.openapitools.client.model.ModAssignSaveGradeRequest;
import org.openapitools.client.model.ModAssignSaveGradesRequest;
import org.openapitools.client.model.ModAssignSaveSubmissionRequest;
import org.openapitools.client.model.ModAssignSaveUserExtensionsRequest;
import org.openapitools.client.model.ModAssignSetUserFlagsRequest;
import org.openapitools.client.model.ModAssignStartSubmission200Response;
import org.openapitools.client.model.ModAssignStartSubmissionRequest;
import org.openapitools.client.model.ModAssignSubmitForGradingRequest;
import org.openapitools.client.model.ModAssignSubmitGradingFormRequest;
import org.openapitools.client.model.ModAssignViewAssignRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModAssignApi
 */
@Disabled
public class ModAssignApiTest {

    private final ModAssignApi api = new ModAssignApi();

    /**
     * Copy a students previous attempt to a new attempt.
     *
     * Copy a students previous attempt to a new attempt.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignCopyPreviousAttemptTest() throws ApiException {
        ModAssignCopyPreviousAttemptRequest modAssignCopyPreviousAttemptRequest = null;
        Object response = api.modAssignCopyPreviousAttempt(modAssignCopyPreviousAttemptRequest);
        // TODO: test validations
    }

    /**
     * Returns the courses and assignments for the users capability
     *
     * Returns the courses and assignments for the users capability
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignGetAssignmentsTest() throws ApiException {
        ModAssignGetAssignmentsRequest modAssignGetAssignmentsRequest = null;
        ModAssignGetAssignments200Response response = api.modAssignGetAssignments(modAssignGetAssignmentsRequest);
        // TODO: test validations
    }

    /**
     * Returns grades from the assignment
     *
     * Returns grades from the assignment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignGetGradesTest() throws ApiException {
        ModAssignGetGradesRequest modAssignGetGradesRequest = null;
        ModAssignGetGrades200Response response = api.modAssignGetGrades(modAssignGetGradesRequest);
        // TODO: test validations
    }

    /**
     * Get a participant for an assignment, with some summary info about their submissions.
     *
     * Get a participant for an assignment, with some summary info about their submissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignGetParticipantTest() throws ApiException {
        ModAssignGetParticipantRequest modAssignGetParticipantRequest = null;
        ModAssignGetParticipant200Response response = api.modAssignGetParticipant(modAssignGetParticipantRequest);
        // TODO: test validations
    }

    /**
     * Returns information about an assignment submission status for a given user.
     *
     * Returns information about an assignment submission status for a given user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignGetSubmissionStatusTest() throws ApiException {
        ModAssignGetSubmissionStatusRequest modAssignGetSubmissionStatusRequest = null;
        ModAssignGetSubmissionStatus200Response response = api.modAssignGetSubmissionStatus(modAssignGetSubmissionStatusRequest);
        // TODO: test validations
    }

    /**
     * Returns the submissions for assignments
     *
     * Returns the submissions for assignments
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignGetSubmissionsTest() throws ApiException {
        ModAssignGetSubmissionsRequest modAssignGetSubmissionsRequest = null;
        ModAssignGetSubmissions200Response response = api.modAssignGetSubmissions(modAssignGetSubmissionsRequest);
        // TODO: test validations
    }

    /**
     * Returns the user flags for assignments
     *
     * Returns the user flags for assignments
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignGetUserFlagsTest() throws ApiException {
        ModAssignGetUserFlagsRequest modAssignGetUserFlagsRequest = null;
        ModAssignGetUserFlags200Response response = api.modAssignGetUserFlags(modAssignGetUserFlagsRequest);
        // TODO: test validations
    }

    /**
     * Returns the blind marking mappings for assignments
     *
     * Returns the blind marking mappings for assignments
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignGetUserMappingsTest() throws ApiException {
        ModAssignGetUserFlagsRequest modAssignGetUserFlagsRequest = null;
        ModAssignGetUserMappings200Response response = api.modAssignGetUserMappings(modAssignGetUserFlagsRequest);
        // TODO: test validations
    }

    /**
     * List the participants for a single assignment, with some summary info about their submissions.
     *
     * List the participants for a single assignment, with some summary info about their submissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignListParticipantsTest() throws ApiException {
        ModAssignListParticipantsRequest modAssignListParticipantsRequest = null;
        Object response = api.modAssignListParticipants(modAssignListParticipantsRequest);
        // TODO: test validations
    }

    /**
     * Prevent students from making changes to a list of submissions
     *
     * Prevent students from making changes to a list of submissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignLockSubmissionsTest() throws ApiException {
        ModAssignLockSubmissionsRequest modAssignLockSubmissionsRequest = null;
        Object response = api.modAssignLockSubmissions(modAssignLockSubmissionsRequest);
        // TODO: test validations
    }

    /**
     * Reveal the identities for a blind marking assignment
     *
     * Reveal the identities for a blind marking assignment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignRevealIdentitiesTest() throws ApiException {
        ModAssignRevealIdentitiesRequest modAssignRevealIdentitiesRequest = null;
        Object response = api.modAssignRevealIdentities(modAssignRevealIdentitiesRequest);
        // TODO: test validations
    }

    /**
     * Reverts the list of submissions to draft status
     *
     * Reverts the list of submissions to draft status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignRevertSubmissionsToDraftTest() throws ApiException {
        ModAssignRevertSubmissionsToDraftRequest modAssignRevertSubmissionsToDraftRequest = null;
        Object response = api.modAssignRevertSubmissionsToDraft(modAssignRevertSubmissionsToDraftRequest);
        // TODO: test validations
    }

    /**
     * Save a grade update for a single student.
     *
     * Save a grade update for a single student.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignSaveGradeTest() throws ApiException {
        ModAssignSaveGradeRequest modAssignSaveGradeRequest = null;
        Object response = api.modAssignSaveGrade(modAssignSaveGradeRequest);
        // TODO: test validations
    }

    /**
     * Save multiple grade updates for an assignment.
     *
     * Save multiple grade updates for an assignment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignSaveGradesTest() throws ApiException {
        ModAssignSaveGradesRequest modAssignSaveGradesRequest = null;
        Object response = api.modAssignSaveGrades(modAssignSaveGradesRequest);
        // TODO: test validations
    }

    /**
     * Update the current students submission
     *
     * Update the current students submission
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignSaveSubmissionTest() throws ApiException {
        ModAssignSaveSubmissionRequest modAssignSaveSubmissionRequest = null;
        Object response = api.modAssignSaveSubmission(modAssignSaveSubmissionRequest);
        // TODO: test validations
    }

    /**
     * Save a list of assignment extensions
     *
     * Save a list of assignment extensions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignSaveUserExtensionsTest() throws ApiException {
        ModAssignSaveUserExtensionsRequest modAssignSaveUserExtensionsRequest = null;
        Object response = api.modAssignSaveUserExtensions(modAssignSaveUserExtensionsRequest);
        // TODO: test validations
    }

    /**
     * Creates or updates user flags
     *
     * Creates or updates user flags
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignSetUserFlagsTest() throws ApiException {
        ModAssignSetUserFlagsRequest modAssignSetUserFlagsRequest = null;
        Object response = api.modAssignSetUserFlags(modAssignSetUserFlagsRequest);
        // TODO: test validations
    }

    /**
     * Start a submission for user if assignment has a time limit.
     *
     * Start a submission for user if assignment has a time limit.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignStartSubmissionTest() throws ApiException {
        ModAssignStartSubmissionRequest modAssignStartSubmissionRequest = null;
        ModAssignStartSubmission200Response response = api.modAssignStartSubmission(modAssignStartSubmissionRequest);
        // TODO: test validations
    }

    /**
     * Submit the current students assignment for grading
     *
     * Submit the current students assignment for grading
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignSubmitForGradingTest() throws ApiException {
        ModAssignSubmitForGradingRequest modAssignSubmitForGradingRequest = null;
        Object response = api.modAssignSubmitForGrading(modAssignSubmitForGradingRequest);
        // TODO: test validations
    }

    /**
     * Submit the grading form data via ajax
     *
     * Submit the grading form data via ajax
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignSubmitGradingFormTest() throws ApiException {
        ModAssignSubmitGradingFormRequest modAssignSubmitGradingFormRequest = null;
        Object response = api.modAssignSubmitGradingForm(modAssignSubmitGradingFormRequest);
        // TODO: test validations
    }

    /**
     * Allow students to make changes to a list of submissions
     *
     * Allow students to make changes to a list of submissions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignUnlockSubmissionsTest() throws ApiException {
        ModAssignRevertSubmissionsToDraftRequest modAssignRevertSubmissionsToDraftRequest = null;
        Object response = api.modAssignUnlockSubmissions(modAssignRevertSubmissionsToDraftRequest);
        // TODO: test validations
    }

    /**
     * Update the module completion status.
     *
     * Update the module completion status.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignViewAssignTest() throws ApiException {
        ModAssignViewAssignRequest modAssignViewAssignRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modAssignViewAssign(modAssignViewAssignRequest);
        // TODO: test validations
    }

    /**
     * Trigger the grading_table_viewed event.
     *
     * Trigger the grading_table_viewed event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignViewGradingTableTest() throws ApiException {
        ModAssignViewAssignRequest modAssignViewAssignRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modAssignViewGradingTable(modAssignViewAssignRequest);
        // TODO: test validations
    }

    /**
     * Trigger the submission status viewed event.
     *
     * Trigger the submission status viewed event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modAssignViewSubmissionStatusTest() throws ApiException {
        ModAssignViewAssignRequest modAssignViewAssignRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modAssignViewSubmissionStatus(modAssignViewAssignRequest);
        // TODO: test validations
    }

}