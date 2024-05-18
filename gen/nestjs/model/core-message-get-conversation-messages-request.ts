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


export interface CoreMessageGetConversationMessagesRequest { 
    /**
     * The conversation id
     */
    Convid: number;
    /**
     * The current user\'s id
     */
    Currentuserid: number;
    /**
     * Limit from
     */
    Limitfrom?: number;
    /**
     * Limit number
     */
    Limitnum?: number;
    /**
     * Newest first?
     */
    Newest?: boolean;
    /**
     * The timestamp from which the messages were created
     */
    Timefrom?: number;
}
