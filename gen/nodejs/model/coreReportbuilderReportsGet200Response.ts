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
import { CoreReportbuilderColumnsDelete200Response } from './coreReportbuilderColumnsDelete200Response';
import { CoreReportbuilderConditionsDelete200Response } from './coreReportbuilderConditionsDelete200Response';
import { CoreReportbuilderFiltersDelete200Response } from './coreReportbuilderFiltersDelete200Response';
import { CoreReportbuilderReportsGet200ResponseAttributesInner } from './coreReportbuilderReportsGet200ResponseAttributesInner';
import { CoreReportbuilderReportsGet200ResponseCardview } from './coreReportbuilderReportsGet200ResponseCardview';
import { CoreReportbuilderReportsGet200ResponseSidebarmenucards } from './coreReportbuilderReportsGet200ResponseSidebarmenucards';

export class CoreReportbuilderReportsGet200Response {
    /**
    * area
    */
    'area': string = '';
    'attributes': Array<CoreReportbuilderReportsGet200ResponseAttributesInner>;
    'cardview'?: CoreReportbuilderReportsGet200ResponseCardview;
    /**
    * classes
    */
    'classes': string = 'null';
    /**
    * component
    */
    'component': string = '';
    /**
    * conditiondata
    */
    'conditiondata': string;
    'conditions'?: CoreReportbuilderConditionsDelete200Response;
    /**
    * contextid
    */
    'contextid': number = {};
    /**
    * editmode
    */
    'editmode': boolean = null;
    'filters'?: CoreReportbuilderFiltersDelete200Response;
    /**
    * filtersapplied
    */
    'filtersapplied': number = null;
    /**
    * filtersform
    */
    'filtersform': string = 'null';
    /**
    * filterspresent
    */
    'filterspresent': boolean = null;
    /**
    * id
    */
    'id': number = 0;
    /**
    * itemid
    */
    'itemid': number = 0;
    /**
    * javascript
    */
    'javascript': string;
    /**
    * name
    */
    'name': string;
    /**
    * settingsdata
    */
    'settingsdata': string;
    'sidebarmenucards'?: CoreReportbuilderReportsGet200ResponseSidebarmenucards;
    'sorting'?: CoreReportbuilderColumnsDelete200Response;
    /**
    * source
    */
    'source': string;
    /**
    * table
    */
    'table': string = 'null';
    /**
    * timecreated
    */
    'timecreated': number = 0;
    /**
    * timemodified
    */
    'timemodified': number = 0;
    /**
    * type
    */
    'type': number;
    /**
    * uniquerows
    */
    'uniquerows': boolean = false;
    /**
    * usercreated
    */
    'usercreated': number = {};
    /**
    * usermodified
    */
    'usermodified': number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "area",
            "baseName": "area",
            "type": "string"
        },
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "Array<CoreReportbuilderReportsGet200ResponseAttributesInner>"
        },
        {
            "name": "cardview",
            "baseName": "cardview",
            "type": "CoreReportbuilderReportsGet200ResponseCardview"
        },
        {
            "name": "classes",
            "baseName": "classes",
            "type": "string"
        },
        {
            "name": "component",
            "baseName": "component",
            "type": "string"
        },
        {
            "name": "conditiondata",
            "baseName": "conditiondata",
            "type": "string"
        },
        {
            "name": "conditions",
            "baseName": "conditions",
            "type": "CoreReportbuilderConditionsDelete200Response"
        },
        {
            "name": "contextid",
            "baseName": "contextid",
            "type": "number"
        },
        {
            "name": "editmode",
            "baseName": "editmode",
            "type": "boolean"
        },
        {
            "name": "filters",
            "baseName": "filters",
            "type": "CoreReportbuilderFiltersDelete200Response"
        },
        {
            "name": "filtersapplied",
            "baseName": "filtersapplied",
            "type": "number"
        },
        {
            "name": "filtersform",
            "baseName": "filtersform",
            "type": "string"
        },
        {
            "name": "filterspresent",
            "baseName": "filterspresent",
            "type": "boolean"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "itemid",
            "baseName": "itemid",
            "type": "number"
        },
        {
            "name": "javascript",
            "baseName": "javascript",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "settingsdata",
            "baseName": "settingsdata",
            "type": "string"
        },
        {
            "name": "sidebarmenucards",
            "baseName": "sidebarmenucards",
            "type": "CoreReportbuilderReportsGet200ResponseSidebarmenucards"
        },
        {
            "name": "sorting",
            "baseName": "sorting",
            "type": "CoreReportbuilderColumnsDelete200Response"
        },
        {
            "name": "source",
            "baseName": "source",
            "type": "string"
        },
        {
            "name": "table",
            "baseName": "table",
            "type": "string"
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
            "name": "type",
            "baseName": "type",
            "type": "number"
        },
        {
            "name": "uniquerows",
            "baseName": "uniquerows",
            "type": "boolean"
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
        return CoreReportbuilderReportsGet200Response.attributeTypeMap;
    }
}

