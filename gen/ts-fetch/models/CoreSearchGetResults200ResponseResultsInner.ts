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
 * @interface CoreSearchGetResults200ResponseResultsInner
 */
export interface CoreSearchGetResults200ResponseResultsInner {
    /**
     * search area name
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    areaname?: string;
    /**
     * component name
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    componentname?: string;
    /**
     * result contents
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    content?: string;
    /**
     * result context id
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    contextid?: number;
    /**
     * result context url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    contexturl?: string;
    /**
     * result course fullname
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    coursefullname?: string;
    /**
     * result course url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    courseurl?: string;
    /**
     * extra result contents, depends on the search area
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    description1?: string;
    /**
     * extra result contents, depends on the search area
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    description2?: string;
    /**
     * result url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    docurl?: string;
    /**
     * result file name if present
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    filename?: string;
    /**
     * result file names if present
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    filenames?: string;
    /**
     * icon url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    iconurl?: string;
    /**
     * unique id in the search area scope
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    itemid?: number;
    /**
     * whether multiple files are returned or not
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    multiplefiles?: number;
    /**
     * text fields format, it is the same for all of them
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    textformat?: number;
    /**
     * result modified time
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    timemodified?: number;
    /**
     * result title
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    title?: string;
    /**
     * user fullname
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    userfullname?: string;
    /**
     * user id
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    userid?: number;
    /**
     * user url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    userurl?: string;
}

/**
 * Check if a given object implements the CoreSearchGetResults200ResponseResultsInner interface.
 */
export function instanceOfCoreSearchGetResults200ResponseResultsInner(value: object): boolean {
    return true;
}

export function CoreSearchGetResults200ResponseResultsInnerFromJSON(json: any): CoreSearchGetResults200ResponseResultsInner {
    return CoreSearchGetResults200ResponseResultsInnerFromJSONTyped(json, false);
}

export function CoreSearchGetResults200ResponseResultsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreSearchGetResults200ResponseResultsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'areaname': json['areaname'] == null ? undefined : json['areaname'],
        'componentname': json['componentname'] == null ? undefined : json['componentname'],
        'content': json['content'] == null ? undefined : json['content'],
        'contextid': json['contextid'] == null ? undefined : json['contextid'],
        'contexturl': json['contexturl'] == null ? undefined : json['contexturl'],
        'coursefullname': json['coursefullname'] == null ? undefined : json['coursefullname'],
        'courseurl': json['courseurl'] == null ? undefined : json['courseurl'],
        'description1': json['description1'] == null ? undefined : json['description1'],
        'description2': json['description2'] == null ? undefined : json['description2'],
        'docurl': json['docurl'] == null ? undefined : json['docurl'],
        'filename': json['filename'] == null ? undefined : json['filename'],
        'filenames': json['filenames'] == null ? undefined : json['filenames'],
        'iconurl': json['iconurl'] == null ? undefined : json['iconurl'],
        'itemid': json['itemid'] == null ? undefined : json['itemid'],
        'multiplefiles': json['multiplefiles'] == null ? undefined : json['multiplefiles'],
        'textformat': json['textformat'] == null ? undefined : json['textformat'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'title': json['title'] == null ? undefined : json['title'],
        'userfullname': json['userfullname'] == null ? undefined : json['userfullname'],
        'userid': json['userid'] == null ? undefined : json['userid'],
        'userurl': json['userurl'] == null ? undefined : json['userurl'],
    };
}

export function CoreSearchGetResults200ResponseResultsInnerToJSON(value?: CoreSearchGetResults200ResponseResultsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'areaname': value['areaname'],
        'componentname': value['componentname'],
        'content': value['content'],
        'contextid': value['contextid'],
        'contexturl': value['contexturl'],
        'coursefullname': value['coursefullname'],
        'courseurl': value['courseurl'],
        'description1': value['description1'],
        'description2': value['description2'],
        'docurl': value['docurl'],
        'filename': value['filename'],
        'filenames': value['filenames'],
        'iconurl': value['iconurl'],
        'itemid': value['itemid'],
        'multiplefiles': value['multiplefiles'],
        'textformat': value['textformat'],
        'timemodified': value['timemodified'],
        'title': value['title'],
        'userfullname': value['userfullname'],
        'userid': value['userid'],
        'userurl': value['userurl'],
    };
}

