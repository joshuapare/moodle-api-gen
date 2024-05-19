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

export class ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan {
    /**
    * competencyid
    */
    'competencyid': number;
    /**
    * grade
    */
    'grade': number;
    /**
    * gradename
    */
    'gradename': string;
    /**
    * id
    */
    'id': number = 0;
    /**
    * planid
    */
    'planid': number;
    /**
    * proficiency
    */
    'proficiency': boolean;
    /**
    * proficiencyname
    */
    'proficiencyname': string;
    /**
    * sortorder
    */
    'sortorder': number = 0;
    /**
    * timecreated
    */
    'timecreated': number = 0;
    /**
    * timemodified
    */
    'timemodified': number = 0;
    /**
    * userid
    */
    'userid': number;
    /**
    * usermodified
    */
    'usermodified': number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "competencyid",
            "baseName": "competencyid",
            "type": "number"
        },
        {
            "name": "grade",
            "baseName": "grade",
            "type": "number"
        },
        {
            "name": "gradename",
            "baseName": "gradename",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "planid",
            "baseName": "planid",
            "type": "number"
        },
        {
            "name": "proficiency",
            "baseName": "proficiency",
            "type": "boolean"
        },
        {
            "name": "proficiencyname",
            "baseName": "proficiencyname",
            "type": "string"
        },
        {
            "name": "sortorder",
            "baseName": "sortorder",
            "type": "number"
        },
        {
            "name": "timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "usermodified",
            "baseName": "usermodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForUserCompetencySummary200ResponseUsercompetencyplan.attributeTypeMap;
    }
}

