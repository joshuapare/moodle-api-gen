# MoodleClient.Model.BlockIomadCompanyAdminEditLicensesRequestLicensesInner
one or many licenses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Allocation** | **int** | Number of license slots | [optional] 
**Companyid** | **int** | Company id | [optional] 
**Courses** | [**List&lt;BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner&gt;**](BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner.md) |  | [optional] 
**Expirydate** | **int** | License expiry date | [optional] [default to null]
**Id** | **int** | license ID | [optional] 
**Instant** | **int** | Instant access - 0 &#x3D; no, 1 &#x3D; yes | [optional] 
**Name** | **string** | License name | [optional] 
**Parentid** | **int** | Parent license id | [optional] 
**Program** | **int** | Program pf courses 0 &#x3D; no, 1 &#x3D; yes | [optional] 
**Reference** | **string** | License reference | [optional] 
**Type** | **int** | License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator | [optional] 
**Used** | **int** | Number allocated | [optional] [default to null]
**Validlength** | **int** | Course access length (days) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

