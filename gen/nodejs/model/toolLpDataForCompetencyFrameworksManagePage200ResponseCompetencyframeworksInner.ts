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

export class ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner {
    /**
    * canmanage
    */
    'Canmanage'?: boolean;
    /**
    * competenciescount
    */
    'Competenciescount'?: number;
    /**
    * contextid
    */
    'Contextid'?: number;
    /**
    * contextname
    */
    'Contextname'?: string;
    /**
    * contextnamenoprefix
    */
    'Contextnamenoprefix'?: string;
    /**
    * description
    */
    'Description'?: string = '';
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'Descriptionformat'?: number = 1;
    /**
    * id
    */
    'Id'?: number = 0;
    /**
    * idnumber
    */
    'Idnumber'?: string;
    /**
    * scaleconfiguration
    */
    'Scaleconfiguration'?: string;
    /**
    * scaleid
    */
    'Scaleid'?: number;
    /**
    * shortname
    */
    'Shortname'?: string;
    /**
    * taxonomies
    */
    'Taxonomies'?: string = '';
    /**
    * timecreated
    */
    'Timecreated'?: number = 0;
    /**
    * timemodified
    */
    'Timemodified'?: number = 0;
    /**
    * usermodified
    */
    'Usermodified'?: number = 0;
    /**
    * visible
    */
    'Visible'?: boolean = 1;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Canmanage",
            "baseName": "canmanage",
            "type": "boolean"
        },
        {
            "name": "Competenciescount",
            "baseName": "competenciescount",
            "type": "number"
        },
        {
            "name": "Contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "Contextname",
            "baseName": "contextname",
            "type": "string"
        },
        {
            "name": "Contextnamenoprefix",
            "baseName": "contextnamenoprefix",
            "type": "string"
        },
        {
            "name": "Description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "Descriptionformat",
            "baseName": "descriptionformat",
            "type": "number"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "Scaleconfiguration",
            "baseName": "scaleconfiguration",
            "type": "string"
        },
        {
            "name": "Scaleid",
            "baseName": "scaleid",
            "type": "number"
        },
        {
            "name": "Shortname",
            "baseName": "shortname",
            "type": "string"
        },
        {
            "name": "Taxonomies",
            "baseName": "taxonomies",
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
            "name": "Usermodified",
            "baseName": "usermodified",
            "type": "number"
        },
        {
            "name": "Visible",
            "baseName": "visible",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForCompetencyFrameworksManagePage200ResponseCompetencyframeworksInner.attributeTypeMap;
    }
}

