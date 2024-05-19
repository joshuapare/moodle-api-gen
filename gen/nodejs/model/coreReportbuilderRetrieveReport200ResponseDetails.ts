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
import { CoreCompetencyGradeCompetency200ResponseActionuser } from './coreCompetencyGradeCompetency200ResponseActionuser';

export class CoreReportbuilderRetrieveReport200ResponseDetails {
    /**
    * area
    */
    'area': string = '';
    /**
    * component
    */
    'component': string = '';
    /**
    * conditiondata
    */
    'conditiondata': string;
    /**
    * contextid
    */
    'contextid': number = {};
    /**
    * id
    */
    'id': number = 0;
    /**
    * itemid
    */
    'itemid': number = 0;
    'modifiedby': CoreCompetencyGradeCompetency200ResponseActionuser;
    /**
    * name
    */
    'name': string;
    /**
    * settingsdata
    */
    'settingsdata': string;
    /**
    * source
    */
    'source': string;
    /**
    * sourcename
    */
    'sourcename': string;
    /**
    * timecreated
    */
    'timecreated': number = 0;
    /**
    * timemodified
    */
    'timemodified': number = 0;
    /**
    * type
    */
    'type': number;
    /**
    * uniquerows
    */
    'uniquerows': boolean = false;
    /**
    * usercreated
    */
    'usercreated': number = {};
    /**
    * usermodified
    */
    'usermodified': number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "area",
            "baseName": "area",
            "type": "string"
        },
        {
            "name": "component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "conditiondata",
            "baseName": "conditiondata",
            "type": "string"
        },
        {
            "name": "contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "itemid",
            "baseName": "itemid",
            "type": "number"
        },
        {
            "name": "modifiedby",
            "baseName": "modifiedby",
            "type": "CoreCompetencyGradeCompetency200ResponseActionuser"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "settingsdata",
            "baseName": "settingsdata",
            "type": "string"
        },
        {
            "name": "source",
            "baseName": "source",
            "type": "string"
        },
        {
            "name": "sourcename",
            "baseName": "sourcename",
            "type": "string"
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
            "name": "type",
            "baseName": "type",
            "type": "number"
        },
        {
            "name": "uniquerows",
            "baseName": "uniquerows",
            "type": "boolean"
        },
        {
            "name": "usercreated",
            "baseName": "usercreated",
            "type": "number"
        },
        {
            "name": "usermodified",
            "baseName": "usermodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderRetrieveReport200ResponseDetails.attributeTypeMap;
    }
}

