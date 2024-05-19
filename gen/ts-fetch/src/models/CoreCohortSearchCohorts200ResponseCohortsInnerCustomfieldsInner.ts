/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner
 */
export interface CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner {
    /**
     * The name of the custom field
     * @type {string}
     * @memberof CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner
     */
    Name?: string;
    /**
     * The shortname of the custom field - to be able to build the field class in the code
     * @type {string}
     * @memberof CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner
     */
    Shortname?: string;
    /**
     * The type of the custom field - text field, checkbox...
     * @type {string}
     * @memberof CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner
     */
    Type?: string;
    /**
     * The value of the custom field
     * @type {string}
     * @memberof CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner
     */
    Value?: string;
    /**
     * The raw value of the custom field
     * @type {string}
     * @memberof CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner
     */
    Valueraw?: string;
}

/**
 * Check if a given object implements the CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner interface.
 */
export function instanceOfCoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner(value: object): boolean {
    return true;
}

export function CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInnerFromJSON(json: any): CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner {
    return CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInnerFromJSONTyped(json, false);
}

export function CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Name': json['name'] == null ? undefined : json['name'],
        'Shortname': json['shortname'] == null ? undefined : json['shortname'],
        'Type': json['type'] == null ? undefined : json['type'],
        'Value': json['value'] == null ? undefined : json['value'],
        'Valueraw': json['valueraw'] == null ? undefined : json['valueraw'],
    };
}

export function CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInnerToJSON(value?: CoreCohortSearchCohorts200ResponseCohortsInnerCustomfieldsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'name': value['Name'],
        'shortname': value['Shortname'],
        'type': value['Type'],
        'value': value['Value'],
        'valueraw': value['Valueraw'],
    };
}

