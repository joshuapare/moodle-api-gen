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


export interface CoreFormDynamicForm200Response { 
    /**
     * JSON-encoded return data from form processing method
     */
    Data?: string;
    /**
     * HTML fragment of the form
     */
    Html?: string;
    /**
     * JavaScript fragment of the form
     */
    Javascript?: string;
    /**
     * If form was submitted and validated
     */
    Submitted: boolean;
}

