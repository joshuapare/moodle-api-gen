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
import { BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner } from './blockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner';
import { BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense } from './blockIomadCompanyAdminGetLicenseFromId200ResponseLicense';

export class BlockIomadCompanyAdminGetLicenseFromId200Response {
    'courses': Array<BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner>;
    'license': BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "courses",
            "baseName": "courses",
            "type": "Array<BlockIomadCompanyAdminGetLicenseFromId200ResponseCoursesInner>"
        },
        {
            "name": "license",
            "baseName": "license",
            "type": "BlockIomadCompanyAdminGetLicenseFromId200ResponseLicense"
        }    ];

    static getAttributeTypeMap() {
        return BlockIomadCompanyAdminGetLicenseFromId200Response.attributeTypeMap;
    }
}
