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
import { ModWorkshopGetGradesReport200ResponseReportGradesInner } from './mod-workshop-get-grades-report200-response-report-grades-inner';


export interface ModWorkshopGetGradesReport200ResponseReport { 
    Grades: Array<ModWorkshopGetGradesReport200ResponseReportGradesInner>;
    /**
     * Number of total submissions.
     */
    Totalcount: number;
}

