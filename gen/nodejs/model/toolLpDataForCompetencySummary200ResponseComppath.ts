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
import { ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework } from './reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework';
import { ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner } from './toolLpDataForCompetencySummary200ResponseComppathAncestorsInner';

export class ToolLpDataForCompetencySummary200ResponseComppath {
    'Ancestors': Array<ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner>;
    'Framework': ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework;
    /**
    * pagecontextid
    */
    'Pagecontextid': number;
    /**
    * pluginbaseurl
    */
    'Pluginbaseurl': string;
    /**
    * showlinks
    */
    'Showlinks': boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Ancestors",
            "baseName": "ancestors",
            "type": "Array<ToolLpDataForCompetencySummary200ResponseComppathAncestorsInner>"
        },
        {
            "name": "Framework",
            "baseName": "framework",
            "type": "ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework"
        },
        {
            "name": "Pagecontextid",
            "baseName": "pagecontextid",
            "type": "number"
        },
        {
            "name": "Pluginbaseurl",
            "baseName": "pluginbaseurl",
            "type": "string"
        },
        {
            "name": "Showlinks",
            "baseName": "showlinks",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForCompetencySummary200ResponseComppath.attributeTypeMap;
    }
}

