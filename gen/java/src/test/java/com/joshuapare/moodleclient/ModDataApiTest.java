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
import org.openapitools.client.model.CoreContentbankRenameContent200Response;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ModChatGetChatsByCoursesRequest;
import org.openapitools.client.model.ModDataAddEntry200Response;
import org.openapitools.client.model.ModDataAddEntryRequest;
import org.openapitools.client.model.ModDataApproveEntryRequest;
import org.openapitools.client.model.ModDataDeleteEntry200Response;
import org.openapitools.client.model.ModDataDeleteEntryRequest;
import org.openapitools.client.model.ModDataDeleteSavedPresetRequest;
import org.openapitools.client.model.ModDataGetDataAccessInformation200Response;
import org.openapitools.client.model.ModDataGetDataAccessInformationRequest;
import org.openapitools.client.model.ModDataGetDatabasesByCourses200Response;
import org.openapitools.client.model.ModDataGetEntries200Response;
import org.openapitools.client.model.ModDataGetEntriesRequest;
import org.openapitools.client.model.ModDataGetEntry200Response;
import org.openapitools.client.model.ModDataGetEntryRequest;
import org.openapitools.client.model.ModDataGetFields200Response;
import org.openapitools.client.model.ModDataGetFieldsRequest;
import org.openapitools.client.model.ModDataGetMappingInformation200Response;
import org.openapitools.client.model.ModDataGetMappingInformationRequest;
import org.openapitools.client.model.ModDataSearchEntries200Response;
import org.openapitools.client.model.ModDataSearchEntriesRequest;
import org.openapitools.client.model.ModDataUpdateEntry200Response;
import org.openapitools.client.model.ModDataUpdateEntryRequest;
import org.openapitools.client.model.ModDataViewDatabaseRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModDataApi
 */
@Disabled
public class ModDataApiTest {

    private final ModDataApi api = new ModDataApi();

    /**
     * Adds a new entry.
     *
     * Adds a new entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataAddEntryTest() throws ApiException {
        ModDataAddEntryRequest modDataAddEntryRequest = null;
        ModDataAddEntry200Response response = api.modDataAddEntry(modDataAddEntryRequest);
        // TODO: test validations
    }

    /**
     * Approves or unapproves an entry.
     *
     * Approves or unapproves an entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataApproveEntryTest() throws ApiException {
        ModDataApproveEntryRequest modDataApproveEntryRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modDataApproveEntry(modDataApproveEntryRequest);
        // TODO: test validations
    }

    /**
     * Deletes an entry.
     *
     * Deletes an entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataDeleteEntryTest() throws ApiException {
        ModDataDeleteEntryRequest modDataDeleteEntryRequest = null;
        ModDataDeleteEntry200Response response = api.modDataDeleteEntry(modDataDeleteEntryRequest);
        // TODO: test validations
    }

    /**
     * Delete site user preset.
     *
     * Delete site user preset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataDeleteSavedPresetTest() throws ApiException {
        ModDataDeleteSavedPresetRequest modDataDeleteSavedPresetRequest = null;
        CoreContentbankRenameContent200Response response = api.modDataDeleteSavedPreset(modDataDeleteSavedPresetRequest);
        // TODO: test validations
    }

    /**
     * Return access information for a given database.
     *
     * Return access information for a given database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataGetDataAccessInformationTest() throws ApiException {
        ModDataGetDataAccessInformationRequest modDataGetDataAccessInformationRequest = null;
        ModDataGetDataAccessInformation200Response response = api.modDataGetDataAccessInformation(modDataGetDataAccessInformationRequest);
        // TODO: test validations
    }

    /**
     * Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
     *
     * Returns a list of database instances in a provided set of courses, if             no courses are provided then all the database instances the user has access to will be returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataGetDatabasesByCoursesTest() throws ApiException {
        ModChatGetChatsByCoursesRequest modChatGetChatsByCoursesRequest = null;
        ModDataGetDatabasesByCourses200Response response = api.modDataGetDatabasesByCourses(modChatGetChatsByCoursesRequest);
        // TODO: test validations
    }

    /**
     * Return the complete list of entries of the given database.
     *
     * Return the complete list of entries of the given database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataGetEntriesTest() throws ApiException {
        ModDataGetEntriesRequest modDataGetEntriesRequest = null;
        ModDataGetEntries200Response response = api.modDataGetEntries(modDataGetEntriesRequest);
        // TODO: test validations
    }

    /**
     * Return one entry record from the database, including contents optionally.
     *
     * Return one entry record from the database, including contents optionally.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataGetEntryTest() throws ApiException {
        ModDataGetEntryRequest modDataGetEntryRequest = null;
        ModDataGetEntry200Response response = api.modDataGetEntry(modDataGetEntryRequest);
        // TODO: test validations
    }

    /**
     * Return the list of configured fields for the given database.
     *
     * Return the list of configured fields for the given database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataGetFieldsTest() throws ApiException {
        ModDataGetFieldsRequest modDataGetFieldsRequest = null;
        ModDataGetFields200Response response = api.modDataGetFields(modDataGetFieldsRequest);
        // TODO: test validations
    }

    /**
     * Get importing information
     *
     * Get importing information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataGetMappingInformationTest() throws ApiException {
        ModDataGetMappingInformationRequest modDataGetMappingInformationRequest = null;
        ModDataGetMappingInformation200Response response = api.modDataGetMappingInformation(modDataGetMappingInformationRequest);
        // TODO: test validations
    }

    /**
     * Search for entries in the given database.
     *
     * Search for entries in the given database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataSearchEntriesTest() throws ApiException {
        ModDataSearchEntriesRequest modDataSearchEntriesRequest = null;
        ModDataSearchEntries200Response response = api.modDataSearchEntries(modDataSearchEntriesRequest);
        // TODO: test validations
    }

    /**
     * Updates an existing entry.
     *
     * Updates an existing entry.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataUpdateEntryTest() throws ApiException {
        ModDataUpdateEntryRequest modDataUpdateEntryRequest = null;
        ModDataUpdateEntry200Response response = api.modDataUpdateEntry(modDataUpdateEntryRequest);
        // TODO: test validations
    }

    /**
     * Simulate the view.php web interface data: trigger events, completion, etc...
     *
     * Simulate the view.php web interface data: trigger events, completion, etc...
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modDataViewDatabaseTest() throws ApiException {
        ModDataViewDatabaseRequest modDataViewDatabaseRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modDataViewDatabase(modDataViewDatabaseRequest);
        // TODO: test validations
    }

}