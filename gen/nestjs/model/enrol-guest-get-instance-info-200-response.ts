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
import { EnrolGuestGetInstanceInfo200ResponseInstanceinfo } from './enrol-guest-get-instance-info200-response-instanceinfo';


export interface EnrolGuestGetInstanceInfo200Response { 
    Instanceinfo: EnrolGuestGetInstanceInfo200ResponseInstanceinfo;
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

