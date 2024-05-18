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
 * @interface CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
 */
export interface CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework {
    /**
     * The context id
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    contextid?: number;
    /**
     * The context level
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    contextlevel?: string;
    /**
     * description
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    description?: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    descriptionformat?: number;
    /**
     * id
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    id: number;
    /**
     * idnumber
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    idnumber?: string;
    /**
     * The Instance id
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    instanceid?: number;
    /**
     * scaleconfiguration
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    scaleconfiguration?: string;
    /**
     * scaleid
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    scaleid?: number;
    /**
     * shortname
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    shortname?: string;
    /**
     * taxonomies
     * @type {string}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    taxonomies?: string;
    /**
     * timecreated
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    timecreated?: number;
    /**
     * timemodified
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    timemodified?: number;
    /**
     * usermodified
     * @type {number}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    usermodified?: number;
    /**
     * visible
     * @type {boolean}
     * @memberof CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework
     */
    visible?: boolean;
}

/**
 * Check if a given object implements the CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework interface.
 */
export function instanceOfCoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework(value: object): boolean {
    if (!('id' in value)) return false;
    return true;
}

export function CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframeworkFromJSON(json: any): CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework {
    return CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframeworkFromJSONTyped(json, false);
}

export function CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframeworkFromJSONTyped(json: any, ignoreDiscriminator: boolean): CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework {
    if (json == null) {
        return json;
    }
    return {
        
        'contextid': json['contextid'] == null ? undefined : json['contextid'],
        'contextlevel': json['contextlevel'] == null ? undefined : json['contextlevel'],
        'description': json['description'] == null ? undefined : json['description'],
        'descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'id': json['id'],
        'idnumber': json['idnumber'] == null ? undefined : json['idnumber'],
        'instanceid': json['instanceid'] == null ? undefined : json['instanceid'],
        'scaleconfiguration': json['scaleconfiguration'] == null ? undefined : json['scaleconfiguration'],
        'scaleid': json['scaleid'] == null ? undefined : json['scaleid'],
        'shortname': json['shortname'] == null ? undefined : json['shortname'],
        'taxonomies': json['taxonomies'] == null ? undefined : json['taxonomies'],
        'timecreated': json['timecreated'] == null ? undefined : json['timecreated'],
        'timemodified': json['timemodified'] == null ? undefined : json['timemodified'],
        'usermodified': json['usermodified'] == null ? undefined : json['usermodified'],
        'visible': json['visible'] == null ? undefined : json['visible'],
    };
}

export function CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframeworkToJSON(value?: CoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'contextid': value['contextid'],
        'contextlevel': value['contextlevel'],
        'description': value['description'],
        'descriptionformat': value['descriptionformat'],
        'id': value['id'],
        'idnumber': value['idnumber'],
        'instanceid': value['instanceid'],
        'scaleconfiguration': value['scaleconfiguration'],
        'scaleid': value['scaleid'],
        'shortname': value['shortname'],
        'taxonomies': value['taxonomies'],
        'timecreated': value['timecreated'],
        'timemodified': value['timemodified'],
        'usermodified': value['usermodified'],
        'visible': value['visible'],
    };
}
