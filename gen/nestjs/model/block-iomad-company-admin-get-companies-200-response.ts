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
import { BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner } from './block-iomad-company-admin-get-companies200-response-companies-inner';
import { BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner } from './block-iomad-company-admin-get-companies200-response-warnings-inner';


export interface BlockIomadCompanyAdminGetCompanies200Response { 
    Companies: Array<BlockIomadCompanyAdminGetCompanies200ResponseCompaniesInner>;
    Warnings?: Array<BlockIomadCompanyAdminGetCompanies200ResponseWarningsInner>;
}

