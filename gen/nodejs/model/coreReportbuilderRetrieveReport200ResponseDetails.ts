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
    'Area': string = '';
    /**
    * component
    */
    'Component': string = '';
    /**
    * conditiondata
    */
    'Conditiondata': string;
    /**
    * contextid
    */
    'Contextid': number = {};
    /**
    * id
    */
    'Id': number = 0;
    /**
    * itemid
    */
    'Itemid': number = 0;
    'Modifiedby': CoreCompetencyGradeCompetency200ResponseActionuser;
    /**
    * name
    */
    'Name': string;
    /**
    * settingsdata
    */
    'Settingsdata': string;
    /**
    * source
    */
    'Source': string;
    /**
    * sourcename
    */
    'Sourcename': string;
    /**
    * timecreated
    */
    'Timecreated': number = 0;
    /**
    * timemodified
    */
    'Timemodified': number = 0;
    /**
    * type
    */
    'Type': number;
    /**
    * uniquerows
    */
    'Uniquerows': boolean = false;
    /**
    * usercreated
    */
    'Usercreated': number = {};
    /**
    * usermodified
    */
    'Usermodified': number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Area",
            "baseName": "area",
            "type": "string"
        },
        {
            "name": "Component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "Conditiondata",
            "baseName": "conditiondata",
            "type": "string"
        },
        {
            "name": "Contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Itemid",
            "baseName": "itemid",
            "type": "number"
        },
        {
            "name": "Modifiedby",
            "baseName": "modifiedby",
            "type": "CoreCompetencyGradeCompetency200ResponseActionuser"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Settingsdata",
            "baseName": "settingsdata",
            "type": "string"
        },
        {
            "name": "Source",
            "baseName": "source",
            "type": "string"
        },
        {
            "name": "Sourcename",
            "baseName": "sourcename",
            "type": "string"
        },
        {
            "name": "Timecreated",
            "baseName": "timecreated",
            "type": "number"
        },
        {
            "name": "Timemodified",
            "baseName": "timemodified",
            "type": "number"
        },
        {
            "name": "Type",
            "baseName": "type",
            "type": "number"
        },
        {
            "name": "Uniquerows",
            "baseName": "uniquerows",
            "type": "boolean"
        },
        {
            "name": "Usercreated",
            "baseName": "usercreated",
            "type": "number"
        },
        {
            "name": "Usermodified",
            "baseName": "usermodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderRetrieveReport200ResponseDetails.attributeTypeMap;
    }
}

