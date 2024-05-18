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
 * SCORM
 * @export
 * @interface ModScormGetScormsByCourses200ResponseScormsInner
 */
export interface ModScormGetScormsByCourses200ResponseScormsInner {
    /**
     * Auto continue?
     * @type {boolean}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    auto?: boolean;
    /**
     * Save track data automatically?
     * @type {boolean}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    autocommit?: boolean;
    /**
     * Minimum score required
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    completionscorerequired?: number;
    /**
     * Require all scos to return completion status
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    completionstatusallscos?: number;
    /**
     * Status passed/completed required?
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    completionstatusrequired?: number;
    /**
     * Course id
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    course?: number;
    /**
     * Course module id
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    coursemodule?: number;
    /**
     * How to display attempt status
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    displayattemptstatus?: number;
    /**
     * Display contents structure
     * @type {boolean}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    displaycoursestructure?: boolean;
    /**
     * Status current attempt is forced to "completed"
     * @type {boolean}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    forcecompleted?: boolean;
    /**
     * Controls re-entry behaviour
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    forcenewattempt?: number;
    /**
     * Grade method
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    grademethod?: number;
    /**
     * Group id
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    groupingid?: number;
    /**
     * Group mode
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    groupmode?: number;
    /**
     * Frame height
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    height?: number;
    /**
     * Disable preview mode?
     * @type {boolean}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    hidebrowse?: boolean;
    /**
     * How to display the SCORM structure in player
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    hidetoc?: number;
    /**
     * Activity instance id
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    id?: number;
    /**
     * Activity introduction
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    intro?: string;
    /**
     * 
     * @type {Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    introfiles?: Array<CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInner>;
    /**
     * intro format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    introformat?: number;
    /**
     * Forced activity language
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    lang?: string;
    /**
     * Prevents to launch new attempts once finished
     * @type {boolean}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    lastattemptlock?: boolean;
    /**
     * First content to launch
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    launch?: number;
    /**
     * Maximum number of attemtps
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    maxattempt?: number;
    /**
     * Max grade
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    maxgrade?: number;
    /**
     * MD5 Hash of package file
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    md5hash?: string;
    /**
     * Activity name
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    name?: string;
    /**
     * Show navigation buttons
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    nav?: number;
    /**
     * Navigation position left
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    navpositionleft?: number;
    /**
     * Navigation position top
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    navpositiontop?: number;
    /**
     * Additional options
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    options?: string;
    /**
     * SCORM zip package size
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    packagesize?: number;
    /**
     * SCORM zip package URL
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    packageurl?: string;
    /**
     * Display in current or new window
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    popup?: number;
    /**
     * Protect package downloads?
     * @type {boolean}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    protectpackagedownloads?: boolean;
    /**
     * Reference to the package
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    reference?: string;
    /**
     * Revison number
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    revision?: number;
    /**
     * SCORM type
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    scormtype?: string;
    /**
     * Course section id
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    section?: number;
    /**
     * Package content or ext path hash
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    sha1hash?: string;
    /**
     * How to skip the content structure page
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    skipview?: number;
    /**
     * Available to
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    timeclose?: number;
    /**
     * Time of last modification
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    timemodified?: number;
    /**
     * Available from
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    timeopen?: number;
    /**
     * Auto-update frequency for remote packages
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    updatefreq?: number;
    /**
     * SCORM version (SCORM_12, SCORM_13, SCORM_AICC)
     * @type {string}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    version?: string;
    /**
     * Visible
     * @type {boolean}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    visible?: boolean;
    /**
     * What grade
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    whatgrade?: number;
    /**
     * Frame width
     * @type {number}
     * @memberof ModScormGetScormsByCourses200ResponseScormsInner
     */
    width?: number;
}

/**
 * Check if a given object implements the ModScormGetScormsByCourses200ResponseScormsInner interface.
 */
export function instanceOfModScormGetScormsByCourses200ResponseScormsInner(value: object): boolean {
    return true;
}

export function ModScormGetScormsByCourses200ResponseScormsInnerFromJSON(json: any): ModScormGetScormsByCourses200ResponseScormsInner {
    return ModScormGetScormsByCourses200ResponseScormsInnerFromJSONTyped(json, false);
}

