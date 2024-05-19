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
import type { CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide } from './CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide';
import {
    CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideFromJSON,
    CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideFromJSONTyped,
    CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideToJSON,
} from './CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide';
import type { CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric } from './CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric';
import {
    CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricFromJSON,
    CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricFromJSONTyped,
    CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricToJSON,
} from './CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric';

/**
 * 
 * @export
 * @interface CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
 */
export interface CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner {
    /**
     * copied from id
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Copiedfromid?: number;
    /**
     * description
     * @type {string}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Descriptionformat?: number;
    /**
     * 
     * @type {CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Guide?: CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuide;
    /**
     * definition id
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Id?: number;
    /**
     * method
     * @type {string}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Method?: string;
    /**
     * name
     * @type {string}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Name?: string;
    /**
     * 
     * @type {CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Rubric?: CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubric;
    /**
     * status
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Status?: number;
    /**
     * time copied
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Timecopied?: number;
    /**
     * creation time
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Timecreated?: number;
    /**
     * last modified time
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Timemodified?: number;
    /**
     * user who created definition
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Usercreated?: number;
    /**
     * user who modified definition
     * @type {number}
     * @memberof CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner
     */
    Usermodified?: number;
}

/**
 * Check if a given object implements the CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner interface.
 */
export function instanceOfCoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner(value: object): boolean {
    return true;
}

export function CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerFromJSON(json: any): CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner {
    return CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerFromJSONTyped(json, false);
}

export function CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Copiedfromid': json['copiedfromid'] == null ? undefined : json['copiedfromid'],
        'Description': json['description'] == null ? undefined : json['description'],
        'Descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'Guide': json['guide'] == null ? undefined : CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideFromJSON(json['guide']),
        'Id': json['id'] == null ? undefined : json['id'],
        'Method': json['method'] == null ? undefined : json['method'],
        'Name': json['name'] == null ? undefined : json['name'],
        'Rubric': json['rubric'] == null ? undefined : CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricFromJSON(json['rubric']),
        'Status': json['status'] == null ? undefined : json['status'],
        'Timecopied': json['timecopied'] == null ? undefined : json['timecopied'],
        'Timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Usercreated': json['usercreated'] == null ? undefined : json['usercreated'],
        'Usermodified': json['usermodified'] == null ? undefined : json['usermodified'],
    };
}

export function CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerToJSON(value?: CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'copiedfromid': value['Copiedfromid'],
        'description': value['Description'],
        'descriptionformat': value['Descriptionformat'],
        'guide': CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerGuideToJSON(value['Guide']),
        'id': value['Id'],
        'method': value['Method'],
        'name': value['Name'],
        'rubric': CoreGradingGetDefinitions200ResponseAreasInnerDefinitionsInnerRubricToJSON(value['Rubric']),
        'status': value['Status'],
        'timecopied': value['Timecopied'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'usercreated': value['Usercreated'],
        'usermodified': value['Usermodified'],
    };
}
