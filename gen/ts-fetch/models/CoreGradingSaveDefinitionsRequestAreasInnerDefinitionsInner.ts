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
import type { CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide } from './CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide';
import {
    CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideFromJSON,
    CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideFromJSONTyped,
    CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideToJSON,
} from './CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide';
import type { CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric } from './CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric';
import {
    CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricFromJSON,
    CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricFromJSONTyped,
    CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricToJSON,
} from './CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric';

/**
 * 
 * @export
 * @interface CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
 */
export interface CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner {
    /**
     * copied from id
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    copiedfromid?: number;
    /**
     * description
     * @type {string}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    descriptionformat?: number;
    /**
     * 
     * @type {CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    guide?: CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide;
    /**
     * definition id
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    id?: number;
    /**
     * method
     * @type {string}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    method?: string;
    /**
     * name
     * @type {string}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    name?: string;
    /**
     * 
     * @type {CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    rubric?: CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubric;
    /**
     * status
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    status?: number;
    /**
     * time copied
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    timecopied?: number;
    /**
     * creation time
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    timecreated?: number;
    /**
     * last modified time
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    timemodified?: number;
    /**
     * user who created definition
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    usercreated?: number;
    /**
     * user who modified definition
     * @type {number}
     * @memberof CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner
     */
    usermodified?: number;
}

/**
 * Check if a given object implements the CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner interface.
 */
export function instanceOfCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner(value: object): boolean {
    return true;
}

export function CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerFromJSON(json: any): CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner {
    return CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerFromJSONTyped(json, false);
}

export function CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'copiedfromid': json['copiedfromid'] == null ? undefined : json['copiedfromid'],
        'description': json['description'] == null ? undefined : json['description'],
        'descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'guide': json['guide'] == null ? undefined : CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideFromJSON(json['guide']),
        'id': json['id'] == null ? undefined : json['id'],
        'method': json['method'] == null ? undefined : json['method'],
        'name': json['name'] == null ? undefined : json['name'],
        'rubric': json['rubric'] == null ? undefined : CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricFromJSON(json['rubric']),
        'status': json['status'] == null ? undefined : json['status'],
        'timecopied': json['timecopied'] == null ? undefined : json['timecopied'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'usercreated': json['usercreated'] == null ? undefined : json['usercreated'],
        'usermodified': json['usermodified'] == null ? undefined : json['usermodified'],
    };
}

export function CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerToJSON(value?: CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'copiedfromid': value['copiedfromid'],
        'description': value['description'],
        'descriptionformat': value['descriptionformat'],
        'guide': CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuideToJSON(value['guide']),
        'id': value['id'],
        'method': value['method'],
        'name': value['name'],
        'rubric': CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerRubricToJSON(value['rubric']),
        'status': value['status'],
        'timecopied': value['timecopied'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'usercreated': value['usercreated'],
        'usermodified': value['usermodified'],
    };
}
