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
import { ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner } from './mod-assign-get-submission-status200-response-feedback-plugins-inner-fileareas-inner';
import { ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner } from './mod-assign-get-submission-status200-response-feedback-plugins-inner-editorfields-inner';


export interface ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInner { 
    Editorfields?: Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerEditorfieldsInner>;
    Fileareas?: Array<ModAssignGetSubmissionStatus200ResponseFeedbackPluginsInnerFileareasInner>;
    /**
     * submission plugin name
     */
    Name?: string;
    /**
     * submission plugin type
     */
    Type?: string;
}

