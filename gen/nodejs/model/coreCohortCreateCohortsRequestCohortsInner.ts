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
import { CoreCohortCreateCohortsRequestCohortsInnerCategorytype } from './coreCohortCreateCohortsRequestCohortsInnerCategorytype';
import { CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner } from './coreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner';

export class CoreCohortCreateCohortsRequestCohortsInner {
    'categorytype'?: CoreCohortCreateCohortsRequestCohortsInnerCategorytype;
    'customfields'?: Array<CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner>;
    /**
    * cohort description
    */
    'description'?: string = 'null';
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionformat'?: number = 1;
    /**
    * cohort idnumber
    */
    'idnumber'?: string = 'null';
    /**
    * cohort name
    */
    'name'?: string = 'null';
    /**
    * the cohort theme. The allowcohortthemes setting must be enabled on Moodle
    */
    'theme'?: string = 'null';
    /**
    * cohort visible
    */
    'visible'?: boolean = true;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "categorytype",
            "baseName": "categorytype",
            "type": "CoreCohortCreateCohortsRequestCohortsInnerCategorytype"
        },
        {
            "name": "customfields",
            "baseName": "customfields",
            "type": "Array<CoreCohortCreateCohortsRequestCohortsInnerCustomfieldsInner>"
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
            "name": "idnumber",
            "baseName": "idnumber",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "theme",
            "baseName": "theme",
            "type": "string"
        },
        {
            "name": "visible",
            "baseName": "visible",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return CoreCohortCreateCohortsRequestCohortsInner.attributeTypeMap;
    }
}
