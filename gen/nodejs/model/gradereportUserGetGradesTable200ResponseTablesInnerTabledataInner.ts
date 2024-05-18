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

import { RequestFile } from './models';
import { GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage } from './gradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage';
import { GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal } from './gradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal';
import { GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname } from './gradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname';
import { GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader } from './gradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader';

/**
* table
*/
export class GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner {
    'average'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage;
    'contributiontocoursetotal'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    'feedback'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    'grade'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    'itemname'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname;
    'leader'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader;
    'lettergrade'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    'parentcategories'?: Array<object>;
    'percentage'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    'range'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    'rank'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;
    'weight'?: GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "average",
            "baseName": "average",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerAverage"
        },
        {
            "name": "contributiontocoursetotal",
            "baseName": "contributiontocoursetotal",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal"
        },
        {
            "name": "feedback",
            "baseName": "feedback",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal"
        },
        {
            "name": "grade",
            "baseName": "grade",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal"
        },
        {
            "name": "itemname",
            "baseName": "itemname",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerItemname"
        },
        {
            "name": "leader",
            "baseName": "leader",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerLeader"
        },
        {
            "name": "lettergrade",
            "baseName": "lettergrade",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal"
        },
        {
            "name": "parentcategories",
            "baseName": "parentcategories",
            "type": "Array<object>"
        },
        {
            "name": "percentage",
            "baseName": "percentage",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal"
        },
        {
            "name": "range",
            "baseName": "range",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal"
        },
        {
            "name": "rank",
            "baseName": "rank",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal"
        },
        {
            "name": "weight",
            "baseName": "weight",
            "type": "GradereportUserGetGradesTable200ResponseTablesInnerTabledataInnerContributiontocoursetotal"
        }    ];

    static getAttributeTypeMap() {
        return GradereportUserGetGradesTable200ResponseTablesInnerTabledataInner.attributeTypeMap;
    }
}

