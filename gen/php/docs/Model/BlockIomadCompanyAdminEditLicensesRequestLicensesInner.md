# # BlockIomadCompanyAdminEditLicensesRequestLicensesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation** | **int** | Number of license slots | [optional]
**companyid** | **int** | Company id | [optional]
**courses** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner[]**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md) |  | [optional]
**expirydate** | **int** | License expiry date | [optional] [default to null]
**id** | **int** | license ID | [optional]
**instant** | **int** | Instant access - 0 &#x3D; no, 1 &#x3D; yes | [optional]
**name** | **string** | License name | [optional]
**parentid** | **int** | Parent license id | [optional]
**program** | **int** | Program pf courses 0 &#x3D; no, 1 &#x3D; yes | [optional]
**reference** | **string** | License reference | [optional]
**type** | **int** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator | [optional]
**used** | **int** | Number allocated | [optional] [default to null]
**validlength** | **int** | Course access length (days) | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
