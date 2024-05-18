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
import org.openapitools.client.model.ModForumAddDiscussion200Response;
import org.openapitools.client.model.ModForumAddDiscussionPost200Response;
import org.openapitools.client.model.ModForumAddDiscussionPostRequest;
import org.openapitools.client.model.ModForumAddDiscussionRequest;
import org.openapitools.client.model.ModForumCanAddDiscussion200Response;
import org.openapitools.client.model.ModForumCanAddDiscussionRequest;
import org.openapitools.client.model.ModForumDeletePost200Response;
import org.openapitools.client.model.ModForumDeletePostRequest;
import org.openapitools.client.model.ModForumGetDiscussionPost200Response;
import org.openapitools.client.model.ModForumGetDiscussionPostRequest;
import org.openapitools.client.model.ModForumGetDiscussionPosts200Response;
import org.openapitools.client.model.ModForumGetDiscussionPostsByUserid200Response;
import org.openapitools.client.model.ModForumGetDiscussionPostsByUseridRequest;
import org.openapitools.client.model.ModForumGetDiscussionPostsRequest;
import org.openapitools.client.model.ModForumGetForumAccessInformation200Response;
import org.openapitools.client.model.ModForumGetForumAccessInformationRequest;
import org.openapitools.client.model.ModForumGetForumDiscussions200Response;
import org.openapitools.client.model.ModForumGetForumDiscussionsPaginated200Response;
import org.openapitools.client.model.ModForumGetForumDiscussionsPaginatedRequest;
import org.openapitools.client.model.ModForumGetForumDiscussionsRequest;
import org.openapitools.client.model.ModForumGetForumsByCoursesRequest;
import org.openapitools.client.model.ModForumPrepareDraftAreaForPost200Response;
import org.openapitools.client.model.ModForumPrepareDraftAreaForPostRequest;
import org.openapitools.client.model.ModForumSetLockState200Response;
import org.openapitools.client.model.ModForumSetLockStateRequest;
import org.openapitools.client.model.ModForumSetPinState200Response;
import org.openapitools.client.model.ModForumSetPinStateRequest;
import org.openapitools.client.model.ModForumSetSubscriptionState200Response;
import org.openapitools.client.model.ModForumSetSubscriptionStateRequest;
import org.openapitools.client.model.ModForumToggleFavouriteStateRequest;
import org.openapitools.client.model.ModForumUpdateDiscussionPost200Response;
import org.openapitools.client.model.ModForumUpdateDiscussionPostRequest;
import org.openapitools.client.model.ModForumViewForumDiscussionRequest;
import org.openapitools.client.model.ModForumViewForumRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModForumApi
 */
@Disabled
public class ModForumApiTest {

    private final ModForumApi api = new ModForumApi();

