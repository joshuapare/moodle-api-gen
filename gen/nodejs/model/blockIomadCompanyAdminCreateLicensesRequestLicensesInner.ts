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
import { BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner } from './blockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner';

/**
* one or many licenses
*/
export class BlockIomadCompanyAdminCreateLicensesRequestLicensesInner {
    /**
    * Number of license slots
    */
    'allocation'?: number = null;
    /**
    * Clear license assignments on expire - 0 = no, 1 = yes
    */
    'clearonexpire'?: number = null;
    /**
    * Company id
    */
    'companyid'?: number = null;
    'courses'?: Array<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner>;
    /**
    * License cut off date (int = timestamp)
    */
    'cutoffdate'?: number = null;
    /**
    * License expiry date (int = timestamp)
    */
    'expirydate'?: number = null;
    /**
    * Instant access - 0 = no, 1 = yes
    */
    'instant'?: number = null;
    /**
    * License name
    */
    'name'?: string = 'null';
    /**
    * Parent license id
    */
    'parentid'?: number = null;
    /**
    * Program pf courses 0 = no, 1 = yes
    */
    'program'?: number = null;
    /**
    * License reference
    */
    'reference'?: string = 'null';
    /**
    * Date from which the liucense is available (int = timestamp) 
    */
    'startdate'?: number = null;
    /**
    * License type - 0 = standard, 1 = reusable, 2 = standard educator, 3 = reusable educator
    */
    'type'?: number = null;
    /**
    * Number how often the lic can be allocated
    */
    'used'?: number = null;
    /**
    * Course access length (days)
    */
    'validlength'?: number = null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "allocation",
            "baseName": "allocation",
            "type": "number"
        },
        {
            "name": "clearonexpire",
            "baseName": "clearonexpire",
            "type": "number"
        },
        {
            "name": "companyid",
            "baseName": "companyid",
            "type": "number"
        },
        {
            "name": "courses",
            "baseName": "courses",
            "type": "Array<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner>"
        },
        {
            "name": "cutoffdate",
            "baseName": "cutoffdate",
            "type": "number"
        },
        {
            "name": "expirydate",
            "baseName": "expirydate",
            "type": "number"
        },
        {
            "name": "instant",
            "baseName": "instant",
            "type": "number"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "parentid",
            "baseName": "parentid",
            "type": "number"
        },
        {
            "name": "program",
            "baseName": "program",
            "type": "number"
        },
        {
            "name": "reference",
            "baseName": "reference",
            "type": "string"
        },
        {
            "name": "startdate",
            "baseName": "startdate",
            "type": "number"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "number"
        },
        {
            "name": "used",
            "baseName": "used",
            "type": "number"
        },
        {
            "name": "validlength",
            "baseName": "validlength",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return BlockIomadCompanyAdminCreateLicensesRequestLicensesInner.attributeTypeMap;
    }
}
