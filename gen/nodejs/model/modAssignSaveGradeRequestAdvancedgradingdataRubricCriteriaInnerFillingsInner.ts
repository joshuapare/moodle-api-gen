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

export class ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner {
    /**
    * criterion id
    */
    'Criterionid'?: number;
    /**
    * level id
    */
    'Levelid'?: number;
    /**
    * remark
    */
    'Remark'?: string;
    /**
    * remark format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'Remarkformat'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Criterionid",
            "baseName": "criterionid",
            "type": "number"
        },
        {
            "name": "Levelid",
            "baseName": "levelid",
            "type": "number"
        },
        {
            "name": "Remark",
            "baseName": "remark",
            "type": "string"
        },
        {
            "name": "Remarkformat",
            "baseName": "remarkformat",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ModAssignSaveGradeRequestAdvancedgradingdataRubricCriteriaInnerFillingsInner.attributeTypeMap;
    }
}

