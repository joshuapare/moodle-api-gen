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


export interface ToolDataprivacySetContextDefaultsRequest { 
    /**
     * The plugin name of the activity
     */
    Activity?: string;
    /**
     * The default category for the given context level
     */
    Category: number;
    /**
     * The context level
     */
    Contextlevel: number;
    /**
     * Whether to override existing instances with the defaults
     */
    Override?: boolean;
    /**
     * The default purpose for the given context level
     */
    Purpose: number;
}

