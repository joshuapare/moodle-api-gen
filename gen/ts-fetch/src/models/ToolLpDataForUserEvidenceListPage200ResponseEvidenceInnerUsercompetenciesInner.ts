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
import type { CoreCompetencyCreateCompetency200Response } from './CoreCompetencyCreateCompetency200Response';
import {
    CoreCompetencyCreateCompetency200ResponseFromJSON,
    CoreCompetencyCreateCompetency200ResponseFromJSONTyped,
    CoreCompetencyCreateCompetency200ResponseToJSON,
} from './CoreCompetencyCreateCompetency200Response';
import type { ToolLpDataForUserCompetencySummary200ResponseUsercompetency } from './ToolLpDataForUserCompetencySummary200ResponseUsercompetency';
import {
    ToolLpDataForUserCompetencySummary200ResponseUsercompetencyFromJSON,
    ToolLpDataForUserCompetencySummary200ResponseUsercompetencyFromJSONTyped,
    ToolLpDataForUserCompetencySummary200ResponseUsercompetencyToJSON,
} from './ToolLpDataForUserCompetencySummary200ResponseUsercompetency';

/**
 * 
 * @export
 * @interface ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner
 */
export interface ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner {
    /**
     * 
     * @type {CoreCompetencyCreateCompetency200Response}
     * @memberof ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner
     */
    Competency?: CoreCompetencyCreateCompetency200Response;
    /**
     * 
     * @type {ToolLpDataForUserCompetencySummary200ResponseUsercompetency}
     * @memberof ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner
     */
    Usercompetency?: ToolLpDataForUserCompetencySummary200ResponseUsercompetency;
}

/**
 * Check if a given object implements the ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner interface.
 */
export function instanceOfToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner(value: object): boolean {
    return true;
}

export function ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInnerFromJSON(json: any): ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner {
    return ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInnerFromJSONTyped(json, false);
}

export function ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'Competency': json['competency'] == null ? undefined : CoreCompetencyCreateCompetency200ResponseFromJSON(json['competency']),
        'Usercompetency': json['usercompetency'] == null ? undefined : ToolLpDataForUserCompetencySummary200ResponseUsercompetencyFromJSON(json['usercompetency']),
    };
}

export function ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInnerToJSON(value?: ToolLpDataForUserEvidenceListPage200ResponseEvidenceInnerUsercompetenciesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'competency': CoreCompetencyCreateCompetency200ResponseToJSON(value['Competency']),
        'usercompetency': ToolLpDataForUserCompetencySummary200ResponseUsercompetencyToJSON(value['Usercompetency']),
    };
}

