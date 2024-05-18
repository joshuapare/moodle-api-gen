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
 * @interface CoreCompetencyReadPlan200ResponseCommentarea
 */
export interface CoreCompetencyReadPlan200ResponseCommentarea {
    /**
     * autostart
     * @type {boolean}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    autostart: boolean;
    /**
     * canpost
     * @type {boolean}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    canpost: boolean;
    /**
     * canpostorhascomments
     * @type {boolean}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    canpostorhascomments: boolean;
    /**
     * canview
     * @type {boolean}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    canview: boolean;
    /**
     * cid
     * @type {string}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    cid: string;
    /**
     * collapsediconkey
     * @type {string}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    collapsediconkey: string;
    /**
     * commentarea
     * @type {string}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    commentarea: string;
    /**
     * component
     * @type {string}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    component: string;
    /**
     * contextid
     * @type {number}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    contextid: number;
    /**
     * count
     * @type {number}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    count: number;
    /**
     * courseid
     * @type {number}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    courseid: number;
    /**
     * displaycancel
     * @type {boolean}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    displaycancel: boolean;
    /**
     * displaytotalcount
     * @type {boolean}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    displaytotalcount: boolean;
    /**
     * fullwidth
     * @type {boolean}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    fullwidth: boolean;
    /**
     * itemid
     * @type {number}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    itemid: number;
    /**
     * linktext
     * @type {string}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    linktext: string;
    /**
     * notoggle
     * @type {boolean}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    notoggle: boolean;
    /**
     * template
     * @type {string}
     * @memberof CoreCompetencyReadPlan200ResponseCommentarea
     */
    template: string;
}

/**
 * Check if a given object implements the CoreCompetencyReadPlan200ResponseCommentarea interface.
 */
export function instanceOfCoreCompetencyReadPlan200ResponseCommentarea(value: object): boolean {
    if (!('autostart' in value)) return false;
    if (!('canpost' in value)) return false;
    if (!('canpostorhascomments' in value)) return false;
    if (!('canview' in value)) return false;
    if (!('cid' in value)) return false;
    if (!('collapsediconkey' in value)) return false;
    if (!('commentarea' in value)) return false;
    if (!('component' in value)) return false;
    if (!('contextid' in value)) return false;
    if (!('count' in value)) return false;
    if (!('courseid' in value)) return false;
    if (!('displaycancel' in value)) return false;
    if (!('displaytotalcount' in value)) return false;
    if (!('fullwidth' in value)) return false;
    if (!('itemid' in value)) return false;
    if (!('linktext' in value)) return false;
    if (!('notoggle' in value)) return false;
    if (!('template' in value)) return false;
    return true;
}

export function CoreCompetencyReadPlan200ResponseCommentareaFromJSON(json: any): CoreCompetencyReadPlan200ResponseCommentarea {
    return CoreCompetencyReadPlan200ResponseCommentareaFromJSONTyped(json, false);
}

export function CoreCompetencyReadPlan200ResponseCommentareaFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyReadPlan200ResponseCommentarea {
    if (json == null) {
        return json;
    }
    return {
        
        'autostart': json['autostart'],
        'canpost': json['canpost'],
        'canpostorhascomments': json['canpostorhascomments'],
        'canview': json['canview'],
        'cid': json['cid'],
        'collapsediconkey': json['collapsediconkey'],
        'commentarea': json['commentarea'],
        'component': json['component'],
        'contextid': json['contextid'],
        'count': json['count'],
        'courseid': json['courseid'],
        'displaycancel': json['displaycancel'],
        'displaytotalcount': json['displaytotalcount'],
        'fullwidth': json['fullwidth'],
        'itemid': json['itemid'],
        'linktext': json['linktext'],
        'notoggle': json['notoggle'],
        'template': json['template'],
    };
}

export function CoreCompetencyReadPlan200ResponseCommentareaToJSON(value?: CoreCompetencyReadPlan200ResponseCommentarea | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'autostart': value['autostart'],
        'canpost': value['canpost'],
        'canpostorhascomments': value['canpostorhascomments'],
        'canview': value['canview'],
        'cid': value['cid'],
        'collapsediconkey': value['collapsediconkey'],
        'commentarea': value['commentarea'],
        'component': value['component'],
        'contextid': value['contextid'],
        'count': value['count'],
        'courseid': value['courseid'],
        'displaycancel': value['displaycancel'],
        'displaytotalcount': value['displaytotalcount'],
        'fullwidth': value['fullwidth'],
        'itemid': value['itemid'],
        'linktext': value['linktext'],
        'notoggle': value['notoggle'],
        'template': value['template'],
    };
}

