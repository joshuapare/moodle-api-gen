/**
 * Moodle Webservice API
 * Auto-generated OpenAPI spec for Moodle\'s Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner } from './mod-forum-get-discussion-posts200-response-ratinginfo-ratings-inner';
import { ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner } from './mod-forum-get-discussion-posts200-response-ratinginfo-scales-inner';


export interface ModForumGetDiscussionPosts200ResponseRatinginfo { 
    /**
     * Whether the user can view all the individual ratings.
     */
    Canviewall?: boolean;
    /**
     * Whether the user can view aggregate of ratings of others.
     */
    Canviewany?: boolean;
    /**
     * Context name.
     */
    Component: string;
    /**
     * Context id.
     */
    Contextid: number;
    /**
     * Rating area name.
     */
    Ratingarea: string;
    Ratings?: Array<ModForumGetDiscussionPosts200ResponseRatinginfoRatingsInner>;
    Scales?: Array<ModForumGetDiscussionPosts200ResponseRatinginfoScalesInner>;
}

