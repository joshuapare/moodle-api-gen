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

export class CoreCompetencyReorderCourseCompetencyRequest {
    /**
    * The competency id we are moving
    */
    'competencyidfrom': number = null;
    /**
    * The competency id we are moving to
    */
    'competencyidto': number = null;
    /**
    * The course id
    */
    'courseid': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "competencyidfrom",
            "baseName": "competencyidfrom",
            "type": "number"
        },
        {
            "name": "competencyidto",
            "baseName": "competencyidto",
            "type": "number"
        },
        {
            "name": "courseid",
            "baseName": "courseid",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCompetencyReorderCourseCompetencyRequest.attributeTypeMap;
    }
}
