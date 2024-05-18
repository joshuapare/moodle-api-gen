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

export class CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner {
    /**
    * description
    */
    'description'?: string;
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionformat'?: number;
    /**
    * markers description
    */
    'descriptionmarkers'?: string;
    /**
    * descriptionmarkers format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionmarkersformat'?: number;
    /**
    * criterion id
    */
    'id'?: number;
    /**
    * maximum score
    */
    'maxscore'?: number;
    /**
    * description
    */
    'shortname'?: string;
    /**
    * sortorder
    */
    'sortorder'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
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
            "name": "descriptionmarkers",
            "baseName": "descriptionmarkers",
            "type": "string"
        },
        {
            "name": "descriptionmarkersformat",
            "baseName": "descriptionmarkersformat",
            "type": "number"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "maxscore",
            "baseName": "maxscore",
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
        }    ];

    static getAttributeTypeMap() {
        return CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideGuideCriteriaInner.attributeTypeMap;
    }
}

