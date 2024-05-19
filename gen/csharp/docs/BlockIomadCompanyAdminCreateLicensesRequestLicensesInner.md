# Org.OpenAPITools.Model.BlockIomadCompanyAdminCreateLicensesRequestLicensesInner
one or many licenses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allocation** | **int** | Number of license slots | [optional] [default to null]
**Clearonexpire** | **int** | Clear license assignments on expire - 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**Companyid** | **int** | Company id | [optional] [default to null]
**Courses** | [**List&lt;BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner&gt;**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md) |  | [optional] 
**Cutoffdate** | **int** | License cut off date (int &#x3D; timestamp) | [optional] [default to null]
**Expirydate** | **int** | License expiry date (int &#x3D; timestamp) | [optional] [default to null]
**Instant** | **int** | Instant access - 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**Name** | **string** | License name | [optional] [default to "null"]
**Parentid** | **int** | Parent license id | [optional] [default to null]
**Program** | **int** | Program pf courses 0 &#x3D; no, 1 &#x3D; yes | [optional] [default to null]
**Reference** | **string** | License reference | [optional] [default to "null"]
**Startdate** | **int** | Date from which the liucense is available (int &#x3D; timestamp)  | [optional] [default to null]
**Type** | **int** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator | [optional] [default to null]
**Used** | **int** | Number how often the lic can be allocated | [optional] [default to null]
**Validlength** | **int** | Course access length (days) | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

