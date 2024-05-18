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
import { CoreCohortUpdateCohortsRequestCohortsInnerCategorytype } from './coreCohortUpdateCohortsRequestCohortsInnerCategorytype';
import { CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner } from './coreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner';

export class CoreCohortUpdateCohortsRequestCohortsInner {
    'categorytype'?: CoreCohortUpdateCohortsRequestCohortsInnerCategorytype;
    'customfields'?: Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>;
    /**
    * cohort description
    */
    'description'?: string;
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'descriptionformat'?: number = 1;
    /**
    * ID of the cohort
    */
    'id'?: number;
    /**
    * cohort idnumber
    */
    'idnumber'?: string;
    /**
    * cohort name
    */
    'name'?: string;
    /**
    * the cohort theme. The allowcohortthemes setting must be enabled on Moodle
    */
    'theme'?: string;
    /**
    * cohort visible
    */
    'visible'?: boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "categorytype",
            "baseName": "categorytype",
            "type": "CoreCohortUpdateCohortsRequestCohortsInnerCategorytype"
        },
        {
            "name": "customfields",
            "baseName": "customfields",
            "type": "Array<CoreCohortUpdateCohortsRequestCohortsInnerCustomfieldsInner>"
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
        return CoreCohortUpdateCohortsRequestCohortsInner.attributeTypeMap;
    }
}

