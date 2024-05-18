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
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.LocalIomadLearningpathActivateRequest;
import org.openapitools.client.model.LocalIomadLearningpathAddcoursesRequest;
import org.openapitools.client.model.LocalIomadLearningpathAddusersRequest;
import org.openapitools.client.model.LocalIomadLearningpathCopypathRequest;
import org.openapitools.client.model.LocalIomadLearningpathGetcoursesRequest;
import org.openapitools.client.model.LocalIomadLearningpathGetprospectivecoursesRequest;
import org.openapitools.client.model.LocalIomadLearningpathGetprospectiveusersRequest;
import org.openapitools.client.model.LocalIomadLearningpathGetusersRequest;
import org.openapitools.client.model.LocalIomadLearningpathOrdercoursesRequest;
import org.openapitools.client.model.LocalIomadLearningpathRemovecoursesRequest;
import org.openapitools.client.model.LocalIomadLearningpathRemoveusersRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocalIomadLearningpathApi
 */
@Disabled
public class LocalIomadLearningpathApiTest {

    private final LocalIomadLearningpathApi api = new LocalIomadLearningpathApi();

    /**
     * Activates / deactivates learning path
     *
     * Activates / deactivates learning path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathActivateTest() throws ApiException {
        LocalIomadLearningpathActivateRequest localIomadLearningpathActivateRequest = null;
        Object response = api.localIomadLearningpathActivate(localIomadLearningpathActivateRequest);
        // TODO: test validations
    }

    /**
     * Add courses to learning path
     *
     * Add courses to learning path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathAddcoursesTest() throws ApiException {
        LocalIomadLearningpathAddcoursesRequest localIomadLearningpathAddcoursesRequest = null;
        Object response = api.localIomadLearningpathAddcourses(localIomadLearningpathAddcoursesRequest);
        // TODO: test validations
    }

    /**
     * Add users to learning path
     *
     * Add users to learning path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathAddusersTest() throws ApiException {
        LocalIomadLearningpathAddusersRequest localIomadLearningpathAddusersRequest = null;
        Object response = api.localIomadLearningpathAddusers(localIomadLearningpathAddusersRequest);
        // TODO: test validations
    }

    /**
     * Copy a learning path
     *
     * Copy a learning path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathCopypathTest() throws ApiException {
        LocalIomadLearningpathCopypathRequest localIomadLearningpathCopypathRequest = null;
        Object response = api.localIomadLearningpathCopypath(localIomadLearningpathCopypathRequest);
        // TODO: test validations
    }

    /**
     * Completely delete a learning path
     *
     * Completely delete a learning path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathDeletepathTest() throws ApiException {
        LocalIomadLearningpathCopypathRequest localIomadLearningpathCopypathRequest = null;
        Object response = api.localIomadLearningpathDeletepath(localIomadLearningpathCopypathRequest);
        // TODO: test validations
    }

    /**
     * Read list of courses for given learning
     *
     * Read list of courses for given learning
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathGetcoursesTest() throws ApiException {
        LocalIomadLearningpathGetcoursesRequest localIomadLearningpathGetcoursesRequest = null;
        Object response = api.localIomadLearningpathGetcourses(localIomadLearningpathGetcoursesRequest);
        // TODO: test validations
    }

    /**
     * Read set of filtered courses for given company
     *
     * Read set of filtered courses for given company
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathGetprospectivecoursesTest() throws ApiException {
        LocalIomadLearningpathGetprospectivecoursesRequest localIomadLearningpathGetprospectivecoursesRequest = null;
        Object response = api.localIomadLearningpathGetprospectivecourses(localIomadLearningpathGetprospectivecoursesRequest);
        // TODO: test validations
    }

    /**
     * Get set of filtered users for given company
     *
     * Get set of filtered users for given company
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathGetprospectiveusersTest() throws ApiException {
        LocalIomadLearningpathGetprospectiveusersRequest localIomadLearningpathGetprospectiveusersRequest = null;
        Object response = api.localIomadLearningpathGetprospectiveusers(localIomadLearningpathGetprospectiveusersRequest);
        // TODO: test validations
    }

    /**
     * Get users assigned to path
     *
     * Get users assigned to path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathGetusersTest() throws ApiException {
        LocalIomadLearningpathGetusersRequest localIomadLearningpathGetusersRequest = null;
        Object response = api.localIomadLearningpathGetusers(localIomadLearningpathGetusersRequest);
        // TODO: test validations
    }

    /**
     * Set sequence of courses in learning path
     *
     * Set sequence of courses in learning path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathOrdercoursesTest() throws ApiException {
        LocalIomadLearningpathOrdercoursesRequest localIomadLearningpathOrdercoursesRequest = null;
        Object response = api.localIomadLearningpathOrdercourses(localIomadLearningpathOrdercoursesRequest);
        // TODO: test validations
    }

    /**
     * Remove courses from learning path
     *
     * Remove courses from learning path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathRemovecoursesTest() throws ApiException {
        LocalIomadLearningpathRemovecoursesRequest localIomadLearningpathRemovecoursesRequest = null;
        Object response = api.localIomadLearningpathRemovecourses(localIomadLearningpathRemovecoursesRequest);
        // TODO: test validations
    }

    /**
     * Remove users from learning path
     *
     * Remove users from learning path
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void localIomadLearningpathRemoveusersTest() throws ApiException {
        LocalIomadLearningpathRemoveusersRequest localIomadLearningpathRemoveusersRequest = null;
        Object response = api.localIomadLearningpathRemoveusers(localIomadLearningpathRemoveusersRequest);
        // TODO: test validations
    }

}
