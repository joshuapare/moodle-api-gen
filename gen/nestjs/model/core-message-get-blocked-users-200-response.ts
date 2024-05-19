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
import { CoreMessageGetBlockedUsers200ResponseUsersInner } from './core-message-get-blocked-users200-response-users-inner';
import { AuthEmailSignupUser200ResponseWarningsInner } from './auth-email-signup-user200-response-warnings-inner';


export interface CoreMessageGetBlockedUsers200Response { 
    Users: Array<CoreMessageGetBlockedUsers200ResponseUsersInner>;
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

