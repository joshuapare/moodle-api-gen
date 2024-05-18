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
import { ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner } from './mod-forum-add-discussion-post200-response-post-author-groups-inner';
import { ModForumAddDiscussionPost200ResponsePostAuthorUrls } from './mod-forum-add-discussion-post200-response-post-author-urls';


export interface ModForumAddDiscussionPost200ResponsePostAuthor { 
    /**
     * fullname
     */
    Fullname?: string;
    Groups?: Array<ModForumAddDiscussionPost200ResponsePostAuthorGroupsInner>;
    /**
     * id
     */
    Id?: number;
    /**
     * isdeleted
     */
    Isdeleted?: boolean;
    Urls: ModForumAddDiscussionPost200ResponsePostAuthorUrls;
}
