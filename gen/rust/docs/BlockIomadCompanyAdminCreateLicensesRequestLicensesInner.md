# BlockIomadCompanyAdminCreateLicensesRequestLicensesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation** | Option<**i32**> | Number of license slots | [optional][default to null]
**clearonexpire** | Option<**i32**> | Clear license assignments on expire - 0 = no, 1 = yes | [optional][default to null]
**companyid** | Option<**i32**> | Company id | [optional][default to null]
**courses** | Option<[**Vec<models::BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner>**](block_iomad_company_admin_create_licenses_request_licenses_inner_courses_inner.md)> |  | [optional]
**cutoffdate** | Option<**i32**> | License cut off date (int = timestamp) | [optional][default to null]
**expirydate** | Option<**i32**> | License expiry date (int = timestamp) | [optional][default to null]
**instant** | Option<**i32**> | Instant access - 0 = no, 1 = yes | [optional][default to null]
**name** | Option<**String**> | License name | [optional][default to null]
**parentid** | Option<**i32**> | Parent license id | [optional][default to null]
**program** | Option<**i32**> | Program pf courses 0 = no, 1 = yes | [optional][default to null]
**reference** | Option<**String**> | License reference | [optional][default to null]
**startdate** | Option<**i32**> | Date from which the liucense is available (int = timestamp)  | [optional][default to null]
**r#type** | Option<**i32**> | License type - 0 = standard, 1 = reusable, 2 = standard educator, 3 = reusable educator | [optional][default to null]
**used** | Option<**i32**> | Number how often the lic can be allocated | [optional][default to null]
**validlength** | Option<**i32**> | Course access length (days) | [optional][default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


