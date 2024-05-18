# # BlockIomadCompanyAdminCreateLicensesRequestLicensesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocation** | **int** | Number of license slots | [optional] [default to null]
**clearonexpire** | **int** | Clear license assignments on expire - 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**companyid** | **int** | Company id | [optional] [default to null]
**courses** | [**\OpenAPI\Client\Model\BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner[]**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md) |  | [optional]
**cutoffdate** | **int** | License cut off date (int &#x3D; timestamp) | [optional] [default to null]
**expirydate** | **int** | License expiry date (int &#x3D; timestamp) | [optional] [default to null]
**instant** | **int** | Instant access - 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**name** | **string** | License name | [optional] [default to 'null']
**parentid** | **int** | Parent license id | [optional] [default to null]
**program** | **int** | Program pf courses 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**reference** | **string** | License reference | [optional] [default to 'null']
**startdate** | **int** | Date from which the liucense is available (int &#x3D; timestamp) | [optional] [default to null]
**type** | **int** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator | [optional] [default to null]
**used** | **int** | Number how often the lic can be allocated | [optional] [default to null]
**validlength** | **int** | Course access length (days) | [optional] [default to null]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
