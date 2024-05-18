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
import { CoreCohortSearchCohortsRequestContext } from './coreCohortSearchCohortsRequestContext';
import { CoreReportbuilderCanViewSystemReportRequestParametersInner } from './coreReportbuilderCanViewSystemReportRequestParametersInner';

export class CoreReportbuilderRetrieveSystemReportRequest {
    /**
    * Report area
    */
    'area'?: string = '';
    /**
    * Report component
    */
    'component'?: string = '';
    'context': CoreCohortSearchCohortsRequestContext;
    /**
    * Report item ID
    */
    'itemid'?: number = 0;
    /**
    * Page number
    */
    'page'?: number = 0;
    'parameters'?: Array<CoreReportbuilderCanViewSystemReportRequestParametersInner>;
    /**
    * Reports per page
    */
    'perpage'?: number = 10;
    /**
    * Report class path
    */
    'source': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "area",
            "baseName": "area",
            "type": "string"
        },
        {
            "name": "component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "context",
            "baseName": "context",
            "type": "CoreCohortSearchCohortsRequestContext"
        },
        {
            "name": "itemid",
            "baseName": "itemid",
            "type": "number"
        },
        {
            "name": "page",
            "baseName": "page",
            "type": "number"
        },
        {
            "name": "parameters",
            "baseName": "parameters",
            "type": "Array<CoreReportbuilderCanViewSystemReportRequestParametersInner>"
        },
        {
            "name": "perpage",
            "baseName": "perpage",
            "type": "number"
        },
        {
            "name": "source",
            "baseName": "source",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderRetrieveSystemReportRequest.attributeTypeMap;
    }
}

