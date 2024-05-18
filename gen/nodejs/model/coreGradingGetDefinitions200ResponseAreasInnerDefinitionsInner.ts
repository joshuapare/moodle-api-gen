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
import { CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide } from './coreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide';
import { CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric } from './coreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric';

export class CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner {
    /**
    * copied from id
    */
    'copiedfromid'?: number = null;
    /**
    * description
    */
    'description'?: string;
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionformat'?: number;
    'guide'?: CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide;
    /**
    * definition id
    */
    'id'?: number = null;
    /**
    * method
    */
    'method'?: string = 'null';
    /**
    * name
    */
    'name'?: string;
    'rubric'?: CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric;
    /**
    * status
    */
    'status'?: number = null;
    /**
    * time copied
    */
    'timecopied'?: number = null;
    /**
    * creation time
    */
    'timecreated'?: number = null;
    /**
    * last modified time
    */
    'timemodified'?: number = null;
    /**
    * user who created definition
    */
    'usercreated'?: number = null;
    /**
    * user who modified definition
    */
    'usermodified'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "copiedfromid",
            "baseName": "copiedfromid",
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
            "name": "guide",
            "baseName": "guide",
            "type": "CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "method",
            "baseName": "method",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "rubric",
            "baseName": "rubric",
            "type": "CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "number"
        },
        {
            "name": "timecopied",
            "baseName": "timecopied",
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
        return CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner.attributeTypeMap;
    }
}
