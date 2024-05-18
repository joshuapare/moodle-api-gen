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
import { AuthEmailSignupUser200ResponseWarningsInner } from './authEmailSignupUser200ResponseWarningsInner';
import { GradereportUserGetGradeItems200ResponseUsergradesInner } from './gradereportUserGetGradeItems200ResponseUsergradesInner';

export class GradereportUserGetGradeItems200Response {
    'usergrades': Array<GradereportUserGetGradeItems200ResponseUsergradesInner>;
    'warnings'?: Array<AuthEmailSignupUser200ResponseWarningsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "usergrades",
            "baseName": "usergrades",
            "type": "Array<GradereportUserGetGradeItems200ResponseUsergradesInner>"
        },
        {
            "name": "warnings",
            "baseName": "warnings",
            "type": "Array<AuthEmailSignupUser200ResponseWarningsInner>"
        }    ];

    static getAttributeTypeMap() {
        return GradereportUserGetGradeItems200Response.attributeTypeMap;
    }
}

