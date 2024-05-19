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
import { CoreFilesGetFiles200ResponseFilesInner } from './core-files-get-files200-response-files-inner';
import { CoreFilesGetFiles200ResponseParentsInner } from './core-files-get-files200-response-parents-inner';


export interface CoreFilesGetFiles200Response { 
    Files: Array<CoreFilesGetFiles200ResponseFilesInner>;
    Parents: Array<CoreFilesGetFiles200ResponseParentsInner>;
}