    /**
     * Add a new discussion into an existing forum.
     *
     * Add a new discussion into an existing forum.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumAddDiscussionTest() throws ApiException {
        ModForumAddDiscussionRequest modForumAddDiscussionRequest = null;
        ModForumAddDiscussion200Response response = api.modForumAddDiscussion(modForumAddDiscussionRequest);
        // TODO: test validations
    }

    /**
     * Create new posts into an existing discussion.
     *
     * Create new posts into an existing discussion.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumAddDiscussionPostTest() throws ApiException {
        ModForumAddDiscussionPostRequest modForumAddDiscussionPostRequest = null;
        ModForumAddDiscussionPost200Response response = api.modForumAddDiscussionPost(modForumAddDiscussionPostRequest);
        // TODO: test validations
    }

    /**
     * Check if the current user can add discussions in the given forum (and optionally for the given group).
     *
     * Check if the current user can add discussions in the given forum (and optionally for the given group).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumCanAddDiscussionTest() throws ApiException {
        ModForumCanAddDiscussionRequest modForumCanAddDiscussionRequest = null;
        ModForumCanAddDiscussion200Response response = api.modForumCanAddDiscussion(modForumCanAddDiscussionRequest);
        // TODO: test validations
    }

    /**
     * Deletes a post or a discussion completely when the post is the discussion topic.
     *
     * Deletes a post or a discussion completely when the post is the discussion topic.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumDeletePostTest() throws ApiException {
        ModForumDeletePostRequest modForumDeletePostRequest = null;
        ModForumDeletePost200Response response = api.modForumDeletePost(modForumDeletePostRequest);
        // TODO: test validations
    }

    /**
     * Get a particular discussion post.
     *
     * Get a particular discussion post.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumGetDiscussionPostTest() throws ApiException {
        ModForumGetDiscussionPostRequest modForumGetDiscussionPostRequest = null;
        ModForumGetDiscussionPost200Response response = api.modForumGetDiscussionPost(modForumGetDiscussionPostRequest);
        // TODO: test validations
    }

    /**
     * Returns a list of forum posts for a discussion.
     *
     * Returns a list of forum posts for a discussion.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumGetDiscussionPostsTest() throws ApiException {
        ModForumGetDiscussionPostsRequest modForumGetDiscussionPostsRequest = null;
        ModForumGetDiscussionPosts200Response response = api.modForumGetDiscussionPosts(modForumGetDiscussionPostsRequest);
        // TODO: test validations
    }

    /**
     * Returns a list of forum posts for a discussion for a user.
     *
     * Returns a list of forum posts for a discussion for a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumGetDiscussionPostsByUseridTest() throws ApiException {
        ModForumGetDiscussionPostsByUseridRequest modForumGetDiscussionPostsByUseridRequest = null;
        ModForumGetDiscussionPostsByUserid200Response response = api.modForumGetDiscussionPostsByUserid(modForumGetDiscussionPostsByUseridRequest);
        // TODO: test validations
    }

    /**
     * Return capabilities information for a given forum.
     *
     * Return capabilities information for a given forum.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumGetForumAccessInformationTest() throws ApiException {
        ModForumGetForumAccessInformationRequest modForumGetForumAccessInformationRequest = null;
        ModForumGetForumAccessInformation200Response response = api.modForumGetForumAccessInformation(modForumGetForumAccessInformationRequest);
        // TODO: test validations
    }

    /**
     * Returns a list of forum discussions optionally sorted and paginated.
     *
     * Returns a list of forum discussions optionally sorted and paginated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumGetForumDiscussionsTest() throws ApiException {
        ModForumGetForumDiscussionsRequest modForumGetForumDiscussionsRequest = null;
        ModForumGetForumDiscussions200Response response = api.modForumGetForumDiscussions(modForumGetForumDiscussionsRequest);
        // TODO: test validations
    }

    /**
     * ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.
     *
     * ** DEPRECATED ** Please do not call this function any more.                           Returns a list of forum discussions optionally sorted and paginated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumGetForumDiscussionsPaginatedTest() throws ApiException {
        ModForumGetForumDiscussionsPaginatedRequest modForumGetForumDiscussionsPaginatedRequest = null;
        ModForumGetForumDiscussionsPaginated200Response response = api.modForumGetForumDiscussionsPaginated(modForumGetForumDiscussionsPaginatedRequest);
        // TODO: test validations
    }

    /**
     * Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.
     *
     * Returns a list of forum instances in a provided set of courses, if             no courses are provided then all the forum instances the user has access to will be             returned.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumGetForumsByCoursesTest() throws ApiException {
        ModForumGetForumsByCoursesRequest modForumGetForumsByCoursesRequest = null;
        Object response = api.modForumGetForumsByCourses(modForumGetForumsByCoursesRequest);
        // TODO: test validations
    }

    /**
     * Prepares a draft area for editing a post.
     *
     * Prepares a draft area for editing a post.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumPrepareDraftAreaForPostTest() throws ApiException {
        ModForumPrepareDraftAreaForPostRequest modForumPrepareDraftAreaForPostRequest = null;
        ModForumPrepareDraftAreaForPost200Response response = api.modForumPrepareDraftAreaForPost(modForumPrepareDraftAreaForPostRequest);
        // TODO: test validations
    }

    /**
     * Set the lock state for the discussion
     *
     * Set the lock state for the discussion
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumSetLockStateTest() throws ApiException {
        ModForumSetLockStateRequest modForumSetLockStateRequest = null;
        ModForumSetLockState200Response response = api.modForumSetLockState(modForumSetLockStateRequest);
        // TODO: test validations
    }

    /**
     * Set the pin state
     *
     * Set the pin state
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumSetPinStateTest() throws ApiException {
        ModForumSetPinStateRequest modForumSetPinStateRequest = null;
        ModForumSetPinState200Response response = api.modForumSetPinState(modForumSetPinStateRequest);
        // TODO: test validations
    }

    /**
     * Set the subscription state
     *
     * Set the subscription state
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumSetSubscriptionStateTest() throws ApiException {
        ModForumSetSubscriptionStateRequest modForumSetSubscriptionStateRequest = null;
        ModForumSetSubscriptionState200Response response = api.modForumSetSubscriptionState(modForumSetSubscriptionStateRequest);
        // TODO: test validations
    }

    /**
     * Toggle the favourite state
     *
     * Toggle the favourite state
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumToggleFavouriteStateTest() throws ApiException {
        ModForumToggleFavouriteStateRequest modForumToggleFavouriteStateRequest = null;
        ModForumSetSubscriptionState200Response response = api.modForumToggleFavouriteState(modForumToggleFavouriteStateRequest);
        // TODO: test validations
    }

    /**
     * Updates a post or a discussion topic post.
     *
     * Updates a post or a discussion topic post.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumUpdateDiscussionPostTest() throws ApiException {
        ModForumUpdateDiscussionPostRequest modForumUpdateDiscussionPostRequest = null;
        ModForumUpdateDiscussionPost200Response response = api.modForumUpdateDiscussionPost(modForumUpdateDiscussionPostRequest);
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
    public void modForumViewForumTest() throws ApiException {
        ModForumViewForumRequest modForumViewForumRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modForumViewForum(modForumViewForumRequest);
        // TODO: test validations
    }

    /**
     * Trigger the forum discussion viewed event.
     *
     * Trigger the forum discussion viewed event.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void modForumViewForumDiscussionTest() throws ApiException {
        ModForumViewForumDiscussionRequest modForumViewForumDiscussionRequest = null;
        CoreCalendarDeleteSubscription200Response response = api.modForumViewForumDiscussion(modForumViewForumDiscussionRequest);
        // TODO: test validations
    }

}