export function ModScormGetScormsByCourses200ResponseScormsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModScormGetScormsByCourses200ResponseScormsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'auto': json['auto'] == null ? undefined : json['auto'],
        'autocommit': json['autocommit'] == null ? undefined : json['autocommit'],
        'completionscorerequired': json['completionscorerequired'] == null ? undefined : json['completionscorerequired'],
        'completionstatusallscos': json['completionstatusallscos'] == null ? undefined : json['completionstatusallscos'],
        'completionstatusrequired': json['completionstatusrequired'] == null ? undefined : json['completionstatusrequired'],
        'course': json['course'] == null ? undefined : json['course'],
        'coursemodule': json['coursemodule'] == null ? undefined : json['coursemodule'],
        'displayattemptstatus': json['displayattemptstatus'] == null ? undefined : json['displayattemptstatus'],
        'displaycoursestructure': json['displaycoursestructure'] == null ? undefined : json['displaycoursestructure'],
        'forcecompleted': json['forcecompleted'] == null ? undefined : json['forcecompleted'],
        'forcenewattempt': json['forcenewattempt'] == null ? undefined : json['forcenewattempt'],
        'grademethod': json['grademethod'] == null ? undefined : json['grademethod'],
        'groupingid': json['groupingid'] == null ? undefined : json['groupingid'],
        'groupmode': json['groupmode'] == null ? undefined : json['groupmode'],
        'height': json['height'] == null ? undefined : json['height'],
        'hidebrowse': json['hidebrowse'] == null ? undefined : json['hidebrowse'],
        'hidetoc': json['hidetoc'] == null ? undefined : json['hidetoc'],
        'id': json['id'] == null ? undefined : json['id'],
        'intro': json['intro'] == null ? undefined : json['intro'],
        'introfiles': json['introfiles'] == null ? undefined : ((json['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerFromJSON)),
        'introformat': json['introformat'] == null ? undefined : json['introformat'],
        'lang': json['lang'] == null ? undefined : json['lang'],
        'lastattemptlock': json['lastattemptlock'] == null ? undefined : json['lastattemptlock'],
        'launch': json['launch'] == null ? undefined : json['launch'],
        'maxattempt': json['maxattempt'] == null ? undefined : json['maxattempt'],
        'maxgrade': json['maxgrade'] == null ? undefined : json['maxgrade'],
        'md5hash': json['md5hash'] == null ? undefined : json['md5hash'],
        'name': json['name'] == null ? undefined : json['name'],
        'nav': json['nav'] == null ? undefined : json['nav'],
        'navpositionleft': json['navpositionleft'] == null ? undefined : json['navpositionleft'],
        'navpositiontop': json['navpositiontop'] == null ? undefined : json['navpositiontop'],
        'options': json['options'] == null ? undefined : json['options'],
        'packagesize': json['packagesize'] == null ? undefined : json['packagesize'],
        'packageurl': json['packageurl'] == null ? undefined : json['packageurl'],
        'popup': json['popup'] == null ? undefined : json['popup'],
        'protectpackagedownloads': json['protectpackagedownloads'] == null ? undefined : json['protectpackagedownloads'],
        'reference': json['reference'] == null ? undefined : json['reference'],
        'revision': json['revision'] == null ? undefined : json['revision'],
        'scormtype': json['scormtype'] == null ? undefined : json['scormtype'],
        'section': json['section'] == null ? undefined : json['section'],
        'sha1hash': json['sha1hash'] == null ? undefined : json['sha1hash'],
        'skipview': json['skipview'] == null ? undefined : json['skipview'],
        'timeclose': json['timeclose'] == null ? undefined : json['timeclose'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'timeopen': json['timeopen'] == null ? undefined : json['timeopen'],
        'updatefreq': json['updatefreq'] == null ? undefined : json['updatefreq'],
        'version': json['version'] == null ? undefined : json['version'],
        'visible': json['visible'] == null ? undefined : json['visible'],
        'whatgrade': json['whatgrade'] == null ? undefined : json['whatgrade'],
        'width': json['width'] == null ? undefined : json['width'],
    };
}

export function ModScormGetScormsByCourses200ResponseScormsInnerToJSON(value?: ModScormGetScormsByCourses200ResponseScormsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'auto': value['auto'],
        'autocommit': value['autocommit'],
        'completionscorerequired': value['completionscorerequired'],
        'completionstatusallscos': value['completionstatusallscos'],
        'completionstatusrequired': value['completionstatusrequired'],
        'course': value['course'],
        'coursemodule': value['coursemodule'],
        'displayattemptstatus': value['displayattemptstatus'],
        'displaycoursestructure': value['displaycoursestructure'],
        'forcecompleted': value['forcecompleted'],
        'forcenewattempt': value['forcenewattempt'],
        'grademethod': value['grademethod'],
        'groupingid': value['groupingid'],
        'groupmode': value['groupmode'],
        'height': value['height'],
        'hidebrowse': value['hidebrowse'],
        'hidetoc': value['hidetoc'],
        'id': value['id'],
        'intro': value['intro'],
        'introfiles': value['introfiles'] == null ? undefined : ((value['introfiles'] as Array<any>).map(CoreBlockGetDashboardBlocks200ResponseBlocksInnerContentsFilesInnerToJSON)),
        'introformat': value['introformat'],
        'lang': value['lang'],
        'lastattemptlock': value['lastattemptlock'],
        'launch': value['launch'],
        'maxattempt': value['maxattempt'],
        'maxgrade': value['maxgrade'],
        'md5hash': value['md5hash'],
        'name': value['name'],
        'nav': value['nav'],
        'navpositionleft': value['navpositionleft'],
        'navpositiontop': value['navpositiontop'],
        'options': value['options'],
        'packagesize': value['packagesize'],
        'packageurl': value['packageurl'],
        'popup': value['popup'],
        'protectpackagedownloads': value['protectpackagedownloads'],
        'reference': value['reference'],
        'revision': value['revision'],
        'scormtype': value['scormtype'],
        'section': value['section'],
        'sha1hash': value['sha1hash'],
        'skipview': value['skipview'],
        'timeclose': value['timeclose'],
        'timemodified': value['timemodified'],
        'timeopen': value['timeopen'],
        'updatefreq': value['updatefreq'],
        'version': value['version'],
        'visible': value['visible'],
        'whatgrade': value['whatgrade'],
        'width': value['width'],
    };
}
