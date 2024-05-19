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


export interface CoreGradesGetGradableUsers200ResponseUsersInnerCustomfieldsInner { 
    /**
     * The value of the custom field for display
     */
    Displayvalue?: string;
    /**
     * The name of the custom field
     */
    Name?: string;
    /**
     * The shortname of the custom field - to be able to build the field class in the code
     */
    Shortname?: string;
    /**
     * The type of the custom field - text field, checkbox...
     */
    Type?: string;
    /**
     * The value of the custom field (as stored in the database)
     */
    Value?: string;
}

