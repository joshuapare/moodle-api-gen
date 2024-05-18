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
import { ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner } from './reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner';
import { ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework } from './reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework';

export class ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath {
    'ancestors': Array<ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner>;
    'framework': ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework;
    /**
    * pagecontextid
    */
    'pagecontextid': number = null;
    /**
    * pluginbaseurl
    */
    'pluginbaseurl': string = 'null';
    /**
    * showlinks
    */
    'showlinks': boolean = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "ancestors",
            "baseName": "ancestors",
            "type": "Array<ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathAncestorsInner>"
        },
        {
            "name": "framework",
            "baseName": "framework",
            "type": "ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppathFramework"
        },
        {
            "name": "pagecontextid",
            "baseName": "pagecontextid",
            "type": "number"
        },
        {
            "name": "pluginbaseurl",
            "baseName": "pluginbaseurl",
            "type": "string"
        },
        {
            "name": "showlinks",
            "baseName": "showlinks",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetencyComppath.attributeTypeMap;
    }
}
