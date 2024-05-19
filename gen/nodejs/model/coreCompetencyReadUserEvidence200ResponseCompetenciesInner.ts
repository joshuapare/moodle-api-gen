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

export class CoreCompetencyReadUserEvidence200ResponseCompetenciesInner {
    /**
    * competencyframeworkid
    */
    'competencyframeworkid'?: number = 0;
    /**
    * description
    */
    'description'?: string = '';
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionformat'?: number = 1;
    /**
    * id
    */
    'id'?: number = 0;
    /**
    * idnumber
    */
    'idnumber'?: string;
    /**
    * parentid
    */
    'parentid'?: number = 0;
    /**
    * path
    */
    'path'?: string = '/0/';
    /**
    * ruleconfig
    */
    'ruleconfig'?: string;
    /**
    * ruleoutcome
    */
    'ruleoutcome'?: number = 0;
    /**
    * ruletype
    */
    'ruletype'?: string;
    /**
    * scaleconfiguration
    */
    'scaleconfiguration'?: string;
    /**
    * scaleid
    */
    'scaleid'?: number;
    /**
    * shortname
    */
    'shortname'?: string;
    /**
    * sortorder
    */
    'sortorder'?: number = 0;
    /**
    * timecreated
    */
    'timecreated'?: number = 0;
    /**
    * timemodified
    */
    'timemodified'?: number = 0;
    /**
    * usermodified
    */
    'usermodified'?: number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "competencyframeworkid",
            "baseName": "competencyframeworkid",
            "type": "number"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "descriptionformat",
            "baseName": "descriptionformat",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "parentid",
            "baseName": "parentid",
            "type": "number"
        },
        {
            "name": "path",
            "baseName": "path",
            "type": "string"
        },
        {
            "name": "ruleconfig",
            "baseName": "ruleconfig",
            "type": "string"
        },
        {
            "name": "ruleoutcome",
            "baseName": "ruleoutcome",
            "type": "number"
        },
        {
            "name": "ruletype",
            "baseName": "ruletype",
            "type": "string"
        },
        {
            "name": "scaleconfiguration",
            "baseName": "scaleconfiguration",
            "type": "string"
        },
        {
            "name": "scaleid",
            "baseName": "scaleid",
            "type": "number"
        },
        {
            "name": "shortname",
            "baseName": "shortname",
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
            "name": "usermodified",
            "baseName": "usermodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CoreCompetencyReadUserEvidence200ResponseCompetenciesInner.attributeTypeMap;
    }
}

