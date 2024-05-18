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
import { AuthEmailSignupUser200ResponseWarningsInner } from './auth-email-signup-user200-response-warnings-inner';
import { CoreMessageGetMessages200ResponseMessagesInner } from './core-message-get-messages200-response-messages-inner';


export interface CoreMessageGetMessages200Response { 
    Messages: Array<CoreMessageGetMessages200ResponseMessagesInner>;
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

