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
 * @interface ToolDataprivacyCreateCategoryForm200ResponseCategory
 */
export interface ToolDataprivacyCreateCategoryForm200ResponseCategory {
    /**
     * The category description.
     * @type {string}
     * @memberof ToolDataprivacyCreateCategoryForm200ResponseCategory
     */
    Description: string;
    /**
     * description format (1 = HTML, 0 = MOODLE, 2 = PLAIN, or 4 = MARKDOWN)
     * @type {number}
     * @memberof ToolDataprivacyCreateCategoryForm200ResponseCategory
     */
    Descriptionformat?: number;
    /**
     * id
     * @type {number}
     * @memberof ToolDataprivacyCreateCategoryForm200ResponseCategory
     */
    Id: number;
    /**
     * The category name.
     * @type {string}
     * @memberof ToolDataprivacyCreateCategoryForm200ResponseCategory
     */
    Name: string;
    /**
     * timecreated
     * @type {number}
     * @memberof ToolDataprivacyCreateCategoryForm200ResponseCategory
     */
    Timecreated: number;
    /**
     * timemodified
     * @type {number}
     * @memberof ToolDataprivacyCreateCategoryForm200ResponseCategory
     */
    Timemodified: number;
    /**
     * usermodified
     * @type {number}
     * @memberof ToolDataprivacyCreateCategoryForm200ResponseCategory
     */
    Usermodified: number;
}

/**
 * Check if a given object implements the ToolDataprivacyCreateCategoryForm200ResponseCategory interface.
 */
export function instanceOfToolDataprivacyCreateCategoryForm200ResponseCategory(value: object): boolean {
    if (!('Description' in value)) return false;
    if (!('Id' in value)) return false;
    if (!('Name' in value)) return false;
    if (!('Timecreated' in value)) return false;
    if (!('Timemodified' in value)) return false;
    if (!('Usermodified' in value)) return false;
    return true;
}

export function ToolDataprivacyCreateCategoryForm200ResponseCategoryFromJSON(json: any): ToolDataprivacyCreateCategoryForm200ResponseCategory {
    return ToolDataprivacyCreateCategoryForm200ResponseCategoryFromJSONTyped(json, false);
}

export function ToolDataprivacyCreateCategoryForm200ResponseCategoryFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolDataprivacyCreateCategoryForm200ResponseCategory {
    if (json == null) {
        return json;
    }
    return {
        
        'Description': json['description'],
        'Descriptionformat': json['descriptionformat'] == null ? undefined : json['descriptionformat'],
        'Id': json['id'],
        'Name': json['name'],
        'Timecreated': json['timecreated'],
        'Timemodified': json['timemodified'],
        'Usermodified': json['usermodified'],
    };
}

export function ToolDataprivacyCreateCategoryForm200ResponseCategoryToJSON(value?: ToolDataprivacyCreateCategoryForm200ResponseCategory | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'description': value['Description'],
        'descriptionformat': value['Descriptionformat'],
        'id': value['Id'],
        'name': value['Name'],
        'timecreated': value['Timecreated'],
        'timemodified': value['Timemodified'],
        'usermodified': value['Usermodified'],
    };
}

