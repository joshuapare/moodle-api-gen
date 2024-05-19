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
    Areaname?: string;
    /**
     * component name
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Componentname?: string;
    /**
     * result contents
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Content?: string;
    /**
     * result context id
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Contextid?: number;
    /**
     * result context url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Contexturl?: string;
    /**
     * result course fullname
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Coursefullname?: string;
    /**
     * result course url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Courseurl?: string;
    /**
     * extra result contents, depends on the search area
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Description1?: string;
    /**
     * extra result contents, depends on the search area
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Description2?: string;
    /**
     * result url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Docurl?: string;
    /**
     * result file name if present
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Filename?: string;
    /**
     * result file names if present
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Filenames?: string;
    /**
     * icon url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Iconurl?: string;
    /**
     * unique id in the search area scope
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Itemid?: number;
    /**
     * whether multiple files are returned or not
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Multiplefiles?: number;
    /**
     * text fields format, it is the same for all of them
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Textformat?: number;
    /**
     * result modified time
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Timemodified?: number;
    /**
     * result title
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Title?: string;
    /**
     * user fullname
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Userfullname?: string;
    /**
     * user id
     * @type {number}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Userid?: number;
    /**
     * user url
     * @type {string}
     * @memberof CoreSearchGetResults200ResponseResultsInner
     */
    Userurl?: string;
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
        
        'Areaname': json['areaname'] == null ? undefined : json['areaname'],
        'Componentname': json['componentname'] == null ? undefined : json['componentname'],
        'Content': json['content'] == null ? undefined : json['content'],
        'Contextid': json['contextid'] == null ? undefined : json['contextid'],
        'Contexturl': json['contexturl'] == null ? undefined : json['contexturl'],
        'Coursefullname': json['coursefullname'] == null ? undefined : json['coursefullname'],
        'Courseurl': json['courseurl'] == null ? undefined : json['courseurl'],
        'Description1': json['description1'] == null ? undefined : json['description1'],
        'Description2': json['description2'] == null ? undefined : json['description2'],
        'Docurl': json['docurl'] == null ? undefined : json['docurl'],
        'Filename': json['filename'] == null ? undefined : json['filename'],
        'Filenames': json['filenames'] == null ? undefined : json['filenames'],
        'Iconurl': json['iconurl'] == null ? undefined : json['iconurl'],
        'Itemid': json['itemid'] == null ? undefined : json['itemid'],
        'Multiplefiles': json['multiplefiles'] == null ? undefined : json['multiplefiles'],
        'Textformat': json['textformat'] == null ? undefined : json['textformat'],
        'Timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'Title': json['title'] == null ? undefined : json['title'],
        'Userfullname': json['userfullname'] == null ? undefined : json['userfullname'],
        'Userid': json['userid'] == null ? undefined : json['userid'],
        'Userurl': json['userurl'] == null ? undefined : json['userurl'],
    };
}

export function CoreSearchGetResults200ResponseResultsInnerToJSON(value?: CoreSearchGetResults200ResponseResultsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'areaname': value['Areaname'],
        'componentname': value['Componentname'],
        'content': value['Content'],
        'contextid': value['Contextid'],
        'contexturl': value['Contexturl'],
        'coursefullname': value['Coursefullname'],
        'courseurl': value['Courseurl'],
        'description1': value['Description1'],
        'description2': value['Description2'],
        'docurl': value['Docurl'],
        'filename': value['Filename'],
        'filenames': value['Filenames'],
        'iconurl': value['Iconurl'],
        'itemid': value['Itemid'],
        'multiplefiles': value['Multiplefiles'],
        'textformat': value['Textformat'],
        'timemodified': value['Timemodified'],
        'title': value['Title'],
        'userfullname': value['Userfullname'],
        'userid': value['Userid'],
        'userurl': value['Userurl'],
    };
}

