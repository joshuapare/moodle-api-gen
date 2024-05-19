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
import type { CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide } from './CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide';
import {
    CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideFromJSON,
    CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideFromJSONTyped,
    CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideToJSON,
} from './CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide';
import type { CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric } from './CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric';
import {
    CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricFromJSON,
    CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricFromJSONTyped,
    CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricToJSON,
} from './CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric';

/**
 * 
 * @export
 * @interface CoreGradingGetGradingformInstances200ResponseInstancesInner
 */
export interface CoreGradingGetGradingformInstances200ResponseInstancesInner {
    /**
     * feedback
     * @type {string}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Feedback?: string;
    /**
     * feedback format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Feedbackformat?: number;
    /**
     * 
     * @type {CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Guide?: CoreGradingGetGradingformInstances200ResponseInstancesInnerGuide;
    /**
     * instance id
     * @type {number}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Id?: number;
    /**
     * item id
     * @type {number}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Itemid?: number;
    /**
     * rater id
     * @type {number}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Raterid?: number;
    /**
     * raw grade
     * @type {string}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Rawgrade?: string;
    /**
     * 
     * @type {CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Rubric?: CoreGradingGetGradingformInstances200ResponseInstancesInnerRubric;
    /**
     * status
     * @type {number}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Status?: number;
    /**
     * modified time
     * @type {number}
     * @memberof CoreGradingGetGradingformInstances200ResponseInstancesInner
     */
    Timemodified?: number;
}

/**
 * Check if a given object implements the CoreGradingGetGradingformInstances200ResponseInstancesInner interface.
 */
export function instanceOfCoreGradingGetGradingformInstances200ResponseInstancesInner(value: object): boolean {
    return true;
}

export function CoreGradingGetGradingformInstances200ResponseInstancesInnerFromJSON(json: any): CoreGradingGetGradingformInstances200ResponseInstancesInner {
    return CoreGradingGetGradingformInstances200ResponseInstancesInnerFromJSONTyped(json, false);
}

export function CoreGradingGetGradingformInstances200ResponseInstancesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreGradingGetGradingformInstances200ResponseInstancesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Feedback': json['feedback'] == null ? undefined : json['feedback'],
        'Feedbackformat': json['feedbackformat'] == null ? undefined : json['feedbackformat'],
        'Guide': json['guide'] == null ? undefined : CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideFromJSON(json['guide']),
        'Id': json['id'] == null ? undefined : json['id'],
        'Itemid': json['itemid'] == null ? undefined : json['itemid'],
        'Raterid': json['raterid'] == null ? undefined : json['raterid'],
        'Rawgrade': json['rawgrade'] == null ? undefined : json['rawgrade'],
        'Rubric': json['rubric'] == null ? undefined : CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricFromJSON(json['rubric']),
        'Status': json['status'] == null ? undefined : json['status'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
    };
}

export function CoreGradingGetGradingformInstances200ResponseInstancesInnerToJSON(value?: CoreGradingGetGradingformInstances200ResponseInstancesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'feedback': value['Feedback'],
        'feedbackformat': value['Feedbackformat'],
        'guide': CoreGradingGetGradingformInstances200ResponseInstancesInnerGuideToJSON(value['Guide']),
        'id': value['Id'],
        'itemid': value['Itemid'],
        'raterid': value['Raterid'],
        'rawgrade': value['Rawgrade'],
        'rubric': CoreGradingGetGradingformInstances200ResponseInstancesInnerRubricToJSON(value['Rubric']),
        'status': value['Status'],
        'timemodified': value['Timemodified'],
    };
}
