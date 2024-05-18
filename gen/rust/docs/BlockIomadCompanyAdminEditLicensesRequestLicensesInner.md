# BlockIomadCompanyAdminEditLicensesRequestLicensesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation** | Option<**i32**> | Number of license slots | [optional]
**companyid** | Option<**i32**> | Company id | [optional]
**courses** | Option<[**Vec<models::BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner>**](block_iomad_company_admin_create_licenses_request_licenses_inner_courses_inner.md)> |  | [optional]
**expirydate** | Option<**i32**> | License expiry date | [optional][default to null]
**id** | Option<**i32**> | license ID | [optional]
**instant** | Option<**i32**> | Instant access - 0 = no, 1 = yes | [optional]
**name** | Option<**String**> | License name | [optional]
**parentid** | Option<**i32**> | Parent license id | [optional]
**program** | Option<**i32**> | Program pf courses 0 = no, 1 = yes | [optional]
**reference** | Option<**String**> | License reference | [optional]
**r#type** | Option<**i32**> | License type - 0 = standard, 1 = reusable, 2 = standard educator, 3 = reusable educator | [optional]
**used** | Option<**i32**> | Number allocated | [optional][default to null]
**validlength** | Option<**i32**> | Course access length (days) | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


