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

export class ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency {
    /**
    * canrequestreview
    */
    'Canrequestreview': boolean;
    /**
    * canreview
    */
    'Canreview': boolean;
    /**
    * competencyid
    */
    'Competencyid': number;
    /**
    * grade
    */
    'Grade': number;
    /**
    * gradename
    */
    'Gradename': string;
    /**
    * id
    */
    'Id': number = 0;
    /**
    * iscancelreviewrequestallowed
    */
    'Iscancelreviewrequestallowed': boolean;
    /**
    * isrequestreviewallowed
    */
    'Isrequestreviewallowed': boolean;
    /**
    * isstartreviewallowed
    */
    'Isstartreviewallowed': boolean;
    /**
    * isstatusidle
    */
    'Isstatusidle': boolean = null;
    /**
    * isstatusinreview
    */
    'Isstatusinreview': boolean = null;
    /**
    * isstatuswaitingforreview
    */
    'Isstatuswaitingforreview': boolean = null;
    /**
    * isstopreviewallowed
    */
    'Isstopreviewallowed': boolean;
    /**
    * proficiency
    */
    'Proficiency': boolean;
    /**
    * proficiencyname
    */
    'Proficiencyname': string;
    'Reviewer'?: CoreCompetencyGradeCompetency200ResponseActionuser;
    /**
    * reviewerid
    */
    'Reviewerid': number;
    /**
    * status
    */
    'Status': number = 0;
    /**
    * statusname
    */
    'Statusname': string;
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
    'Url': string;
    /**
    * userid
    */
    'Userid': number;
    /**
    * usermodified
    */
    'Usermodified': number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Canrequestreview",
            "baseName": "canrequestreview",
            "type": "boolean"
        },
        {
            "name": "Canreview",
            "baseName": "canreview",
            "type": "boolean"
        },
        {
            "name": "Competencyid",
            "baseName": "competencyid",
            "type": "number"
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
            "name": "Iscancelreviewrequestallowed",
            "baseName": "iscancelreviewrequestallowed",
            "type": "boolean"
        },
        {
            "name": "Isrequestreviewallowed",
            "baseName": "isrequestreviewallowed",
            "type": "boolean"
        },
        {
            "name": "Isstartreviewallowed",
            "baseName": "isstartreviewallowed",
            "type": "boolean"
        },
        {
            "name": "Isstatusidle",
            "baseName": "isstatusidle",
            "type": "boolean"
        },
        {
            "name": "Isstatusinreview",
            "baseName": "isstatusinreview",
            "type": "boolean"
        },
        {
            "name": "Isstatuswaitingforreview",
            "baseName": "isstatuswaitingforreview",
            "type": "boolean"
        },
        {
            "name": "Isstopreviewallowed",
            "baseName": "isstopreviewallowed",
            "type": "boolean"
        },
        {
            "name": "Proficiency",
            "baseName": "proficiency",
            "type": "boolean"
        },
        {
            "name": "Proficiencyname",
            "baseName": "proficiencyname",
            "type": "string"
        },
        {
            "name": "Reviewer",
            "baseName": "reviewer",
            "type": "CoreCompetencyGradeCompetency200ResponseActionuser"
        },
        {
            "name": "Reviewerid",
            "baseName": "reviewerid",
            "type": "number"
        },
        {
            "name": "Status",
            "baseName": "status",
            "type": "number"
        },
        {
            "name": "Statusname",
            "baseName": "statusname",
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
            "name": "Userid",
            "baseName": "userid",
            "type": "number"
        },
        {
            "name": "Usermodified",
            "baseName": "usermodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ToolLpDataForPlanPage200ResponseCompetenciesInnerUsercompetency.attributeTypeMap;
    }
}

