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
import { ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency } from './reportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency';
import { ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse } from './reportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse';

export class ReportCompetencyDataForReport200ResponseUsercompetenciesInner {
    'Competency'?: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency;
    'Usercompetencycourse'?: ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Competency",
            "baseName": "competency",
            "type": "ReportCompetencyDataForReport200ResponseUsercompetenciesInnerCompetency"
        },
        {
            "name": "Usercompetencycourse",
            "baseName": "usercompetencycourse",
            "type": "ReportCompetencyDataForReport200ResponseUsercompetenciesInnerUsercompetencycourse"
        }    ];

    static getAttributeTypeMap() {
        return ReportCompetencyDataForReport200ResponseUsercompetenciesInner.attributeTypeMap;
    }
}

