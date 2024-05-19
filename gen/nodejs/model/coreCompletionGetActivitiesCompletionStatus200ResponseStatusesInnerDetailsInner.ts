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
import { CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue } from './coreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue';

export class CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner {
    /**
    * Rule name
    */
    'Rulename'?: string = 'null';
    'Rulevalue'?: CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "Rulename",
            "baseName": "rulename",
            "type": "string"
        },
        {
            "name": "Rulevalue",
            "baseName": "rulevalue",
            "type": "CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInnerRulevalue"
        }    ];

    static getAttributeTypeMap() {
        return CoreCompletionGetActivitiesCompletionStatus200ResponseStatusesInnerDetailsInner.attributeTypeMap;
    }
}

