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
 * @interface CoreCompetencyUpdateCompetencyRequestCompetency
 */
export interface CoreCompetencyUpdateCompetencyRequestCompetency {
    /**
     * competencyframeworkid
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    competencyframeworkid?: number;
    /**
     * description
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    descriptionformat?: number;
    /**
     * id
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    id: number;
    /**
     * idnumber
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    idnumber?: string;
    /**
     * parentid
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    parentid?: number;
    /**
     * path
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    path?: string;
    /**
     * ruleconfig
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    ruleconfig?: string;
    /**
     * ruleoutcome
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    ruleoutcome?: number;
    /**
     * ruletype
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    ruletype?: string;
    /**
     * scaleconfiguration
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    scaleconfiguration?: string;
    /**
     * scaleid
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    scaleid?: number;
    /**
     * shortname
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    shortname?: string;
    /**
     * sortorder
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    sortorder?: number;
    /**
     * timecreated
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    timecreated?: number;
    /**
     * timemodified
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    timemodified?: number;
    /**
     * usermodified
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyRequestCompetency
     */
    usermodified?: number;
}

/**
 * Check if a given object implements the CoreCompetencyUpdateCompetencyRequestCompetency interface.
 */
export function instanceOfCoreCompetencyUpdateCompetencyRequestCompetency(value: object): boolean {
    if (!('id' in value)) return false;
    return true;
}

export function CoreCompetencyUpdateCompetencyRequestCompetencyFromJSON(json: any): CoreCompetencyUpdateCompetencyRequestCompetency {
    return CoreCompetencyUpdateCompetencyRequestCompetencyFromJSONTyped(json, false);
}

export function CoreCompetencyUpdateCompetencyRequestCompetencyFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyUpdateCompetencyRequestCompetency {
    if (json == null) {
        return json;
    }
    return {
        
        'competencyframeworkid': json['competencyframeworkid'] == null ? undefined : json['competencyframeworkid'],
        'description': json['description'] == null ? undefined : json['description'],
        'descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'id': json['id'],
        'idnumber': json['idnumber'] == null ? undefined : json['idnumber'],
        'parentid': json['parentid'] == null ? undefined : json['parentid'],
        'path': json['path'] == null ? undefined : json['path'],
        'ruleconfig': json['ruleconfig'] == null ? undefined : json['ruleconfig'],
        'ruleoutcome': json['ruleoutcome'] == null ? undefined : json['ruleoutcome'],
        'ruletype': json['ruletype'] == null ? undefined : json['ruletype'],
        'scaleconfiguration': json['scaleconfiguration'] == null ? undefined : json['scaleconfiguration'],
        'scaleid': json['scaleid'] == null ? undefined : json['scaleid'],
        'shortname': json['shortname'] == null ? undefined : json['shortname'],
        'sortorder': json['sortorder'] == null ? undefined : json['sortorder'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'usermodified': json['usermodified'] == null ? undefined : json['usermodified'],
    };
}

export function CoreCompetencyUpdateCompetencyRequestCompetencyToJSON(value?: CoreCompetencyUpdateCompetencyRequestCompetency | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competencyframeworkid': value['competencyframeworkid'],
        'description': value['description'],
        'descriptionformat': value['descriptionformat'],
        'id': value['id'],
        'idnumber': value['idnumber'],
        'parentid': value['parentid'],
        'path': value['path'],
        'ruleconfig': value['ruleconfig'],
        'ruleoutcome': value['ruleoutcome'],
        'ruletype': value['ruletype'],
        'scaleconfiguration': value['scaleconfiguration'],
        'scaleid': value['scaleid'],
        'shortname': value['shortname'],
        'sortorder': value['sortorder'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'usermodified': value['usermodified'],
    };
}

