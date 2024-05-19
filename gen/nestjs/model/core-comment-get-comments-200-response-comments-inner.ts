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


/**
 * comment
 */
export interface CoreCommentGetComments200ResponseCommentsInner { 
    /**
     * HTML user picture
     */
    Avatar?: string;
    /**
     * The content text formatted
     */
    Content?: string;
    /**
     * Permission to delete=true/false
     */
    Delete?: boolean;
    /**
     * content format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     */
    Format?: number;
    /**
     * fullname
     */
    Fullname?: string;
    /**
     * Comment ID
     */
    Id?: number;
    /**
     * URL profile
     */
    Profileurl?: string;
    /**
     * Time format
     */
    Strftimeformat?: string;
    /**
     * Time in human format
     */
    Time?: string;
    /**
     * Time created (timestamp)
     */
    Timecreated?: number;
    /**
     * User ID
     */
    Userid?: number;
}

