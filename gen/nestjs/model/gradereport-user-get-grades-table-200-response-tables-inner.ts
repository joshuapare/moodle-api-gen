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
import { GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner } from './gradereport-user-get-grades-table200-response-tables-inner-tabledata-inner';


export interface GradereportUserGetGradesTable200ResponseTablesInner { 
    /**
     * course id
     */
    Courseid?: number;
    /**
     * table max depth (needed for printing it)
     */
    Maxdepth?: number;
    Tabledata?: Array<GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner>;
    /**
     * user fullname
     */
    Userfullname?: string;
    /**
     * user id
     */
    Userid?: number;
}
