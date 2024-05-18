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


export interface AuthEmailSignupUserRequestCustomprofilefieldsInner { 
    /**
     * The name of the custom field
     */
    Name?: string;
    /**
     * The type of the custom field
     */
    Type?: string;
    /**
     * Custom field value, can be an encoded json if required
     */
    Value?: string;
}

