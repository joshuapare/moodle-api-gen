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
import { ModDataUpdateEntry200ResponseFieldnotificationsInner } from './mod-data-update-entry200-response-fieldnotifications-inner';
import { AuthEmailSignupUser200ResponseWarningsInner } from './auth-email-signup-user200-response-warnings-inner';


export interface ModDataUpdateEntry200Response { 
    Fieldnotifications: Array<ModDataUpdateEntry200ResponseFieldnotificationsInner>;
    Generalnotifications: Array<object>;
    /**
     * True if the entry was successfully updated, false other wise.
     */
    Updated: boolean;
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}
