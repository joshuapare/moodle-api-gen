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
import { BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner } from './block-iomad-company-admin-create-licenses-request-licenses-inner-courses-inner';


/**
 * one or many licenses
 */
export interface BlockIomadCompanyAdminEditLicensesRequestLicensesInner { 
    /**
     * Number of license slots
     */
    Allocation?: number;
    /**
     * Company id
     */
    Companyid?: number;
    Courses?: Array<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner>;
    /**
     * License expiry date
     */
    Expirydate?: number;
    /**
     * license ID
     */
    Id?: number;
    /**
     * Instant access - 0 = no, 1 = yes
     */
    Instant?: number;
    /**
     * License name
     */
    Name?: string;
    /**
     * Parent license id
     */
    Parentid?: number;
    /**
     * Program pf courses 0 = no, 1 = yes
     */
    Program?: number;
    /**
     * License reference
     */
    Reference?: string;
    /**
     * License type - 0 = standard, 1 = reusable, 2 = standard educator, 3 = reusable educator
     */
    Type?: number;
    /**
     * Number allocated
     */
    Used?: number;
    /**
     * Course access length (days)
     */
    Validlength?: number;
}
