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
import { ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner } from './toolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner';

export class ToolLpDataForPlansPage200Response {
    /**
    * Can the current user manage the user\'s plans
    */
    'canmanageuserplans': boolean = null;
    /**
    * Can the current user view the user\'s evidence
    */
    'canreaduserevidence': boolean = null;
    'navigation': Array<object>;
    'plans': Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner>;
    /**
    * Url to the tool_lp plugin folder on this Moodle site
    */
    'pluginbaseurl': string;
    /**
    * The learning plan user id
    */
    'userid': number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "canmanageuserplans",
            "baseName": "canmanageuserplans",
            "type": "boolean"
        },
        {
            "name": "canreaduserevidence",
            "baseName": "canreaduserevidence",
            "type": "boolean"
        },
        {
            "name": "navigation",
            "baseName": "navigation",
            "type": "Array<object>"
        },
        {
            "name": "plans",
            "baseName": "plans",
            "type": "Array<ToolLpDataForCourseCompetenciesPage200ResponseCompetenciesInnerPlansInner>"
        },
        {
            "name": "pluginbaseurl",
            "baseName": "pluginbaseurl",
            "type": "string"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForPlansPage200Response.attributeTypeMap;
    }
}
