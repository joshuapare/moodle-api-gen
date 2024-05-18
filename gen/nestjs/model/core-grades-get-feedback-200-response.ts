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


export interface CoreGradesGetFeedback200Response { 
    /**
     * Additional field for the user (email or ID number, for example)
     */
    Additionalfield: string;
    /**
     * The full feedback text
     */
    Feedbacktext: string;
    /**
     * Students name
     */
    Fullname: string;
    /**
     * Students picture
     */
    Picture: string;
    /**
     * Title of the grade item that the feedback is for
     */
    Title: string;
}
