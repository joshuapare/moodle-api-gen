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
import type { CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner } from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';
import {
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSONTyped,
    CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON,
} from './CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner';

/**
 * Tool
 * @export
 * @interface ModLtiGetLtisByCourses200ResponseLtisInner
 */
export interface ModLtiGetLtisByCourses200ResponseLtisInner {
    /**
     * Course id
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    course?: number;
    /**
     * Course module id
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    coursemodule?: number;
    /**
     * Debug launch
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    debuglaunch?: number;
    /**
     * Enable grades
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    grade?: number;
    /**
     * Group id
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    groupingid?: number;
    /**
     * Group mode
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    groupmode?: number;
    /**
     * Alternative icon URL
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    icon?: string;
    /**
     * Activity instance id
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    id?: number;
    /**
     * instructor choice accept grades
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    instructorchoiceacceptgrades?: number;
    /**
     * Instructor choice allow roster
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    instructorchoiceallowroster?: number;
    /**
     * Instructor choice allow setting
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    instructorchoiceallowsetting?: number;
    /**
     * instructor choice send mail address
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    instructorchoicesendemailaddr?: number;
    /**
     * Instructor choice send name
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    instructorchoicesendname?: string;
    /**
     * instructor custom parameters
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    instructorcustomparameters?: string;
    /**
     * Activity introduction
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    intro?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    introfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    introformat?: number;
    /**
     * Forced activity language
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    lang?: string;
    /**
     * Launch container mode
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    launchcontainer?: number;
    /**
     * Activity name
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    name?: string;
    /**
     * Shared secret
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    password?: string;
    /**
     * Resource key
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    resourcekey?: string;
    /**
     * Course section id
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    section?: number;
    /**
     * Secure icon URL
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    secureicon?: string;
    /**
     * Secure tool url
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    securetoolurl?: string;
    /**
     * Service salt
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    servicesalt?: string;
    /**
     * Show description launch
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    showdescriptionlaunch?: number;
    /**
     * Show title launch
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    showtitlelaunch?: number;
    /**
     * Time of creation
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    timecreated?: number;
    /**
     * Time of last modification
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    timemodified?: number;
    /**
     * Tool url
     * @type {string}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    toolurl?: string;
    /**
     * Type id
     * @type {number}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    typeid?: number;
    /**
     * Visible
     * @type {boolean}
     * @memberof ModLtiGetLtisByCourses200ResponseLtisInner
     */
    visible?: boolean;
}

/**
 * Check if a given object implements the ModLtiGetLtisByCourses200ResponseLtisInner interface.
 */
export function instanceOfModLtiGetLtisByCourses200ResponseLtisInner(value: object): boolean {
    return true;
}

export function ModLtiGetLtisByCourses200ResponseLtisInnerFromJSON(json: any): ModLtiGetLtisByCourses200ResponseLtisInner {
    return ModLtiGetLtisByCourses200ResponseLtisInnerFromJSONTyped(json, false);
}

export function ModLtiGetLtisByCourses200ResponseLtisInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModLtiGetLtisByCourses200ResponseLtisInner {
    if (json == null) {
        return json;
    }
    return {
        
        'course': json['course'] == null ? undefined : json['course'],
        'coursemodule': json['coursemodule'] == null ? undefined : json['coursemodule'],
        'debuglaunch': json['debuglaunch'] == null ? undefined : json['debuglaunch'],
        'grade': json['grade'] == null ? undefined : json['grade'],
        'groupingid': json['groupingid'] == null ? undefined : json['groupingid'],
        'groupmode': json['groupmode'] == null ? undefined : json['groupmode'],
        'icon': json['icon'] == null ? undefined : json['icon'],
        'id': json['id'] == null ? undefined : json['id'],
        'instructorchoiceacceptgrades': json['instructorchoiceacceptgrades'] == null ? undefined : json['instructorchoiceacceptgrades'],
        'instructorchoiceallowroster': json['instructorchoiceallowroster'] == null ? undefined : json['instructorchoiceallowroster'],
        'instructorchoiceallowsetting': json['instructorchoiceallowsetting'] == null ? undefined : json['instructorchoiceallowsetting'],
        'instructorchoicesendemailaddr': json['instructorchoicesendemailaddr'] == null ? undefined : json['instructorchoicesendemailaddr'],
        'instructorchoicesendname': json['instructorchoicesendname'] == null ? undefined : json['instructorchoicesendname'],
        'instructorcustomparameters': json['instructorcustomparameters'] == null ? undefined : json['instructorcustomparameters'],
        'intro': json['intro'] == null ? undefined : json['intro'],
        'introfiles': json['introfiles'] == null ? undefined : ((json['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'introformat': json['introformat'] == null ? undefined : json['introformat'],
        'lang': json['lang'] == null ? undefined : json['lang'],
        'launchcontainer': json['launchcontainer'] == null ? undefined : json['launchcontainer'],
        'name': json['name'] == null ? undefined : json['name'],
        'password': json['password'] == null ? undefined : json['password'],
        'resourcekey': json['resourcekey'] == null ? undefined : json['resourcekey'],
        'section': json['section'] == null ? undefined : json['section'],
        'secureicon': json['secureicon'] == null ? undefined : json['secureicon'],
        'securetoolurl': json['securetoolurl'] == null ? undefined : json['securetoolurl'],
        'servicesalt': json['servicesalt'] == null ? undefined : json['servicesalt'],
        'showdescriptionlaunch': json['showdescriptionlaunch'] == null ? undefined : json['showdescriptionlaunch'],
        'showtitlelaunch': json['showtitlelaunch'] == null ? undefined : json['showtitlelaunch'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'toolurl': json['toolurl'] == null ? undefined : json['toolurl'],
        'typeid': json['typeid'] == null ? undefined : json['typeid'],
        'visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function ModLtiGetLtisByCourses200ResponseLtisInnerToJSON(value?: ModLtiGetLtisByCourses200ResponseLtisInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'course': value['course'],
        'coursemodule': value['coursemodule'],
        'debuglaunch': value['debuglaunch'],
        'grade': value['grade'],
        'groupingid': value['groupingid'],
        'groupmode': value['groupmode'],
        'icon': value['icon'],
        'id': value['id'],
        'instructorchoiceacceptgrades': value['instructorchoiceacceptgrades'],
        'instructorchoiceallowroster': value['instructorchoiceallowroster'],
        'instructorchoiceallowsetting': value['instructorchoiceallowsetting'],
        'instructorchoicesendemailaddr': value['instructorchoicesendemailaddr'],
        'instructorchoicesendname': value['instructorchoicesendname'],
        'instructorcustomparameters': value['instructorcustomparameters'],
        'intro': value['intro'],
        'introfiles': value['introfiles'] == null ? undefined : ((value['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'introformat': value['introformat'],
        'lang': value['lang'],
        'launchcontainer': value['launchcontainer'],
        'name': value['name'],
        'password': value['password'],
        'resourcekey': value['resourcekey'],
        'section': value['section'],
        'secureicon': value['secureicon'],
        'securetoolurl': value['securetoolurl'],
        'servicesalt': value['servicesalt'],
        'showdescriptionlaunch': value['showdescriptionlaunch'],
        'showtitlelaunch': value['showtitlelaunch'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'toolurl': value['toolurl'],
        'typeid': value['typeid'],
        'visible': value['visible'],
    };
}
