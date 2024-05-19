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

export class CoreCompetencyGradeCompetency200Response {
    /**
    * action
    */
    'Action': number = null;
    'Actionuser'?: CoreCompetencyGradeCompetency200ResponseActionuser;
    /**
    * actionuserid
    */
    'Actionuserid': number = null;
    /**
    * candelete
    */
    'Candelete': boolean;
    /**
    * contextid
    */
    'Contextid': number;
    /**
    * desca
    */
    'Desca': string = 'null';
    /**
    * desccomponent
    */
    'Desccomponent': string = 'null';
    /**
    * descidentifier
    */
    'Descidentifier': string = 'null';
    /**
    * description
    */
    'Description': string;
    /**
    * grade
    */
    'Grade': number = null;
    /**
    * gradename
    */
    'Gradename': string = 'null';
    /**
    * id
    */
    'Id': number = 0;
    /**
    * note
    */
    'Note': string = 'null';
    /**
    * timecreated
    */
    'Timecreated': number = 0;
    /**
    * timemodified
    */
    'Timemodified': number = 0;
    /**
    * url
    */
    'Url': string = 'null';
    /**
    * usercompetencyid
    */
    'Usercompetencyid': number = null;
    /**
    * userdate
    */
    'Userdate': string = 'null';
    /**
    * usermodified
    */
    'Usermodified': number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Action",
            "baseName": "action",
            "type": "number"
        },
        {
            "name": "Actionuser",
            "baseName": "actionuser",
            "type": "CoreCompetencyGradeCompetency200ResponseActionuser"
        },
        {
            "name": "Actionuserid",
            "baseName": "actionuserid",
            "type": "number"
        },
        {
            "name": "Candelete",
            "baseName": "candelete",
            "type": "boolean"
        },
        {
            "name": "Contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "Desca",
            "baseName": "desca",
            "type": "string"
        },
        {
            "name": "Desccomponent",
            "baseName": "desccomponent",
            "type": "string"
        },
        {
            "name": "Descidentifier",
            "baseName": "descidentifier",
            "type": "string"
        },
        {
            "name": "Description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "Grade",
            "baseName": "grade",
            "type": "number"
        },
        {
            "name": "Gradename",
            "baseName": "gradename",
            "type": "string"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Note",
            "baseName": "note",
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
            "name": "Url",
            "baseName": "url",
            "type": "string"
        },
        {
            "name": "Usercompetencyid",
            "baseName": "usercompetencyid",
            "type": "number"
        },
        {
            "name": "Userdate",
            "baseName": "userdate",
            "type": "string"
        },
        {
            "name": "Usermodified",
            "baseName": "usermodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCompetencyGradeCompetency200Response.attributeTypeMap;
    }
}

