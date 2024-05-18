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
import { CoreCompetencyCreatePlan200ResponseCommentarea } from './coreCompetencyCreatePlan200ResponseCommentarea';
import { CoreCompetencyCreatePlan200ResponseReviewer } from './coreCompetencyCreatePlan200ResponseReviewer';
import { CoreCompetencyCreatePlan200ResponseTemplate } from './coreCompetencyCreatePlan200ResponseTemplate';

export class CoreCompetencyCreatePlan200Response {
    /**
    * canbeedited
    */
    'canbeedited': boolean = null;
    /**
    * canmanage
    */
    'canmanage': boolean;
    /**
    * canrequestreview
    */
    'canrequestreview': boolean = null;
    /**
    * canreview
    */
    'canreview': boolean = null;
    'commentarea': CoreCompetencyCreatePlan200ResponseCommentarea;
    /**
    * description
    */
    'description': string = '';
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionformat'?: number = 1;
    /**
    * duedate
    */
    'duedate': number = 0;
    /**
    * duedateformatted
    */
    'duedateformatted': string = 'null';
    /**
    * id
    */
    'id': number = 0;
    /**
    * isactive
    */
    'isactive': boolean = null;
    /**
    * isapproveallowed
    */
    'isapproveallowed': boolean = null;
    /**
    * isbasedontemplate
    */
    'isbasedontemplate': boolean = null;
    /**
    * iscancelreviewrequestallowed
    */
    'iscancelreviewrequestallowed': boolean = null;
    /**
    * iscompleteallowed
    */
    'iscompleteallowed': boolean = null;
    /**
    * iscompleted
    */
    'iscompleted': boolean = null;
    /**
    * isdraft
    */
    'isdraft': boolean = null;
    /**
    * isinreview
    */
    'isinreview': boolean = null;
    /**
    * isreopenallowed
    */
    'isreopenallowed': boolean = null;
    /**
    * isrequestreviewallowed
    */
    'isrequestreviewallowed': boolean = null;
    /**
    * isstartreviewallowed
    */
    'isstartreviewallowed': boolean = null;
    /**
    * isstopreviewallowed
    */
    'isstopreviewallowed': boolean = null;
    /**
    * isunapproveallowed
    */
    'isunapproveallowed': boolean = null;
    /**
    * isunlinkallowed
    */
    'isunlinkallowed': boolean = null;
    /**
    * iswaitingforreview
    */
    'iswaitingforreview': boolean = null;
    /**
    * name
    */
    'name': string;
    /**
    * origtemplateid
    */
    'origtemplateid': number;
    'reviewer'?: CoreCompetencyCreatePlan200ResponseReviewer;
    /**
    * reviewerid
    */
    'reviewerid': number;
    /**
    * status
    */
    'status': number = 0;
    /**
    * statusname
    */
    'statusname': string = 'null';
    'template'?: CoreCompetencyCreatePlan200ResponseTemplate;
    /**
    * templateid
    */
    'templateid': number;
    /**
    * timecreated
    */
    'timecreated': number = 0;
    /**
    * timemodified
    */
    'timemodified': number = 0;
    /**
    * url
    */
    'url': string;
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
            "name": "canbeedited",
            "baseName": "canbeedited",
            "type": "boolean"
        },
        {
            "name": "canmanage",
            "baseName": "canmanage",
            "type": "boolean"
        },
        {
            "name": "canrequestreview",
            "baseName": "canrequestreview",
            "type": "boolean"
        },
        {
            "name": "canreview",
            "baseName": "canreview",
            "type": "boolean"
        },
        {
            "name": "commentarea",
            "baseName": "commentarea",
            "type": "CoreCompetencyCreatePlan200ResponseCommentarea"
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
            "name": "duedate",
            "baseName": "duedate",
            "type": "number"
        },
        {
            "name": "duedateformatted",
            "baseName": "duedateformatted",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "isactive",
            "baseName": "isactive",
            "type": "boolean"
        },
        {
            "name": "isapproveallowed",
            "baseName": "isapproveallowed",
            "type": "boolean"
        },
        {
            "name": "isbasedontemplate",
            "baseName": "isbasedontemplate",
            "type": "boolean"
        },
        {
            "name": "iscancelreviewrequestallowed",
            "baseName": "iscancelreviewrequestallowed",
            "type": "boolean"
        },
        {
            "name": "iscompleteallowed",
            "baseName": "iscompleteallowed",
            "type": "boolean"
        },
        {
            "name": "iscompleted",
            "baseName": "iscompleted",
            "type": "boolean"
        },
        {
            "name": "isdraft",
            "baseName": "isdraft",
            "type": "boolean"
        },
        {
            "name": "isinreview",
            "baseName": "isinreview",
            "type": "boolean"
        },
        {
            "name": "isreopenallowed",
            "baseName": "isreopenallowed",
            "type": "boolean"
        },
        {
            "name": "isrequestreviewallowed",
            "baseName": "isrequestreviewallowed",
            "type": "boolean"
        },
        {
            "name": "isstartreviewallowed",
            "baseName": "isstartreviewallowed",
            "type": "boolean"
        },
        {
            "name": "isstopreviewallowed",
            "baseName": "isstopreviewallowed",
            "type": "boolean"
        },
        {
            "name": "isunapproveallowed",
            "baseName": "isunapproveallowed",
            "type": "boolean"
        },
        {
            "name": "isunlinkallowed",
            "baseName": "isunlinkallowed",
            "type": "boolean"
        },
        {
            "name": "iswaitingforreview",
            "baseName": "iswaitingforreview",
            "type": "boolean"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "origtemplateid",
            "baseName": "origtemplateid",
            "type": "number"
        },
        {
            "name": "reviewer",
            "baseName": "reviewer",
            "type": "CoreCompetencyCreatePlan200ResponseReviewer"
        },
        {
            "name": "reviewerid",
            "baseName": "reviewerid",
            "type": "number"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "number"
        },
        {
            "name": "statusname",
            "baseName": "statusname",
            "type": "string"
        },
        {
            "name": "template",
            "baseName": "template",
            "type": "CoreCompetencyCreatePlan200ResponseTemplate"
        },
        {
            "name": "templateid",
            "baseName": "templateid",
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
            "name": "url",
            "baseName": "url",
            "type": "string"
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
        return CoreCompetencyCreatePlan200Response.attributeTypeMap;
    }
}
