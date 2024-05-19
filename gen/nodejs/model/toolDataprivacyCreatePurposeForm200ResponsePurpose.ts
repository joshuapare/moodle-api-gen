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
import { ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner } from './toolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner';

export class ToolDataprivacyCreatePurposeForm200ResponsePurpose {
    /**
    * The purpose description.
    */
    'Description': string = '';
    /**
    * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
    */
    'Descriptionformat'?: number = 1;
    'Formattedlawfulbases': Array<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner>;
    /**
    * formattedretentionperiod
    */
    'Formattedretentionperiod': string = 'null';
    'Formattedsensitivedatareasons'?: Array<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner>;
    /**
    * id
    */
    'Id': number = 0;
    /**
    * Comma-separated IDs matching records in tool_dataprivacy_lawfulbasis.
    */
    'Lawfulbases': string = 'null';
    /**
    * The purpose name.
    */
    'Name': string = 'null';
    /**
    * Data retention with higher precedent over user\'s request to be forgotten.
    */
    'Protected': number = 0;
    /**
    * Retention period. ISO_8601 durations format (as in DateInterval format).
    */
    'Retentionperiod': string = '';
    /**
    * roleoverrides
    */
    'Roleoverrides': string = 'null';
    /**
    * Comma-separated IDs matching records in tool_dataprivacy_sensitive
    */
    'Sensitivedatareasons': string = '';
    /**
    * timecreated
    */
    'Timecreated': number = 0;
    /**
    * timemodified
    */
    'Timemodified': number = 0;
    /**
    * usermodified
    */
    'Usermodified': number = 0;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "Descriptionformat",
            "baseName": "descriptionformat",
            "type": "number"
        },
        {
            "name": "Formattedlawfulbases",
            "baseName": "formattedlawfulbases",
            "type": "Array<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner>"
        },
        {
            "name": "Formattedretentionperiod",
            "baseName": "formattedretentionperiod",
            "type": "string"
        },
        {
            "name": "Formattedsensitivedatareasons",
            "baseName": "formattedsensitivedatareasons",
            "type": "Array<ToolDataprivacyCreatePurposeForm200ResponsePurposeFormattedlawfulbasesInner>"
        },
        {
            "name": "Id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "Lawfulbases",
            "baseName": "lawfulbases",
            "type": "string"
        },
        {
            "name": "Name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "Protected",
            "baseName": "protected",
            "type": "number"
        },
        {
            "name": "Retentionperiod",
            "baseName": "retentionperiod",
            "type": "string"
        },
        {
            "name": "Roleoverrides",
            "baseName": "roleoverrides",
            "type": "string"
        },
        {
            "name": "Sensitivedatareasons",
            "baseName": "sensitivedatareasons",
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
            "name": "Usermodified",
            "baseName": "usermodified",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return ToolDataprivacyCreatePurposeForm200ResponsePurpose.attributeTypeMap;
    }
}

