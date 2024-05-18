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
import { ModChatGetSessions200ResponseSessionsInnerSessionusersInner } from './mod-chat-get-sessions200-response-sessions-inner-sessionusers-inner';


export interface ModChatGetSessions200ResponseSessionsInner { 
    /**
     * Whether the session is completed or not.
     */
    Iscomplete?: boolean;
    /**
     * Session end time.
     */
    Sessionend?: number;
    /**
     * Session start time.
     */
    Sessionstart?: number;
    Sessionusers?: Array<ModChatGetSessions200ResponseSessionsInnerSessionusersInner>;
}

