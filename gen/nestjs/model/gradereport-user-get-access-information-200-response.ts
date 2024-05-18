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


export interface GradereportUserGetAccessInformation200Response { 
    /**
     * Whether the user can view all users grades in the course.
     */
    Canviewallgrades: boolean;
    /**
     * Whether the user can view his grades in the course.
     */
    Canviewmygrades: boolean;
    /**
     * Whether the user can view the user grade report.
     */
    Canviewusergradereport: boolean;
    Warnings?: Array<AuthEmailSignupUser200ResponseWarningsInner>;
}

