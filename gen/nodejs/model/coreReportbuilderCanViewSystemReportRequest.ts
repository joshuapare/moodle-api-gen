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

export class CoreReportbuilderCanViewSystemReportRequest {
    /**
    * Report area
    */
    'Area'?: string = '';
    /**
    * Report component
    */
    'Component'?: string = '';
    'Context': CoreCohortSearchCohortsRequestContext;
    /**
    * Report item ID
    */
    'Itemid'?: number = 0;
    'Parameters'?: Array<CoreReportbuilderCanViewSystemReportRequestParametersInner>;
    /**
    * Report class path
    */
    'Source': string = 'null';

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Area",
            "baseName": "area",
            "type": "string"
        },
        {
            "name": "Component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "Context",
            "baseName": "context",
            "type": "CoreCohortSearchCohortsRequestContext"
        },
        {
            "name": "Itemid",
            "baseName": "itemid",
            "type": "number"
        },
        {
            "name": "Parameters",
            "baseName": "parameters",
            "type": "Array<CoreReportbuilderCanViewSystemReportRequestParametersInner>"
        },
        {
            "name": "Source",
            "baseName": "source",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CoreReportbuilderCanViewSystemReportRequest.attributeTypeMap;
    }
}

